package lab5;

/**
 * Key word in context program with reading and writing files in java.
 * 
 * @author Nathan Mackenzie
 * @version 1.0
 * @since 1.0
 */
public class Shifter implements LineIterator{
    
    /**
     * Instance variables and types being declared
     *
     */
    private final String[] words;
    private int index;
    
    /**
     * Constructor to set defaults for declared variables splits the string of 
     * words into an array
     * 
     * @param l Line type object
     */
    public Shifter(Line l) {
        index = 0;
        words = l.toString().split(" ");        
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
        int j = index;
        int l = words.length;
        String s = words[j];
        
        for (int i = 1; i < words.length; i++) {
            j++;
            s += " " + words[j % l];
        }
        
        index++;
        return new Line (s);
    }  
}
