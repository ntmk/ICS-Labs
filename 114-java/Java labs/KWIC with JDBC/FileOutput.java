package Lab6;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Key word in context program with reading and writing files in java.
 *
 * @author Nathan Mackenzie
 * @version 1.0
 * @since 1.0
 */
public class FileOutput extends IndexOutput {

    /**
     * Instance variables and types being declared
     *
     */
    public PrintWriter pw;
    public File f;

    /**
     * Constructor to set defaults for declared variables
     *
     * @param sort Sorter type object
     * @param filename String type object
     */
    public FileOutput(Sorter sort, String filename) {
        super(sort);
        this.f = new File(filename);
        try {
            this.pw = new PrintWriter(f);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileOutput.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Checks if there are more lines then displays those lines on screen
     * or writes them to a file
     *
     */
    @Override
    public void print() {
        
        while (sort.hasMoreLines()) {
            Line s = sort.nextLine();
            pw.println(s.toString() + ", " + s.getKey());
        }
        pw.close();
    }
}
