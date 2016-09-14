
## Hello/Goodbye App
##### Author  : Ankush Chauhan
##### E-Mail  : achauhan4@student.gsu.edu

### Steps to test the Work:

#### Using Git and ADB on Linux / OS X
###### _Before you can run this application on the Android Emulator, you must [create an AVD](https://developer.android.com/tools/devices/managing-avds.html)._
____
###### To run this application:
1. Clone the repository.
```bash
git clone https://github.com/ankush2611/Hello_World_Android.git
```
Change directory to project-root.
```
cd Hello_World_Android
```
___
2. __Open the AVD Manager and launch a virtual device__
In the Virtual Devices view, select an AVD and click __Start__.

Install the application

```bash
adb install app.apk
```

See available devices / emulators
```bash
adb devices
```
###### List of devices attached should not be empty!

Launch ___Hello World Android___ app from the launcher.
____

## Screenshots
Enter your name:
![Enter your name](https://github.com/ankush2611/Hello_World_Android/blob/master/screenshots/enterName.png?raw=true "Enter your name")

Tap on Hello:
![Tap on Hello](https://github.com/ankush2611/Hello_World_Android/blob/master/screenshots/tapHello.png?raw=true "Tap on Hello")

Tap on GoodBye:
![Tap on GoodBye](https://github.com/ankush2611/Hello_World_Android/blob/master/screenshots/tapBye.png?raw=true "Tap on GoodBye")
