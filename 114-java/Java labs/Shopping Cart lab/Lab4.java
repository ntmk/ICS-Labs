
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;


/**
 *
 * @author Nathan
 */
public class Lab4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ShoppingCart.setTaxRate(0.12); // 12% tax rate 
        ShoppingCart c = new ShoppingCart();
        System.out.println(c); // an empty shopping cart

        Book p = new Book(1089345, 9.95, "George Orwell", "Animal Farm");
        p.setHardCover(true);
        System.out.println(p);
        c.add(p);

        Book p2 = new Book(1089398, 14.99, "Douglas Coupland", "Generation X");
        c.add(p2, 2);

        Film d = new Film(1289345, 4.95, "Steven Spielberg", "Saving Private Ryan");
        d.setFormat(Film.format.bluray);
        c.add(d, 1);

        // how many items in the cart now? Should be four...
        System.out.println(c.getCount());

        c.add(p, 1); // add another Animal Farm
        int i = c.remove(p, 3); // try to remove three copies of Animal Farm
        if (i != 2) // remove a non-existent Product
        {
            System.out.println("Removed a non-existent product?");
        }

        System.out.println(c);

        c.empty(); // start fresh
        c.add(p);
        c.add(d, 2);
        if (c.remove(p2) > 0) {
            c.add(p);
        }
        c.remove(d);
        System.out.println(c);
    }

}
