# Device Measurement Client

## Creation of JAR file

After execution of Build task (e.g. Intellij Idea From Gradle window or Build menu item)
file MeasureDeviceClient.jar should be created in build\lib project subdirectory.

## Run client

Switch into mentioned directory in separate command window (e.g. on Windows Win+R and CMD, cd ...)
and run following command (java executable location should be already assigned in path)

MAKE SURE THAT SERVER IS ALREADY RUNNING!

java.exe -jar .\MeasureDeviceClient.jar

SERVER SHOULD BE LAUNCHED BEFORE RUNNING CLIENT !
Use separate window for server process and separate window for client process.
See MeasureDeviceServer project for further info.


## Produced output

```
java.exe -jar .\MeasureDeviceClient

Message sent: Thermometer0;Thermometer;C;0
Server Response: Thermometer Thermometer0 measured out 0C, measurement No.1, overall message No.1

Message sent: Amperemeter1;Amperemeter;A;10
Server Response: Amperemeter Amperemeter1 measured out 10A, measurement No.1, overall message No.2

Message sent: Thermometer0;Thermometer;C;20
Server Response: Thermometer Thermometer0 measured out 20C, measurement No.2, overall message No.3

Message sent: Amperemeter1;Amperemeter;A;30
Server Response: Amperemeter Amperemeter1 measured out 30A, measurement No.2, overall message No.4

Message sent: Udometer0;Udometer;mm;40
Server Response: Udometer Udometer0 measured out 40mm, measurement No.1, overall message No.5

Message sent: Amperemeter2;Amperemeter;A;50
Server Response: Amperemeter Amperemeter2 measured out 50A, measurement No.3, overall message No.6

Message sent: Udometer0;Udometer;mm;60
Server Response: Udometer Udometer0 measured out 60mm, measurement No.2, overall message No.7

Message sent: Thermometer1;Thermometer;C;70
Server Response: Thermometer Thermometer1 measured out 70C, measurement No.3, overall message No.8

Message sent: Udometer2;Udometer;mm;80
Server Response: Udometer Udometer2 measured out 80mm, measurement No.3, overall message No.9

Message sent: Amperemeter0;Amperemeter;A;90
Server Response: Amperemeter Amperemeter0 measured out 90A, measurement No.4, overall message No.10

Message sent: Thermometer2;Thermometer;C;100
Server Response: Thermometer Thermometer2 measured out 100C, measurement No.4, overall message No.11

Message sent: Voltmeter2;Voltmeter;V;110
Server Response: Voltmeter Voltmeter2 measured out 110V, measurement No.1, overall message No.12

Message sent: Udometer0;Udometer;mm;120
Server Response: Udometer Udometer0 measured out 120mm, measurement No.4, overall message No.13

Message sent: Thermometer1;Thermometer;C;130
Server Response: Thermometer Thermometer1 measured out 130C, measurement No.5, overall message No.14

Message sent: Udometer0;Udometer;mm;140
Server Response: Udometer Udometer0 measured out 140mm, measurement No.5, overall message No.15

Message sent: Voltmeter0;Voltmeter;V;150
Server Response: Voltmeter Voltmeter0 measured out 150V, measurement No.2, overall message No.16

Message sent: Thermometer1;Thermometer;C;160
Server Response: Thermometer Thermometer1 measured out 160C, measurement No.6, overall message No.17

Message sent: Thermometer1;Thermometer;C;170
Server Response: Thermometer Thermometer1 measured out 170C, measurement No.7, overall message No.18

Message sent: Amperemeter0;Amperemeter;A;180
Server Response: Amperemeter Amperemeter0 measured out 180A, measurement No.5, overall message No.19

Message sent: Udometer2;Udometer;mm;190
Server Response: Your request to quit accepted and server is qoing down

Process finished with exit code 0

```