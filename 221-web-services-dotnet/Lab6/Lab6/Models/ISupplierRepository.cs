using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Lab6.Models
{
    public interface ISupplierRepository
    {
        IEnumerable<Supplier> GetAll();
        Supplier Find(int id);
        IEnumerable<Product> GetProd();
    }
}
