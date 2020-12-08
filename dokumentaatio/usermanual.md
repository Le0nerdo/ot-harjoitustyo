## Getting Started
* Make a [MongoDB Atlas](https://www.mongodb.com/cloud/atlas) user (or use existing one)
* Make a Cluster with a user to it that can write and read (for new users: complete the tutorial)
* Get the access link from "clusters > Connect > Connect your application" with the options Driver=Java and Version="4.1 or later".
* After starting the application put the access link into the text field next to the connect button and press connect. (The access link is stored in user preferences, so you dont have to enter it again)
* Do the same with all computers that you want to connect together, with links that connect to the same cluster. (you can use the same link on them all)
* **Remember to allow all the devices ip addresses to connect to the database under "Network Access" on the left menu on the MongoDB Atlas website!**

## Controls
* **History** click a string from the history to apply it to clipboard
* **Pause** Click the pause button to pause the system so that the clipboard on a certain devise will not be updated from the database, but it still writes to it. The Unpause button stops this effect
* **Stop** Click the stop button to stop the program so that no sending to or receiving from the database occurs, but you can still access the current history. The Unstop button stops this effect.
