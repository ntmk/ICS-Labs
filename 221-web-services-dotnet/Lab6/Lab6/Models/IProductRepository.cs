using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Lab6.Models
{
    public interface IProductRepository
    {
        Product Add(Product c);
        IEnumerable<Product> GetAll();
        Product Find(int id);
        bool Remove(int id);
        Product Update(int id, Product c);
    }
}
