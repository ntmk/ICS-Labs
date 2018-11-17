using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Lab6.Models
{
    public class SupplierRepository : ISupplierRepository
    {
        private Northwind db;
        public SupplierRepository(Northwind db) {
            this.db = db;
        }
       
        public Supplier Find(int id) {
            return db.Suppliers.Find(id);
        }
        public IEnumerable<Supplier> GetAll() {
            return db.Suppliers;
        }
        public IEnumerable<Product> GetProd() {
            return db.Products;
        }
    }
}
