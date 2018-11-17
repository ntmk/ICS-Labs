import java.util.*;

public class Ciphers {

    static OneTimePadMenu otp = new OneTimePadMenu();
    static VigenereMenu vm = new VigenereMenu();
    static int input = 0;

    public static void run() {

        while (input != 3) {

            Scanner scnr = new Scanner(System.in);
            System.out.println("====================");
            System.out.println("\nChoose a Cipher");
            System.out.println("====================");
            System.out.println("\nFor One Time Pad cipher: Press 1");
            System.out.println("For Vigenere cipher: Press 2");
            System.out.println("To exit program: Press 3");

            input = scnr.nextInt();

            if (input == 1) {
                System.out.println("\nYou have chosen the One Time Pad cipher\n\nNOTE: Your encryption key must be the same length as the text to encrypt!");
                otp.otpMenu();
            }
            if (input == 2) {
                System.out.println("\nYou have chosen the Vigenere cipher");
                vm.vmMenu();
            }
            if (input == 3) {
                System.out.println("Closing program now, Thanks for encrypting!");
                System.exit(0);
            }
        }
    }

    public static void main(String[] args) {

        Ciphers c = new Ciphers();
        c.run();

    }
}
