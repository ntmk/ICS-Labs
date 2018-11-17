using System;
using System.Collections.Generic;
using System.Text;

namespace ShoppingCart
{
    public class Film : Product {
        public enum Format { dvd, bluray, vhs };
        string Title { get; } 
        string Director { get; }
       
        public Format Form { get; set; }

        public Film (int productID, decimal price, string title, string director) : base(productID, price) {
            Title = title;
            Director = director;
        }

        public override string ToString() {
            return base.ToString() + " Title: " + Title + " Director: " + Director;
        }
    }
}
