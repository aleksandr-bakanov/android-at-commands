# android-at-commands
This is a tool to collect results of executing available AT-commands on rooted android device.
## Purpose
The purpose of creating this application is providing tool which can automatically collect
information about communication processor on android device.
## Attention!
Your device **must be rooted** before running this application.
Check also that **SELinux status** is 'Permissive' (Settings > About phone > SELinux status).
This is required to open /dev/smd11 device. SELinux status may be changed to permissime by
running "su setenforce 0" (see [this question on stackoverfow](http://stackoverflow.com/questions/30742524/why-cant-i-open-write-from-a-serial-port-on-android))
and restarting device.
## How to use
Currently tool provides two modes - automatic scan and console mode:
1. Automatic scan - runs `AT+CLAC` and `AT$QCCLAC` commands to collect available AT commands
on device and then runs collected commands one by one, saving results. Report is saved
in HTML format and can be pulled from device (`adb pull sdcard/androidatcommands.html`).
Report provides results of processed commands and also commands description with
references to resources where description has been taken from.
**All commands are executed in safe way (read only)**.
2. Console mode - allows to run commands manually by typing them into 'Emission' field
and pressing Enter.
## Contribution
Description isn't provided for all commands, because I have to search for it all over
the Internet. Sometimes all I can find is chinese manuals or nothing at all. In such cases
I left `TODO` as description, hoping that community will help me to complete this.

Your contribution in this project will make me (and android developers community) happy :)
## Thanks
Thanks to developers of [android-serialport-api](https://code.google.com/archive/p/android-serialport-api/)
project.
