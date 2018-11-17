using Microsoft.EntityFrameworkCore;

namespace SQLServerADO
{
    public class DataConnection : DbContext {


        public DbSet<Customer> customer { get; set; }
        

        protected override void OnConfiguring(DbContextOptionsBuilder optionsBuilder) {

            optionsBuilder.UseSqlServer(@"Data Source = (localdb)\mssqllocaldb;Initial Catalog=Northwind;Integrated Security=true;");

        }

    }
}
