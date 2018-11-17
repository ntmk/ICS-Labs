package Lab6;

import java.util.ArrayList;

/**
 * Key word in context program with reading and writing files in java.
 * 
 * @author Nathan Mackenzie
 * @version 1.0
 * @since 1.0
 */
public class Sorter implements LineIterator {
    
    /**
     * Instance variables and types being declared
     *
     */
    private final ArrayList<Line> words;
    private int index;
    
    /**
     * Constructor to set defaults for declared variables
     * 
     */
    public Sorter() {
        this.index = 0;
        words = new ArrayList<>();        
    } 

    /**
     * Adds a line object to the array
     * 
     * @param s Line type object
     */
    public void addLine(Line s) {
        words.add(s);
        words.sort(null);
       }
    
    /**
     * True or false method to determine if more lines are present
     *
     * @return True or false depending on if there are more lines to be read
     */
    @Override
    public boolean hasMoreLines() {
        return index < words.size();
    }
    
    /**
     * Retrieve the next line if there is one present
     *
     * @return The next line
     */
    @Override
    public Line nextLine() {
        Line temp;
        temp = words.get(index);
        index = index + 1;
        return temp;
    }
}
