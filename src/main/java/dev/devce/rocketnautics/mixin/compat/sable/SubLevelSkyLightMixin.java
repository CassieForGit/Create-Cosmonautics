package dev.devce.rocketnautics.mixin.compat.sable;

import dev.ryanhcode.sable.companion.math.BoundingBox3dc;
import dev.ryanhcode.sable.companion.math.Pose3dc;
import dev.ryanhcode.sable.sublevel.ClientSubLevel;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.LightLayer;
import org.joml.Vector3d;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ClientSubLevel.class)
public abstract class SubLevelSkyLightMixin{
    private static final double MAX_SKYLIGHT_SAMPLE_Y = 1500.0;
    @Inject(
            method = "computeSubLevelSkyLight",
            at = @At("HEAD"),
            cancellable = true
    )
    private void fixHighAltitudeSkyLight(Pose3dc pose, CallbackInfoReturnable<Integer> cir){
        final ClientSubLevel subLevel = (ClientSubLevel) (Object) this;
        final BoundingBox3dc bounds = subLevel.boundingBox();
        final Vector3d center = new Vector3d();
        bounds.center(center);
        // Use Sable's normal behaviour below Y1500.
        if (center.y() <= MAX_SKYLIGHT_SAMPLE_Y) {
            return;
        }
        final ClientLevel level = subLevel.getLevel();
        final int skyLight = level.getBrightness(
                LightLayer.SKY,
                BlockPos.containing(
                        center.x(),
                        MAX_SKYLIGHT_SAMPLE_Y,
                        center.z()
                )
        );
        cir.setReturnValue(skyLight);
    }
}