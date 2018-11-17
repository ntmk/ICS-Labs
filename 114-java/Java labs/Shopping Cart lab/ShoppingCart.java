
import java.util.*;
import java.text.DecimalFormat;

/**
 * A basic shopping cart application with ways to store and retrieve contents
 * with prices.
 *
 * @author Nathan Mackenzie
 * @version 1.0
 * @since 1.0
 */
public class ShoppingCart {

    DecimalFormat df = new DecimalFormat("$0.00");
    private final ArrayList<Product> cart;
    private static double taxRate;

    /**
     * Constructor setting default values for all class variables
     */
    public ShoppingCart() {

        this.taxRate = taxRate;
        cart = new ArrayList<>();
    }

    /**
     * Sets the tax rate to the assigned value
     *
     * @param taxRate double - tax rate to be applied to the subtotal
     * @throws IllegalArgumentException if taxRate is set to negative number
     */
    public static void setTaxRate(double taxRate) {
        if (taxRate < 0) {
            throw new IllegalArgumentException("TaxRate must be greater than or equal to 0.");
        }

        ShoppingCart.taxRate = taxRate;
    }

    /**
     * Adds a product to the cart
     *
     * @param c Array - is the product to be added
     */
    public void add(Product c) {

        cart.add(c);
    }

    /**
     * Adds 1 or more of the same item to the cart
     *
     * @param c Array - product to be added
     * @param num int - how many of the product to be added
     */
    public void add(Product c, int num) {
        if (num < 0) {
            throw new IllegalArgumentException("Number of products to add must be a positive integer.");
        }
        for (int i = num; i > 0; i--) {
            cart.add(c);
        }
    }

    /**
     * Removes a product from the cart and returns the amount removed
     *
     * @param c Array - is the product to be removed
     * @return int - returns the amount of items removed
     */
    public int remove(Product c) {

        int removed = 0;

        if (cart.contains(c) == true) {
            cart.remove(c);
            removed++;
        }

        return removed;
    }

    /**
     * Confirms something was removed then returns the number of items removed
     *
     * @param c Array - is the product to be removed
     * @param num int - is the amount of items to be removed
     * @return int - number of actual items removed
     */
    public int remove(Product c, int num) {
        if (num < 0) {
            throw new IllegalArgumentException("Number of products to remove must be a positive integer.");
        }
        int removed = 0;
        for (int i = num; i >= 0; i--) {
            if (cart.contains(c) == true) {
                cart.remove(c);
                removed++;
            }
        }
        return removed;
    }

    /**
     * Retrieves the amount of items in the cart
     *
     * @return int - returns the total amount of items in the cart
     */
    public int getCount() {
        int count;
        count = cart.size();
        return count;
    }

    /**
     * Gets the current sum of all product prices without taxes
     *
     * @return double - the subtotal amount of all products in the cart
     */
    public double getTotal() {
        double total = 0.0;
        for (int i = 0; i < cart.size(); i++) {
            total += cart.get(i).getPrice();
        }
        return total;
    }

    /**
     * Get the current sum of all product prices including the taxes
     *
     * @return double - the total cost including taxes
     */
    public double getGrandTotal() {

        double grandTotal;
        grandTotal = (getTotal() * taxRate) + getTotal();
        return grandTotal;
    }

    /**
     * Clears the contents of the shopping cart
     */
    public void empty() {

        cart.clear();
    }

    /**
     * Converts and formats all data to a string for display
     *
     * @return String - a string displaying the items in the cart, total count,
     * subtotal, and grand total
     */
    @Override
    public String toString() {

        String products = "";
        for (Product product : cart) {
            String i = product.toString();
            products += i;

        }
        return products + "The subtotal is " + df.format(getTotal()) + ".\nThe "
                + "total taxes owed are " + df.format(getTotal() * taxRate)
                + ".\nThe grandtotal of all items in the cart is "
                + df.format(getGrandTotal());
    }
}
