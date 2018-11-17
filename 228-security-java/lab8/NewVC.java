import java.util.*;
import java.io.*;

public class Vigenere {
    char[] [] = new [] [] {
    {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'},
	{'B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','A'},
	{'C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','A','B'},
    {'D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','A','B','C'},
    {'E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','A','B','C','D'},
    {'F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','A','B','C','D','E'},
    {'G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','A','B','C','D','E','F'},
    {'H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','A','B','C','D','E','F','G'},
    {'I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','A','B','C','D','E','F','G','H'},
    {'J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','A','B','C','D','E','F','G','H','I'},
    {'K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','A','B','C','D','E','F','G','H','I','J'},
    {'L'.'M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','A','B','C','D','E','F','G','H','I','J','K'},
    {'M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','A','B','C','D','E','F','G','H','I','J','K','L'},
    {'N','O','P','Q','R','S','T','U','V','W','X','Y','Z','A','B','C','D','E','F','G','H','I','J','K','L','M'},
    {'O','P','Q','R','S','T','U','V','W','X','Y','Z','A','B','C','D','E','F','G','H','I','J','K','L','M','N'},
    {'P','Q','R','S','T','U','V','W','X','Y','Z','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O'},
    {'Q','R','S','T','U','V','W','X','Y','Z','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P'},
    {'R','S','T','U','V','W','X','Y','Z','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q'},
    {'S','T','U','V','W','X','Y','Z','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R'},
    {'T','U','V','W','X','Y','Z','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S'},
    {'U','V','W','X','Y','Z','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T'},
    {'V','W','X','Y','Z','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U'},
    {'W','X','Y','Z','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V'},
    {'X','Y','Z','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W'},
    {'Y','Z','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X'},
    {'Z','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y'}
    };
    // method to convert a character to an integer
    public static int charToInt(char l) {
        int numericValue = (int) l;
        return numericValue;
    }
    // method to convert an integer to a character
    public static char intToChar(int i) {
        char character = (char) i;
        return character;
    }
    // encrypts passed in plain text message to unreadable form
    public static String encipher(String original, String cryptText) {
		//instead for loop of alphabet for each char in the key while less than original length
		//fin the corresponding letter at that index
		for (int i = 0; i < original.length; i++) {
			
		}
        return encodedText;
    }
    //
    public static String decipher(String original, String cryptText) {

        return decodedText;
    }
    //
    public static String readFile(String path) {
        String text = "";
        try {
            FileReader fr = new FileReader(path);
            BufferedReader br = new BufferedReader(fr);
            String currentLine = "";

            while ((currentLine = br.readLine()) != null) {
                // System.out.println("the contents of the file being read are " + currentLine);
                text += currentLine;
            }
            br.close();
        } catch (Exception e) {
            System.out.println("The file could not be read");
        }
        // System.out.println(text);
        return text;
    }
    //
    public static String writeFile(String fileName, String text) {
        try {
            FileWriter fw = new FileWriter(fileName);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(text);
            // System.out.println("the contents of the file being written are " + text);
            bw.close();
        } catch (Exception e) {
            System.out.println("The file could not be read");
        }
        System.out.println("Complete: Your file is ready");
        return "Complete: Your file is ready";
    }
    //
    public static String cryptAnalysis(String cryptText) {

    }
    //
    protected static void menu() {
        System.out.println("====================");
        System.out.println("\nChoose an option\n");
        System.out.println("====================");
        System.out.println("Encrypt options Press 1");
        System.out.println("Decrypt options Press 2");
        System.out.println("Crypt Analysis Press 3");
        System.out.println("Return to main menu: Press 4");

    }
    //
    public static void main(String[] args) {

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
            }

            catch (InputMismatchException e) {
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
                        encoded = encipher(text, key);
                        System.out.println("\nThe encrypted text is:\n\n" + encoded + "\n\n");
                        writeFile(writePath, encoded);
                        System.out.println("File has been saved");
                    }
                }

                if (input == 2) {
                    Scanner pathScnr = new Scanner(System.in);
                    System.out.println("\nEnter file path you want to encrypt");
                    String path = pathScnr.nextLine();
                    text = readFile(path);
                    System.out.println("File is ready");
                    System.out.println("To display and save file Press 1");
                    input = scnr.nextInt();
                    if (input == 1) {
                        Scanner writeScnr = new Scanner(System.in);
                        System.out.println("Enter the name for saved file");
                        String writePath = writeScnr.nextLine();
                        encoded = encipher(text, key);
                        System.out.println("\nThe encrypted text is:\n\n" + encoded + "\n\n");
                        writeFile(writePath, encoded);
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
                        decoded = decipher(text, key);
                        System.out.println("\nThe decrypted text is:\n\n" + decoded + "\n\n");
                        writeFile(writePath, decoded);
                        System.out.println("File has been saved");
                    }
                }

                if (input == 2) {
                    Scanner pathScnr = new Scanner(System.in);
                    System.out.println("\nEnter file path you want to decrypt");
                    String path = pathScnr.nextLine();
                    text = readFile(path);
                    System.out.println("File is ready");
                    System.out.println("To display and save file Press 1");
                    input = scnr.nextInt();

                    if (input == 1){
                        Scanner writeScnr = new Scanner(System.in);
                        System.out.println("Enter the name of the saved file");
                        String writePath = writeScnr.nextLine();
                        decoded = decipher(text, key);
                        System.out.println("\nThe decrypted text is:\n\n" + decoded + "\n\n");
                        writeFile(writePath, decoded);
                        System.out.println("File has been saved");
                    }
                }
            }

            if (input == 3) {
                Scanner pathScnr = new Scanner(System.in);
                System.out.println("\nEnter file you want to analyze");
                String path = pathScnr.nextLine();
                text = readFile(path);
                System.out.println("File is ready");
                System.out.println("To display analysis Press 1");
                input = scnr.nextInt();

                if (input == 1){
                    String analysis = cryptAnalysis(text);
                    System.out.println("returned is " + analysis);
                }
            }

            if (input == 4) {
                System.out.println("\nExiting");
                System.exit(0);
            }
        }
    }
}
