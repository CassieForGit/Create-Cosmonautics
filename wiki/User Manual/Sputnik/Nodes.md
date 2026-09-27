\[ Version used for explanation: 26.09.349. Note that it isn't a Release Build\]

This Lesson Explains all of the Nodes.

## Constants

There are Three Constants: the Number Constant, the String Constant and the Boolean Constant.

The Constant hold values and only have one output (Expect for tables planned for a future update).

The Number constant node can only hold a number, a string constant node only a string (A line of characters) and the Boolean only two possible values: True or False.

## Math

The Nodes in the Math Category have 2 inputs and only 1 output. Each does only what their name is: add, subtract, multiply or subtract. They can only use and output numbers.

## Logic

The Nodes in the Logic Category are all different from eachother.

The compare Node has two numeral inputs and 3 boolean _possible_ outputs. Depending on what numbers are inputed, the Node will send a True Boolean to their corresponding outputs: Equal, Higher or Lower.

## Sensors

The Nodes in the Sensor Tab you can get the following data from your spacecraft: Altitude, Velocity and Attitude. (Distance from y=0, Speed, Rotation)

## Display

The Display nodes Display the values that are inputed, they support all value types. Display only displays the value, and the display bridge does too however due to it being a different node type it should also have another behavior, however i could not find it or is broken as of the time of writing.

## Wireless

The two Wireless nodes output values that may be external to the current sputnik. And require an ID.

The Sputlink Link Node recieves or sends a number from zero to fifteen from or to from a Sputlink Link Block. The ID is Configurable only by changing the Id from the GUI.

The Satellite Comms Node can send or recieve a value of any type and range. The Chanel ID is configurable either via the Channel Input or via the GUI. It can also check from which Sputnik (or more with extra mods (Eg. CC:Tweaked)) the signal was sent from.

## Actuators

The actuator nodes can control thrusters and Gyrodynes. The Ignition Control only works on a solid rocket engine, the Thrust Control only works on liquid rocket engines, The Vector Control only works on a Vector Thruster and the Gyrodyne only on a Gyrodyne.

All Require an ID for their correpsonding engine or Gyrodyne.



This Concludes the Nodes lesson.