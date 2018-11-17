
import java.text.DecimalFormat;

/**
 * Abstract class for products
 *
 * @author Nathan Mackenzie
 * @version 1.0
 * @since 1.0
 */
public abstract class Product {

    DecimalFormat df = new DecimalFormat("$#.00");
    private final int productID;
    private final double price;

    /**
     * Constructor setting default values
     *
     * @param productID int - number representing a product
     * @param price double - price before taxes for a specified item
     */
    public Product(int productID, double price) {

        this.productID = productID;
        this.price = price;
    }

    /**
     * Retrieves the product ID of the product
     *
     * @return int - return the product id
     */
    public int getProductID() {
        //int
        return productID;
    }

    /**
     * Retrieves the price of the product
     *
     * @return double - returns the price before taxes
     */
    public double getPrice() {

        return price;
    }

    /**
     * Converts and formats productID and price to a string for display
     *
     * @return String - returns a string to be display
     */
    @Override
    public String toString() {

        return "Product ID: " + getProductID() + ", Price: " + df.format(getPrice()) + "\n";
    }

}
