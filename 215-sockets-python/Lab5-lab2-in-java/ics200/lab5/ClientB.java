package ics200.lab5;
import java.util.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.*;
//a BufferedOutputStream​​ ​and​ ​a​ ​​BufferedInputStream​​ ​to​ ​send​ ​and​ ​receive​ ​the​
//​request data​ ​byte​ ​array​ ​(same​ ​as​ ​Version​ ​A​ ​for​ ​this​ ​part),​ ​and​ ​a​ ​​
//DataOutputStream​​ ​and​ ​a DataInputStream​​ ​to​ ​send​ ​and​ ​receive​ ​the​ ​final​ ​calculated​
//​integer​ ​result.

public class ClientB {

	public static int operatorManager(String operator) {

		int newOperatorValue = 0;
		int result = 0;

		if (operator.contains("+")) {

			newOperatorValue = 1<<0;
			return newOperatorValue;
		}
		if (operator.contains("-")) {

			newOperatorValue = 1<<1;
			return newOperatorValue;
		}
		if (operator.contains("*")) {

			newOperatorValue = 1<<2;
			return newOperatorValue;
		}
		return 0;
	}
	public static void printBytes(byte[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.println("values in byte array position " + i + " is " + a[i]);
		}
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
		values[0] = (byte)operator;

		for (int i = 3; i < args.length; i++) {
			count++;
		}
		values[1] = (byte)count;
		String calcValues = operator + " " + count;
		int b = 2;
		// For loop to create packed bytes to a string for server to calculate
		for (int i = 3, j = 4; i < args.length && j <= args.length; i++, j++){
			int n = 0;
			int n1 = 0;
			int x = 0;
			int y = 0;
			if (i == args.length-1) {
				n = Integer.parseInt(args[i]);
				n1 = 0;
				x = n<<4;
				y = x|n1;
			}else{
				n = Integer.parseInt(args[i]);
				n1 = Integer.parseInt(args[j]);
				x = n<<4;
				y = x|n1;
			}

			values[b] = (byte)y;
			b++;
			i++;
			j++;
		}
		// System.out.println("I recieved host: " + host + ", port: " + port + ", operator: " + operator);
		// printBytes(values);
		// Create client side socket
		Socket clientSocket;
		try {
			clientSocket = new Socket(host, port);
			// System.out.println("Client socket was created");
			// used to recieve the ready text
			BufferedReader br = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
			String ready = br.readLine();
			// System.out.println("The server sent " + ready);
			//send the data byte array BufferedOutputStream
			BufferedOutputStream bout = new BufferedOutputStream(clientSocket.getOutputStream());
			bout.write(values);
			bout.flush();
			// receive with datainput stream
			DataInputStream dis = new DataInputStream(clientSocket.getInputStream());
			dis.read(serverResult, 0, 4);
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
			System.out.println("Scoket creation failed " + e);
		}

		// Create input stream object

	}
}
