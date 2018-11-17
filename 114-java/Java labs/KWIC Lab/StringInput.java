package lab5;

/**
 * Key word in context program with reading and writing files in java.
 *
 * @author Nathan Mackenzie
 * @version 1.0
 * @since 1.0
 */
public class StringInput implements LineIterator {

    /**
     * Instance variables and their types being declared
     *
     */
    private final String[] words;
    private int index;

    /**
     * Class constructor setting the defaults for the instance variables
     *
     * @param s An array of type string
     */
    public StringInput(String[] s) {
        index = 0;
        words = s;
    }
    
    /**
     * True or false method to determine if more lines are present
     *
     * @return True or false depending on if there are more lines to be read
     */
    @Override
    public boolean hasMoreLines() {
        return index < words.length;
    }

     /**
     * Retrieve the next line if there is one present
     *
     * @return The next line
     */
    @Override
    public Line nextLine() {
        Line temp;
        temp = new Line(words[index]);
        index = index + 1;
        return temp;
    }
}
