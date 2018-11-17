using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Lab6.Models
{
    public class ProductRepository : IProductRepository
    {
        private Northwind db;
        public ProductRepository(Northwind db) {
            this.db = db;
        }
        public Product Add(Product c) {
            c.ProductID = 0;
            c.ProductID.ToString();
            db.Add(c);
            db.SaveChanges();
            return c;
        }
        public Product Find(int id) {
            return db.Products.Find(id);
        }
        public IEnumerable<Product> GetAll() {
            return db.Products;
        }
        public bool Remove(int id) {
            Product c = Find(id);
            if (c == null)
                return false;
            db.Products.Remove(c);
            db.SaveChanges();
            return true;
        }
        public Product Update(int id, Product c) {
            Product old = Find(id);
            if (old == null)
                return null;
            old.ProductName = c.ProductName;
            old.SupplierID = c.SupplierID;
            old.UnitPrice = c.UnitPrice;
            old.UnitsInStock = c.UnitsInStock;
            old.UnitsOnOrder = c.UnitsOnOrder;
            old.ReorderLevel = c.ReorderLevel;
            old.Discontinued = c.Discontinued;
            db.SaveChanges();
            return c;
        }
    }
}
