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
        // System.out.println("\nThe new encrypted text is " + encodedText);
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
        // System.out.println("\nThe new decrypted text is " + decodedText);
        return decodedText;

    }


}
