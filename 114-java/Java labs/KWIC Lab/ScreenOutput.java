package lab5;

/**
 * Key word in context program with reading and writing files in java.
 *
 * @author Nathan Mackenzie
 * @version 1.0
 * @since 1.0
 */
public class ScreenOutput extends IndexOutput {

    /**
     * Class constructor that calls the constructor from its parent class 
     * IndexOutput
     *
     * @param sort Sorter object from parent class
     */
    public ScreenOutput(Sorter sort) {
        super(sort);
    }
    
    /**
     * Checks if there are more lines to be displayed and outputs them to the 
     * screen
     *
     */
    @Override
    public void print() {
        while (sort.hasMoreLines()) {
            System.out.println(sort.nextLine());
        }
    }
}
