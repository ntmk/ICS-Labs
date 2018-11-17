using System;
using System.Collections.Generic;
using System.Text;

namespace ShoppingCart
{
    public class Book : Product {

        public string Title { get; }
        public string Author { get; }
        public bool Hardcover { get; set; }

        public Book(int productID, decimal price, string title, string author) : base(productID, price) {
            Title = title;
            Author = author;
        }

        public override string ToString() {
            return base.ToString() + " Title: " + Title + " Author: " + Author;
        }
    }
}
