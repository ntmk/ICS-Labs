using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.Globalization;


namespace ShoppingCart {
    public class Cart {

        public static decimal TaxRate { get; set; }
        public List<Product> Order { get; }
        public Cart() {
            Order = new List<Product>();
        }

        public void Add(Product item, int amount = 1) {
            if (amount < 0) {
                throw new ArgumentException("Adding an item to your cart requires a positive number");
            } else {
                for (int i = amount; i > 0; i--) {
                    Order.Add(item);
                    }
                }
            }

        public int Remove(Product item, int amount = 1) {
            int removed = 0;
            for (int i = amount; i > 0; i--) {
                if (Order.Contains(item) == true) {
                    Order.Remove(item);
                    removed++;
                }
            }
            return removed;
        }
        public void Empty() {
            Order.Clear();
        }

        public int Count {
            get {
                int number = Order.Count;
                return number;
            }
        }

        public decimal Total {
            get {
                decimal amount = 0;
                foreach (Product p in Order) {
                    amount += p.Price;
                }
                return amount;
            }
        }
    
        public override string ToString() {
            Dictionary<string, int> cart = new Dictionary<string, int>();
            Order.Sort();
            String prod = "\n";
            foreach (Product p in Order) {
                string item = p.ToString();
                if (cart.ContainsKey(item)) {
                    cart[item] += 1;
                } else {
                    cart.Add(item, 1);
                }
            }

            foreach (var i in cart) {
                prod += i.ToString() + "\n";
            }

            return prod += "Subtotal: " + Total.ToString("C", new CultureInfo("en-US")) + "\nTaxes: " + 
                (TaxRate * Total).ToString("C", new CultureInfo("en-US")) + "\nGrand total: " + 
                (Total+ (Total * TaxRate)).ToString("C", new CultureInfo("en-US")) + "\n";
        }
    }
}
