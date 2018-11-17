using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using System.Collections.Concurrent;
using System.Linq;

namespace Lab6.Models
{
    public class CustomerRepository : ICustomerRepository

    {
        private Northwind db;
        public CustomerRepository(Northwind db)
        {
            this.db = db;
        }
        public Customer Add(Customer c)
        {
            c.CustomerID.ToUpper();
            db.Add(c);
            db.SaveChanges();
            return c;
        }
        public Customer Find(string id)
        {
            return db.Customers.Find(id.ToUpper());
        }
        public IEnumerable<Customer> GetAll()
        {
            return db.Customers;
        }
        public bool Remove(string id)
        {
            Customer c = Find(id);
            if (c == null)
                return false;
            db.Customers.Remove(c);
            db.SaveChanges();
            return true;
        }
        public Customer Update(string id, Customer c)
        {
            Customer old = Find(id);
            if (old == null)
                return null;
            old.CompanyName = c.CompanyName;
            old.City = c.City;
            old.ContactName = c.ContactName;
            old.Country = c.Country;
            old.Phone = c.Phone;
            db.SaveChanges();
            return c;
        }
    }
}
