# Requirements analysis

Network Clipboard is a program that makes it possible to cut, copy and paste text across multiple devices.

## Features
* When using cut or copy on text the computer sends the data to a database, where other connected devices can read it from and with that update their clipboards.
* Selecting text from the history to be on the clipboard.
* Pause the system so that the clipboard on a certain devise will not be updated from the database, but it still writes to it.
* Stop the program so that no sending to or receiving from the database occurs, but you can still access the current history.
* Clear the URI and local history from the device.
* Graphical user interface.

## Getting Started
* Make a [MongoDB Atlas](https://www.mongodb.com/cloud/atlas) user (or use existing one)
* Make a Cluster with a user to it that can write and read (for new users: complete the tutorial)
* Get the access link from "clusters > Connect > Connect your application" with the options Driver=Java and Version="4.1 or later".
* After starting the application put the access link into the text field next to the connect button and press connect. (The access link is stored in user preferences, so you dont have to enter it again)
* Do the same with all computers that you want to connect together, with links that connect to the same cluster. (you can use the same link on them all)
* **Remember to allow all the devices ip addresses to connect to the database under "Network Access" on the left menu on the MongoDB Atlas website!**

## Requirements
* Windows 10 or debian based linux
* Java 11 (or newer that is backwards compatible)
* Abte to use [MongoDB Atlas](https://www.mongodb.com/cloud/atlas) 

## Limitations
* Only plain text works. When cutting or copying files they can not be pasted on other devices.

## Further Development Ideas
* Making the program with something more commonly found on devices than java.
* Extending to work with some file types (not only plain text).
