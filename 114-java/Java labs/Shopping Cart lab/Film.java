
import java.text.DecimalFormat;

/**
 * A class to create a film item for shopping cart.
 *
 * @author Nathan Mackenzie
 * @version 1.0
 * @since 1.0
 */
public class Film extends Product {

    DecimalFormat ff = new DecimalFormat("$#.00");

    /**
     * Types of film formats
     */
    public static enum format {

        /**
         * dvd format
         */
        dvd,
        /**
         * bluray format
         */
        bluray,
        /**
         * vhs format
         */
        vhs
    };
    private final String title;
    private final String director;
    private format form;

    /**
     * Constructor to set default parameters for the book and retrieves the
     * ProductID and price values from the product class
     *
     * @param productID int - numerical ID of the film
     * @param price double - price before taxes
     * @param title String - title of the film
     * @param director String - who directed the film
     */
    public Film(int productID, double price, String director, String title) {

        super(productID, price);
        this.title = title;
        this.director = director;
        form = format.dvd;
    }

    /**
     * Set the format of film to either dvd, bluray, vhs
     *
     * @param form enum - sets the format of the film and assigns it to form
     */
    public void setFormat(format form) {

        this.form = form;
    }

    /**
     * Retrieves the format of the film
     *
     * @return enum - returns what format is returned
     */
    public format getFormat() {

        return form;
    }

    /**
     * retrieves the title of the film
     *
     * @return String - returns the title
     */
    public String getTitle() {

        return title;
    }

    /**
     * Retrieves the director of the film
     *
     * @return String - returns the director
     */
    public String getDirector() {

        return director;
    }

    /**
     * Converts all data to a string to be displayed
     *
     * @return String - returns the formatted string
     */
    @Override
    public String toString() {

        return "Product ID: " + getProductID() + ", Price: " + ff.format(getPrice()) + ", Director: "
                + getDirector() + ", Title: " + getTitle() + ", Format: " + getFormat() + "\n";
    }
}
