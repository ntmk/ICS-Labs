import java.util.*;

public class VigenereMenu {

    static Vigenere v = new Vigenere();

    protected static void menu() {
        System.out.println("====================");
        System.out.println("\nChoose an option\n");
        System.out.println("====================");
        System.out.println("Encrypt options Press 1");
        System.out.println("Decrypt options Press 2");
        System.out.println("Crypt Analysis Press 3");
        System.out.println("Return to main menu: Press 4");
    }

    public static void vmMenu() {

        Scanner scnr = new Scanner(System.in);
        Scanner keyScnr;
        int input = 0;
        String key = "";
        String encoded = "";
        String decoded = "";
        String text = "";
        while (input != 3) {

            menu();

            try {
                input = scnr.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("\nPlease enter the corresponding number for your choice (1-4)\n");
                input = 1;
            }

            if (input == 1) {
                keyScnr = new Scanner(System.in);
                System.out.println("\nEnter secret key");
                key = keyScnr.nextLine();
                System.out.println("Enter short message directly Press 1");
                System.out.println("Upload a file Press 2");
                input = scnr.nextInt();
                if (input == 1) {
                    Scanner msgScnr = new Scanner(System.in);
                    System.out.println("\nEnter message you want to encrypt");
                    text = msgScnr.nextLine();
                    System.out.println("Message is ready");
                    System.out.println("To display and save message Press 1");
                    input = scnr.nextInt();
                    if (input == 1) {
                        Scanner writeScnr = new Scanner(System.in);
                        System.out.println("Enter the name of the saved file");
                        String writePath = writeScnr.nextLine();
                        encoded = v.encipher(text, key);
                        System.out.println("\nThe encrypted text is:\n\n" + encoded + "\n\n");
                        v.writeFile(writePath, encoded);
                        System.out.println("File has been saved");
                    }
                }
                if (input == 2) {
                    Scanner pathScnr = new Scanner(System.in);
                    System.out.println("\nEnter file path you want to encrypt");
                    String path = pathScnr.nextLine();
                    text = v.readFile(path);
                    System.out.println("File is ready");
                    System.out.println("To display and save file Press 1");
                    input = scnr.nextInt();
                    if (input == 1) {
                        Scanner writeScnr = new Scanner(System.in);
                        System.out.println("Enter the name for saved file");
                        String writePath = writeScnr.nextLine();
                        encoded = v.encipher(text, key);
                        System.out.println("\nThe encrypted text is:\n\n" + encoded + "\n\n");
                        v.writeFile(writePath, encoded);
                        System.out.println("File has been saved");
                    }
                }
            }

            if (input == 2) {
                keyScnr = new Scanner(System.in);
                System.out.println("\nEnter secret key");
                key = keyScnr.nextLine();
                System.out.println("Enter short message directly Press 1");
                System.out.println("Upload a file Press 2");
                input = scnr.nextInt();
                if (input == 1){
                    Scanner msgScnr = new Scanner(System.in);
                    System.out.println("\nEnter message you want to decrypt");
                    text = msgScnr.nextLine();
                    System.out.println("Message is ready");
                    System.out.println("To display and save message Press 1");
                    input = scnr.nextInt();
                    if (input == 1){
                        Scanner writeScnr = new Scanner(System.in);
                        System.out.println("Enter the name of the saved file");
                        String writePath = writeScnr.nextLine();
                        decoded = v.decipher(text, key);
                        System.out.println("\nThe decrypted text is:\n\n" + decoded + "\n\n");
                        v.writeFile(writePath, decoded);
                        System.out.println("File has been saved");
                    }
                }
                if (input == 2) {
                    Scanner pathScnr = new Scanner(System.in);
                    System.out.println("\nEnter file path you want to decrypt");
                    String path = pathScnr.nextLine();
                    text = v.readFile(path);
                    System.out.println("File is ready");
                    System.out.println("To display and save file Press 1");
                    input = scnr.nextInt();
                    if (input == 1){
                        Scanner writeScnr = new Scanner(System.in);
                        System.out.println("Enter the name of the saved file");
                        String writePath = writeScnr.nextLine();
                        decoded = v.decipher(text, key);
                        System.out.println("\nThe decrypted text is:\n\n" + decoded + "\n\n");
                        v.writeFile(writePath, decoded);
                        System.out.println("File has been saved");
                    }
                }
            }

            if (input == 3) {
                Scanner pathScnr = new Scanner(System.in);
                System.out.println("\nEnter file you want to analyze");
                String path = pathScnr.nextLine();
                text = v.readFile(path);
                System.out.println("File is ready");
                System.out.println("To display analysis Press 1");
                input = scnr.nextInt();
                if (input == 1){
                    String analysis = v.cryptAnalysis(text);
                    System.out.println("returned is " + analysis);
                }
            }

            if (input == 4) {
                System.out.println("\nExiting to main menu");
                Ciphers c = new Ciphers();
                c.run();

            }

        }
    }
}
