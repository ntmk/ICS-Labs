using System;
using System.Globalization;

namespace ShoppingCart
{
    public class Product : IComparable<Product> {

        public int ProductID { get; }
        public decimal Price { get; }
 
        public Product(int productID, decimal price) {
            if (price <= 0) {
                throw new ArgumentException("Product price Must have a value greater than 0");
            } else {
                ProductID = productID;
                Price = price;
            }
        }

        public int CompareTo(Product other) {
            if (ProductID < other.ProductID) return -1;
            if (ProductID == other.ProductID) return 0;
            if (ProductID > other.ProductID) return +1;
            else {
                throw new NotImplementedException("");
            }
        }
 
        public override string ToString() {
            return "Product ID: " + ProductID + " Price: " + Price.ToString("C", new CultureInfo("en-US"));
        }

    }
}
