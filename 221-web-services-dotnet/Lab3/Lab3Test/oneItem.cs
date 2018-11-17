using ShoppingCart;
using System;
namespace Lab3Test {
    class Program {
        //static void Main(string[] args) {
        //    Product p = new Product(51, 89M);
        //    Book b = new Book(5, 49.90007M, "john", "wayne");
        //    Film f = new Film(2, 89, "set", "roger");
        //    Console.WriteLine(p);
        //    Console.WriteLine(b);
        //    Console.WriteLine(f);
        //    Console.ReadKey();
        //}
        static void Main(string[] args) {
            Cart.TaxRate = 0.12M; // 12% tax rate
            Cart c = new Cart();
            Console.WriteLine(c); // an empty cart

            try {
                Product p = new Product(21, 0M);
                Console.WriteLine("That should have thrown an exception.");
            } catch (Exception e) {
                Console.WriteLine(e.Message);
            }

            Book b = new Book(1089345, 9.9502M, "Animal Farm", "George Orwell");
            b.Hardcover = true;
            Console.WriteLine(b);

            c.Add(b, 3); // add three copies of Animal Farm

            Book p2 = new Book(1089398, 14.99M, "Generation X", "Douglas Coupland");
            p2.Hardcover = false;
            c.Add(p2); // add a single copy of Generation X

            Console.WriteLine($"The cart contains {c.Count} items.");
            Console.WriteLine($"The cart is worth {c.Total.ToString("C")}.");

            Film d = new Film(1289345, 4.95M, "Saving Private Ryan", "Steven Spielberg");

            try {
                c.Add(d, -1);
                Console.WriteLine("That should have thrown an exception.");
            } catch (Exception e) {
                Console.WriteLine(e.Message);
            }

            c.Add(d, 2);
            d.Form = Film.Format.bluray;
            Console.WriteLine(c);

            c.Add(b);
            c.Remove(b, 4); // remove all copies of Animal Farm
            Console.WriteLine(c);

            c.Empty();
            c.Add(b, 2);
            Console.WriteLine(c);
            Console.ReadKey();
        }
    }
    }
