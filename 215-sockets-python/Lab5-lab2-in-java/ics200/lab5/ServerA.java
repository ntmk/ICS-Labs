package ics200.lab5;
import java.util.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.*;
// You​ ​will​ ​use​ ​a​ ​single​ ​​BufferedOutputStream​​ ​and​ ​a​ ​single
// BufferedInputStream​​ ​to​ ​send​ ​and​ ​receive​ ​all​ ​data

public class ServerA {

    // byte[] values = new byte[4];

    public static void printBytes(byte[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println("values in byte array position " + i + " is " + a[i]);
        }
	}

    // public static byte[] convertResult(int a){
    //     //shift result in this method
    //     int mask =0xff;
    //     values[0] = (byte)((a&mask)>>24);
    //     values[1] = (byte)((a&mask)>>16);
    //     values[2] = (byte)((a&mask)>>8);
    //     values[3] = (byte)((a&mask)>>0);
    //     return values;
    // }

    public static void main(String[] args) {
        int port = Integer.parseInt(args[0]);
        ServerSocket serverSocket;
        Socket acceptSocket;
        BufferedOutputStream bout;
        BufferedInputStream bin;
        byte[] clientValues = new byte[10];
        byte[] values = new byte[4];

        while (true) {
            // Creates a server socket then listens for client
            try {
                //send client ready message
                serverSocket = new ServerSocket(port);
                // System.out.println("Server socket was created");
                acceptSocket = serverSocket.accept();
                // System.out.println("Listener for client created");

                bout = new BufferedOutputStream(acceptSocket.getOutputStream());
                String ready = "READY";
                bout.write(ready.getBytes("UTF-8"));
                bout.flush();
                // bout.close();
                // unpacking numbers
                // int i = (z&0xf0)>>>4; (triple shift operators represents unsigned)
                // int j = z&0x0f;

                //recieve info to calculate
                bin = new BufferedInputStream(acceptSocket.getInputStream());
                bin.read(clientValues, 0, 10);

                // printBytes(clientValues);

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
                    bout.write(values);
                    bout.flush();
                    // bout.close();
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
                    bout.write(values);
                    bout.flush();
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
                    bout.write(values);
                    bout.flush();
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
