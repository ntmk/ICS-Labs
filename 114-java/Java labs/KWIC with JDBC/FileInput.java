package Lab6;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/**
 * Key word in context program with reading and writing files in java.
 * 
 * @author Nathan Mackenzie
 * @version 1.0
 * @since 1.0
 */
public class FileInput implements LineIterator {
    
    /**
     * Instance variables and types being declared
     *
     */
    private final ArrayList<String> words;
    private int index;
    private final Scanner input;
    
    /**
     * Constructor to set defaults for declared variables. 
     * 
     * @param filename String type object
     * @throws FileNotFoundException If no file is found
     */
    public FileInput(String filename) throws FileNotFoundException {
        if (filename == null) {
            throw new FileNotFoundException("I didnt find a file to read");
        }
        words = new ArrayList<>();
        this.index = 0;
        input = new Scanner(new File(filename));
        
        while (input.hasNextLine()) {
            words.add(input.nextLine());
        }
        input.close();        
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
        temp = new Line(words.get(index));
        index = index + 1;
        return temp;
    }
}
