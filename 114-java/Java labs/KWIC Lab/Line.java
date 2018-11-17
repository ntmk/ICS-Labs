package lab5;

/**
 * Key word in context program with reading and writing files in java.
 *
 * @author Nathan Mackenzie
 * @version 1.0
 * @since 1.0
 */
public class Line implements Comparable<Line> {

    /**
     * Instance variables and types being declared
     *
     */
    public String lineOfWords;
    private int n;
    private String[] words;

    /**
     * Class constructor setting default values and splitting String object into
     * an array
     *
     * @param s String object being passed to the constructor
     * @throws IllegalArgumentException if the object passed doesn't contain 
     * anything
     */
    public Line(String s) {
        if (s == null) {
            throw new IllegalArgumentException("There is nothing here to process");
        }
        lineOfWords = s;
        words = s.split(" ");
    }

    /**
     * Method to return value at a set position within the array
     *
     * @param n positive integer to determine what index to access in the array
     * @return The value at the specified index
     * @throws IllegalArgumentException if passed a negative integer
     */
    public String getWord(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be a positive integer.");
        }
        words = lineOfWords.split(" ");
        return words[n];
    }

    /**
     * Determines the current length of the array
     *
     * @return returns the numerical value of its length
     */
    public int numWords() {
        return words.length;
    }
    
    /*
    * Converts object to string 
    *
    */
    @Override
    public String toString() {
        return lineOfWords;
    }
    
    /*
    * Compares two lines to check if both items are the same
    *
    */
    @Override
    public int compareTo(Line o) {
        String s = this.toString().toUpperCase();
        String s2 = o.toString().toUpperCase();
        return s.compareTo(s2);
    }
}
