import java.util.*;
import java.io.*;

public class OneTimePad {
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
        int count = 1;
        String encodedText = "";
        for (int cryptIndex = 0; cryptIndex < cryptText.length(); cryptIndex++) {
            char cryptTextLetter = Character.toLowerCase(cryptText.charAt(cryptIndex));
            int cryptTextNumber = charToInt(cryptTextLetter);
            char originalLetter = Character.toLowerCase(original.charAt(cryptIndex));
            // System.out.println("\nOriginal letter is " + originalLetter);
            count++;
            int originalToNumber = charToInt(originalLetter);
            // System.out.println("\nNumber value of the original letter is " + originalToNumber);
            int newCharNum = originalToNumber + count;
            // System.out.println("\nThe new character value is " + newCharNum + " includes the addition of " + count);
            char newLetter = intToChar(newCharNum);
            // System.out.println("\nThe new encrypted character is " + newLetter);
            encodedText = encodedText + Character.toString(newLetter);
      }
      System.out.println("\nThe new encrypted text is " + encodedText);
      return encodedText;
    }

	public static String decipher(String original, String cryptText) {
    // System.out.println("strings passed in are " + original + " " + cryptText);
    int count = 1;
    String decodedText = "";
    for (int cryptIndex = 0; cryptIndex < cryptText.length(); cryptIndex++) {
      char cryptTextLetter = Character.toLowerCase(cryptText.charAt(cryptIndex));
      int cryptTextNumber = charToInt(cryptTextLetter);
      count++;
      char originalLetter = Character.toLowerCase(original.charAt(cryptIndex));
      // System.out.println("\nOriginal letter is " + originalLetter);
      int originalToNumber = charToInt(originalLetter);
      // System.out.println("\nNumber value of the original letter is " + originalToNumber);
      int newCharNum = originalToNumber - count;
      // System.out.println("\nThe new character value is " + newCharNum + " includes the addition of " + count);
      char newLetter = intToChar(newCharNum);
      // System.out.println("\nThe new encrypted character is " + newLetter);
      decodedText = decodedText + Character.toString(newLetter);
    }
    System.out.println("\nThe new decrypted text is " + decodedText);
    return decodedText;

	}

    public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int input = 0;
      String key = "";
      String message = "";
      String encoded = "";
      int keyLength = 0;
      int messageLength = 0;
      String ciphertext = "";
      while (input != 4) {

        System.out.println("\nChoose an option");
        System.out.println("Enter key press 1");
        System.out.println("Encrypt press 2");
        System.out.println("Decrypt press 3");
        System.out.println("Quit press 4");
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
            encoded = encipher(message, key);
          } else {
            System.out.println("\nYour key need to be the same length as your message!\nPlease try again\n");
            continue;
          }
        }
        if (input == 3) {
          System.out.println("Decrypting");
          decipher(encoded, key);
        }
        if (input == 4) {
          System.out.println("Exiting");
          System.exit(0);
        }
        ciphertext = "\nThis is my message " + encoded + "\n" + "This is my secret key " + key + '\n';
        System.out.print(ciphertext);
      }

    }
}
