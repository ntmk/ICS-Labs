package Lab6;

/**
 * Key word in context program with reading and writing files in java.
 *
 * @author Nathan Mackenzie
 * @version 1.0
 * @since 1.0
 */
public interface LineIterator {

    /**
     * True or false method to determine if more lines are present
     *
     * @return True or false depending on if there are more lines to be read
     */
    public boolean hasMoreLines();

    /**
     * Retrieve the next line if there is one present
     *
     * @return The next line
     */
    public Line nextLine();
}
