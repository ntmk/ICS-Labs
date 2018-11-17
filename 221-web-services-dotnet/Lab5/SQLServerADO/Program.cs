using System;
using System.Linq;

namespace SQLServerADO {
    using System.Data.SqlClient;
    class Program {
        static void Main(string[] args) {

            using (var db = new DataConnection()) {

                IQueryable<Customer> cityList = db.customer.GroupBy(p => p.City).Select(grp => grp.First());
                foreach (Customer p in cityList)
                    Console.WriteLine($"City: {p.City}");

                while (true) {

                    Console.Write("Enter a City (X to exit): ");

                    string city = Console.ReadLine();

                    if (city.ToUpper().Equals("X"))

                        break;

                    IQueryable<Customer> customers = db.customer.Where(p => p.City == city);
                    foreach (Customer p in customers)

                        Console.WriteLine($"Company Name: {p.CompanyName}");

                }

            }
            
        }
    }
}
