
import java.text.DecimalFormat;

/**
 * A class to create a book item for shopping cart.
 *
 * @author Nathan Mackenzie
 * @version 1.0
 * @since 1.0
 */
public class Book extends Product {

    DecimalFormat bf = new DecimalFormat("$#.00");
    private final String author;
    private final String title;
    private boolean hardCover;

    /**
     * Constructor to set default parameters for the book and retrieves the
     * ProductID and price values from the Product class.
     *
     * @param productID int - numerical ID of the item
     * @param price double - price before taxes are applied
     * @param author String - name of the author
     * @param title String - title of the book
     */
    public Book(int productID, double price, String author, String title) {

        super(productID, price);
        this.author = author;
        this.title = title;
    }

    /**
     * Checks if the book is a hard cover or not
     *
     * @return boolean - true if the book is a hardcover
     */
    public boolean isHardCover() {

        return true;
    }

    /**
     * Sets the value for hard cover and assigns it to hardcover variable
     *
     * @param hardCover boolean - if book is a hardcover either true or false
     */
    public void setHardCover(boolean hardCover) {

        this.hardCover = hardCover;
    }

    /**
     * Retrieves the authors name
     *
     * @return String - returns the authors name
     */
    public String getAuthor() {

        return author;
    }

    /**
     * Retrieves the title
     *
     * @return String - returns the title
     */
    public String getTitle() {

        return title;
    }

    /**
     * Converts all data to a string to be displayed
     *
     * @return String - returns the string to be displayed
     */
    @Override
    public String toString() {

        return "Product ID: " + getProductID() + ", Price: " + bf.format(getPrice()) + ", Author: "
                + getAuthor() + ", Title: " + getTitle() + ", HardCover: " + isHardCover() + "\n";
    }
}
