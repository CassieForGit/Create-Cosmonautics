\[ Version used for explanation: 26.09.349. Note that it isn't a Release Build\]

The Sputnik's main way of programing is via Nodes and Wires. Easy, Quick and Intuitive.

[This video](https://www.youtube.com/watch?v=qHK7vh4MuhY) explains very well the Sputnik, however it's a tad bit outdated, so some things (like Lua Code) may not be present in the mod anymore or are changed.

if you Interract with the sputnik, you'll open it's Graph \(along 3 connected nodes, the deafults.\)

<img src="/wiki/images/Empty Sputnik Interface.png">  

[//]: # (Ignore that the image won't show in Preview, it shows itself in Github so that's all that we have to worry about.)

<p style="font-size=75%;"> Note that results may vary between new and old versions. </p>




## The *File* Tab

If you click or hover on the "File" tab you'll see 4 options: Save Graph, Open Satellite Folder, Copy JSON to Clipboard and Close & Save.

The **Save** option saves the code, simple.

The **Open Satellite Folder** opens in explorer \(or alternative file viewing progam\) the folder which contains the data of the Graph (the sputnik's code) which can be used to share code.

The **Copy JSON to Clipboard** option, unlike the one before, puts the code of your sputnik in your computer clipboard as a .JSON file, the exact same one of the compressed file in the Sat. Folder

The **Close & Save** option simply saves the code and closes the GUI. The Esc Key is already binded to this.




## The *Edit* Tab

If you click or hover on the "Options" tab you'll see 6 options: Duplicate, Delete, Select All, Disconnect All Wires, Reset Deafult Graph and Clear All Nodes.

These act on the nodes. These options are pretty intuitive, so I won't say anything about them expect for Reset Deafult Graph.

Reset Deafult Graph simply removes all Wires and Nodes and repleaces them with the deafult 3.




## The *Add* Tab

To add a **Node**, either go into the "Add" Tab from the top bars, or right click on any empty space of the Graph for the quick menu with the full add menu.
The "Add" menu displays 7 categories: Constants, Math, Logis, Sensors, Displays, Wireless and Actuators.

The **Constants** category has only three nodes: number, string and boolean.

The **Maths** Category has 4 nodes: add, subtract, multiply and divide. The basics.

The **Logic** Category has also 4 nodes: AND, OR, NOT and compare. The first three only accept booleans.
 
The **Sensors** Category has 3 nodes: Altitude, Velocity and Attitude. 

The **Displays** Category actually has only two nodes! the Display and Display Bridge.

The **Wireless** Category too has two nodes, Sputnik Link and Satellite Comms.

The **Actuators** Category has 4 nodes, Ignition Contoll, Thrust Controll, Vector Controll and Gyrodyne Controll.

Click any of the node names to add them.

The dots at the left side are the **inputs**, while the dots at the right side are the **outputs**, drag from an output dot to an input dot to connect them with a **wire**.




## The *Satellite* Tab

If you hover over the "Satellite" Tab you'll see: The name of the Sputnik, The position of the sputnik and the "Force Server Sync" button which saves the graph without exiting.




## The *View* Tab

In the "View" tab you have 6 options: Center View, Reset Zoom, Zoom in and out, Setup and Custom Design Setup

As of version 26.09.349, Setup and Custom Design Setup open the same window, called "<a href="/wiki/User Manual/Custom Design Studio.md"> Custom Design Studio (CDS) </a>"




## *The Appearance* Tab

In the "Appearance" tab you have 4 options: Modern (Blender), Oldschool (Classic), Custom Design and Configure Custom Design. The last one also opens the "<a href="/wiki/User Manual/Custom Design Studio.md"> CDS </a>" window. The first 3 options change the appeareance of the graph, changing Background, Nodes and Wires. The last one is configurable via the CDS.




<p style="font-size=200%;"> This Concludes the Basic Controlls, please checkout all of the individual options or dive straight into coding via the <a href="/wiki/User Manual/Sputnik/Nodes.md">"Nodes"</a> Lesson </p>