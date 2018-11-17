package lab5;

/**
 * Key word in context program with reading and writing files in java.
 *
 * @author Nathan Mackenzie
 * @version 1.0
 * @since 1.0
 */
public abstract class IndexOutput {

    /**
     * Instance variable and type declaration
     *
     */
    protected Sorter sort;

    /**
     * Class constructor setting default value
     *
     * @param sort Object containing data
     */
    public IndexOutput(Sorter sort) {
        this.sort = sort;
    }

    /**
     * Print method declaration to be implemented by another class
     *
     */
    public abstract void print();
}
