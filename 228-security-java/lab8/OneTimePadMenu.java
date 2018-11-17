import java.util.*;

public class OneTimePadMenu {

    static OneTimePad otp = new OneTimePad();

    public static void otpMenu() {
        Scanner scnr = new Scanner(System.in);
        int input = 0;
        String key = "";
        String message = "";
        String encoded = "";
        int keyLength = 0;
        int messageLength = 0;
        String ciphertext = "";
        while (input != 4) {
            System.out.println("====================");
            System.out.println("\nChoose an option");
            System.out.println("====================");
            System.out.println("\nEnter key Press 1\nYour key must be same length as message");
            System.out.println("Encrypt message: Press 2");
            System.out.println("Decrypt decrypt message: Press 3");
            System.out.println("Return to main menu: Press 4");
            try {
                input = scnr.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("\nPlease enter the corresponding number for your choice (1-4)\n");
                input = 4;
            }
            if (input == 1) {
                Scanner keyScnr = new Scanner(System.in);
                System.out.println("\nEnter secret key");
                key = keyScnr.nextLine();
                keyLength = key.length();
            }
            if (input == 2) {
                Scanner msgScnr = new Scanner(System.in);
                System.out.println("\nEnter plaintext message");
                message = msgScnr.nextLine();
                messageLength = message.length();
                if (keyLength == messageLength) {
                    encoded = otp.encipher(message, key);
                    System.out.println("\nThe new encrypted text is " + encoded);
                } else {
                    System.out.println("\nYour key need to be the same length as your message!\nPlease try again\n");
                    continue;
                }
            }
            if (input == 3) {
                System.out.println("\nDecrypting");
                String decodedText = otp.decipher(encoded, key);
                System.out.println("\nThe new decrypted text is " + decodedText);
            }
            if (input == 4) {
                System.out.println("\nExiting to main menu");
                Ciphers c = new Ciphers();
                c.run();
            }
        }
    }
}
