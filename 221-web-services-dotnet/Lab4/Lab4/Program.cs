using System;

namespace Lab4
{
    using ShoppingCart;
    using Newtonsoft.Json;
    using System.IO;

    class Program : JsonSerializer {
        static void Main(string[] args) {

            Cart.TaxRate = 0.12M; // 12% tax rate
            Cart c = new Cart();

            Book b = new Book(1089345, 9.9502M, "Animal Farm", "George Orwell");
            b.Hardcover = true;
            c.Add(b, 3); // add three copies of Animal Farm
            Book p2 = new Book(1089398, 14.99M, "Generation X", "Douglas Coupland");
            p2.Hardcover = false;
            c.Add(p2); // add a single copy of Generation X

            Film d = new Film(1289345, 4.95M, "Saving Private Ryan", "Steven Spielberg");
            c.Add(d, 2);
            d.Form = Film.Format.bluray;

            c.Add(b);

            // serialize JSON to a string and then write string to a file
            File.WriteAllText(@"D:\OneDrive\Documents\Second-Year\SecondSemester\ICS221\221-Labs\Lab4\demo.json", JsonConvert.SerializeObject(c));

            // serialize JSON directly to a file
            using (StreamWriter file = File.CreateText(@"D:\OneDrive\Documents\Second-Year\SecondSemester\ICS221\221-Labs\Lab4\demoLab4.json")) {
                JsonSerializer serializer = new JsonSerializer();
                serializer.Serialize(file, c);
            }
        }
        }
    
}
