package com.eaton.devices;


import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Random;

/**
 * This class implements java socket client and simulates measurement devices messages
 * @author pamor
 *
 */

public class DeviceSocketClient {

    //socket server port on which it will listen
    private static final int PORT = 9877;

    // Number of messages
    private static final int NUMBER_OF_MESSAGES = 20;


    public static void main(String[] args) throws UnknownHostException, IOException, ClassNotFoundException, InterruptedException {


        // Define devices (Device types, measerement units)

        String[] deviceTypes = {"Thermometer", "Voltmeter", "Amperemeter", "Udometer"};
        String[] unitTypes   = {"C"          , "V"        , "A"          , "mm"};

        // Get the localhost IP address where server is running

        InetAddress host = InetAddress.getLocalHost();

        Socket             socket = null;
        ObjectOutputStream oos    = null;
        ObjectInputStream  ois    = null;

        Random rand = new Random();
        int    rint;

        for (int i=0; i<NUMBER_OF_MESSAGES; i++) {

            rint = rand.nextInt(4);

            // Simulation of device message: deviceName;deviceType;measurementUnit;measuredValue

            String msg = deviceTypes[rint] + rand.nextInt(3) + ";"  // deviceName   example Thermometer1
                    + deviceTypes[rint] + ";"                          // deviceType            Thermometer
                    + unitTypes[rint]   + ";"                          // measurementUnit       C
                    + (i*10);                                          // measuredValue         10

            // Establish socket connection to server
            socket = new Socket(host.getHostName(), PORT);

            // Write to socket using ObjectOutputStream
            oos = new ObjectOutputStream(socket.getOutputStream());
            System.out.println("\nMessage sent: " + msg);

            // If requested count of messages is reached, send request to stop, otherwise send measurement message to the server
            if (i==NUMBER_OF_MESSAGES-1)
                oos.writeObject("quit");
            else
                oos.writeObject(msg);

            // Read the server response message
            ois = new ObjectInputStream(socket.getInputStream());
            String response = (String) ois.readObject();
            System.out.println("Server Response: " + response);

            // Close resources
            ois.close();
            oos.close();
            Thread.sleep(100);

        }

    }

}