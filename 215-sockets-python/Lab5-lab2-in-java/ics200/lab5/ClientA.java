package ics200.lab5;
import java.util.*;
import java.net.Socket;
import java.io.*;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
// You​ ​will​ ​use​ ​a​ ​single​ ​​BufferedOutputStream​​ ​and​ ​a​ ​single
// BufferedInputStream​​ ​to​ ​send​ ​and​ ​receive​ ​all​ ​data

public class ClientA {
	// print bytes
	public static void printBytes(byte[] a){
        for (int i = 0; i < a.length; i++) {
            System.out.println("values in byte array position " + i + " is " + a[i]);
        }
	}

	// Method to determine operator and correctly set bits
	// Also converts and returns an integer
	public static int operatorManager(String operator) {

		int newOperatorValue = 0;
		int result = 0;

		if (operator.contains("+")) {

			newOperatorValue = 1<<0;
			// System.out.println("the binary value for operator is " + Integer.toBinaryString(newOperatorValue));
			return newOperatorValue;
		}
		if (operator.contains("-")) {

			newOperatorValue = 1<<1;
			// System.out.println("the binary value for operator is " + Integer.toBinaryString(newOperatorValue));
			return newOperatorValue;
		}
		if (operator.contains("*")) {

			newOperatorValue = 1<<2;
			// System.out.println("the binary value for operator is " + Integer.toBinaryString(newOperatorValue));
			return newOperatorValue;
		}
		return 0;
	}

	public static void main(String[] args) {

		// Assign command line arguments to variables
		String host = args[0];
		int port = Integer.parseInt(args[1]);
		int operator = operatorManager(args[2]);
		int count = 0;
		byte[] BUFF_SIZE = new byte[10];
		byte[] values = new byte[10];
		byte[] serverResult = new byte[4];
		// System.out.println("args 2 is " + operator);

		values[0] = (byte)operator;
		// printBytes(values);
		// System.out.println("Current status of value is "  + values);
		//for packing ints use
		// int x=1<<4;
        // int y=2;
        // int z=x|y;
		for (int i = 3; i < args.length; i++) {
			count++;
		}
		values[1] = (byte)count;
		// printBytes(values);
		// System.out.println("Current status of value is "  + values);
		String calcValues = operator + " " + count;
		int b = 2;
		// For loop to create packed bytes to a string for server to calculate
		for (int i = 3, j = 4; i < args.length && j <= args.length; i++, j++){
			int n = 0;
			int n1 = 0;
			// System.out.println("i is " + i + " j is " + j);
			int x = 0;
			int y = 0;
			if (i == args.length-1) {
			n = Integer.parseInt(args[i]);
			n1 = 0;
				x = n<<4;
				y = x|n1;
				// System.out.println("Value of i is " + n + " value of n1 is " + n1);
			}else{
				n = Integer.parseInt(args[i]);
				n1 = Integer.parseInt(args[j]);
				// System.out.println("Value of i is " + n + " value of n1 is " + n1);
				x = n<<4;
				y = x|n1;
			}

			values[b] = (byte)y;
			// printBytes(values);
			b++;
			// calcValues += " " + y;
			i++;
			j++;
			// System.out.println("The string value of each number is " + operator);


		}

		// System.out.println("I recieved host: " + host + ", port: " + port +
		// ", operator: " + operator + " count of the values to be calculated is " + count);
		// System.out.println("the current byte array holds :\n");
		// printBytes(values);
		// Create client side socket
		Socket clientSocket;
		BufferedOutputStream bout;
		BufferedInputStream bin;

		try {

			//recieve ready message
			clientSocket = new Socket(host, port);
			// System.out.println("Client socket was created");
			bin = new BufferedInputStream(clientSocket.getInputStream());
			int bytes = bin.read(BUFF_SIZE);
			// System.out.println("bytes is " + bytes);
			String data = new String(BUFF_SIZE, 0, bytes);
			// System.out.println(data);
			// bin.close();

			//send byte array of values here
			// send operator and numbers to server
			bout = new BufferedOutputStream(clientSocket.getOutputStream());
			// System.out.println("The data being sent is " + values);
            bout.write(values);
			bout.flush();

			//read in byte array here then unpack result
			// recieves the result after calculation
			bin.read(serverResult, 0, 4);
			int result = 0;
			int mask = 0xff;
			result = (byte)((serverResult[3] & mask)>>24);
			// System.out.println("The result is " + result);
			result = (byte)((serverResult[2] & mask)>>16);
			// System.out.println("The result is " + result);
			result = (byte)((serverResult[1] & mask)>>8);
			// System.out.println("The result is " + result);
			result = (byte)((serverResult[0] & mask)>>0);
			// System.out.println("The result is " + result);
			// printBytes(serverResult);
			// System.out.println("The result is " + result);
			System.out.println(result);
			clientSocket.close();
		}

		catch (Exception e) {

			System.out.println("Socket creation failed " + e);

		}
	}
}
