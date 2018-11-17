import java.util.*;
import java.io.*;

public class Vigenere {
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
        // System.out.println("strings passed in are " + original + " " + cryptText);
        int tracker = 0;
        int count = 1;
        int cryptIndex = 0;
        int remainingText = original.length();
        String encodedText = "";
        while (tracker < original.length()) {

            for (cryptIndex = 0; cryptIndex < cryptText.length(); cryptIndex++) {

                if (cryptIndex == cryptText.length() - 1) {
                    cryptIndex = 0;
                    count = 1;
                }
                // System.out.println("The tracker value is " + tracker + " the length of original text is " + original.length());
                if (tracker == original.length()) {
                    // System.out.println("the Tracker is the same as length breaking out");
                    break;
                }
                char cryptTextLetter = cryptText.charAt(cryptIndex);
                int cryptTextNumber = charToInt(cryptTextLetter);
                char originalLetter = original.charAt(tracker);
                // System.out.println("\nOriginal letter is " + originalLetter);
                count++;
                // System.out.println("the count value in encryption is " + count);
                int originalToNumber = charToInt(originalLetter);
                // System.out.println("\nNumber value of the original letter is " + originalToNumber);
                int newCharNum = originalToNumber - count;
                // System.out.println("\nThe new character value is " + newCharNum + " includes the addition of " + count);
                char newLetter = intToChar(newCharNum);
                // System.out.println("\nThe new encrypted character is " + newLetter);
                encodedText = encodedText + Character.toString(newLetter);
                tracker++;
            }
        }
        // System.out.println("\nThe new encrypted text is " + encodedText);
        return encodedText;
    }

    public static String decipher(String original, String cryptText) {
        // System.out.println("strings passed in are original: " + original + " crypt: " + cryptText);
        int cryptIndex = 0;
        int tracker = 0;
        int count = 1;
        String decodedText = "";
        while (tracker < original.length()) {

            for (cryptIndex = 0; cryptIndex < cryptText.length(); cryptIndex++) {

                if (cryptIndex == cryptText.length() - 1) {
                    cryptIndex = 0;
                    count = 1;
                }
                // System.out.println("The tracker value is " + tracker + " the length of original text is " + original.length());
                if (tracker == original.length()) {
                    // System.out.println("the Tracker is the same as length breaking out");
                    break;
                }
                char cryptTextLetter = cryptText.charAt(cryptIndex);
                int cryptTextNumber = charToInt(cryptTextLetter);
                char originalLetter = original.charAt(tracker);
                // System.out.println("\nOriginal letter is " + originalLetter);
                count++;
                // System.out.println("the count value in decipher is " + count);
                int originalToNumber = charToInt(originalLetter);
                // System.out.println("\nNumber value of the original letter is " + originalToNumber);
                int newCharNum = originalToNumber + count;
                // System.out.println("\nThe new character value is " + newCharNum + " includes the addition of " + count);
                char newLetter = intToChar(newCharNum);
                // System.out.println("\nThe new encrypted character is " + newLetter);
                decodedText = decodedText + Character.toString(newLetter);
                tracker++;

            }
        }
        // System.out.println("\nThe new decrypted text is " + decodedText);
        return decodedText;

    }

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

    public static String cryptAnalysis(String cryptText) {
        char[] first = cryptText.toLowerCase().toCharArray();
        // System.out.println("The first array length is\n" + first.length);
        char[] second = cryptText.toLowerCase().toCharArray();
        // System.out.println("The second array length is\n" + second.length);
        int j = 1;
        int i = 0;
        int count = 0;
        List<Integer> counter = new ArrayList<Integer>();
        for (i = 0; i < first.length; i++) {
            // System.out.println("second index is\n" + i + "\nfirst index is\n" + (i+j));
            if ((i+j) == first.length) {
                i = 0;
                j++;
                if ((i+j) >= first.length){
                    break;
                }
                // System.out.println("Resetting and shifting j is now " + j + " value of i is " + i + " i and j together is " + (i+j));
                counter.add(count);
                count = 0;
            }
            if (second[i] != first[i+j]) {
                // System.out.println("no match");
            }else{
                count += 1;
                // System.out.println("match found " + count + " first char is " + first[i+j] + " second char is " + second[i]);

            }
        }
        int avg = 0;
        int x = 0;
        int y = 0;
        int z = 0;
        for (int a = 0, b = 0; a < counter.size(); a++, b++) {
            if (counter.get(a) < 0) {
                continue;
            }
            x = counter.get(a);
            if (x > y) {
                y = x;
                x = counter.get(a);
            }
            else if (x > z) {
                z = x;
                x = counter.get(a);
            }
            // System.out.println("The 2 largest matches are " + y + " and " + z);
            avg = y + z;
            //        	 System.out.println("The total of the 2 is " + avg);
        }
        avg = counter.size() / avg;
        System.out.println(avg);
        return "";
    }

    protected static void menu() {

        System.out.println("====================");
        System.out.println("\nChoose an option\n");
        System.out.println("====================");
        System.out.println("Encrypt options Press 1");
        System.out.println("Decrypt options Press 2");
        System.out.println("Crypt Analysis Press 3");
        System.out.println("Return to main menu: Press 4");

    }

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
