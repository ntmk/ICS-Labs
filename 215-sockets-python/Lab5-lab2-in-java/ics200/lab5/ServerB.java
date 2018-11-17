package ics200.lab5;
import java.util.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.*;
// use​ ​a​ ​​PrintWriter​​ ​and​ ​a​ ​​BufferedReader​​ ​to​ ​send​ ​and​ ​receive​ ​text,​ ​
// a BufferedOutputStream​​ ​and​ ​a​ ​​BufferedInputStream​​ ​to​ ​send​ ​and​ ​receive​ ​the​
// ​request data​ ​byte​ ​array​ ​(same​ ​as​ ​Version​ ​A​ ​for​ ​this​ ​part),​ ​and​ ​a​
// ​​DataOutputStream​​ ​and​ ​a DataInputStream​​ ​to​ ​send​ ​and​ ​receive​ ​the​ ​final​
// ​calculated​ ​integer​ ​result.

public class ServerB {
    public static void printBytes(byte[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println("values in byte array position " + i + " is " + a[i]);
        }
    }
    public static void main(String[] args) {
        int port = Integer.parseInt(args[0]);
        ServerSocket serverSocket;
        Socket acceptSocket;
        byte[] clientValues = new byte[10];
        byte[] values = new byte[4];
        // Creates a server socket then listens for client
        while (true) {
            try {
                serverSocket = new ServerSocket(port);
                // System.out.println("Server socket was created");
                acceptSocket = serverSocket.accept();
                // System.out.println("Listener for client created");
                //used to send ready text
                PrintWriter pw = new PrintWriter(acceptSocket.getOutputStream(), true);
                pw.println("READY");
                // recieve the data byte array
                BufferedInputStream bin = new BufferedInputStream(acceptSocket.getInputStream());
                bin.read(clientValues, 0, 10);

                // printBytes(clientValues);
                DataOutputStream dos = new DataOutputStream(acceptSocket.getOutputStream());
                if (clientValues[0] == 1<<0) {
                    // System.out.println("doing addition now");
                    // do addition
                    int result = 0;
                    for (int i = 2; i < clientValues.length; i++) {
                        int extract = clientValues[i];
                        int a = (extract&0xf0)>>>4;
                        result += a;
                        int j = extract&0x0f;
                        result += j;
                        // System.out.println("Value of a is " + a + " value of j is " + j + " and final result is " + result);
                    }
                    int mask =0xff;
                    values[3] = (byte)((result & mask)<<24);
                    // System.out.println("The result is " + values[3]);
                    values[2] = (byte)((result & mask)<<16);
                    // System.out.println("The result is " + values[2]);
                    values[1] = (byte)((result & mask)<<8);
                    // System.out.println("The result is " + values[1]);
                    values[0] = (byte)((result & mask)<<0);
                    // System.out.println("The result is " + values[0]);
                    // // values = convertResult(result);
                    // printBytes(values);
                    dos.write(values);
                    dos.flush();
                    // dos.close();
                }
                if (clientValues[0] == 1<<1) {
                    // System.out.println("doing subtraction now");
                    // do subtraction
                    int result = 0;
                    for (int i = 2; i < clientValues.length; i++) {
                        int extract = clientValues[i];
                        int a = (extract&0xf0)>>>4;
                        int j = extract&0x0f;
                        if (result == 0){
                            result = Math.abs(a);
                            result -= j;
                        } else {
                            result -= a;
                            result -= j;
                        }
                        // System.out.println("Value of a is " + a + " value of j is " + j + " and final result is " + result);
                    }
                    int mask =0xff;
                    values[3] = (byte)((result & mask)<<24);
                    values[2] = (byte)((result & mask)<<16);
                    values[1] = (byte)((result & mask)<<8);
                    values[0] = (byte)((result & mask)<<0);
                    // // values = convertResult(result);
                    // printBytes(values);
                    dos.write(values);
                    dos.flush();
                    // bout.close();
                }
                if (clientValues[0] == 1<<2) {
                    // System.out.println("doing multiplication now");
                    // do multiplication
                    int result = 1;
                    for (int i = 2; i < clientValues.length; i++) {
                        int extract = clientValues[i];
                        int a = (extract&0xf0)>>4;
                        if (a == 0) {
                            break;
                        } else {
                            result *= a;
                        }
                        int j = extract&0x0f;
                        if (j == 0) {
                            break;
                        } else {
                            result *= j;
                        }
                        // System.out.println("Value of a is " + a + " value of j is " + j + " and final result is " + result);
                    }
                    int mask =0xff;
                    values[3] = (byte)((result & mask)<<24);
                    values[2] = (byte)((result & mask)<<16);
                    values[1] = (byte)((result & mask)<<8);
                    values[0] = (byte)((result & mask)<<0);
                    // // values = convertResult(result);
                    // printBytes(values);
                    dos.write(values);
                    dos.flush();
                    // bout.close();

                }
                serverSocket.close();
            }
            catch (Exception e) {
                System.out.println("Socket creation failed " + e);
            }
        }
    }
}
