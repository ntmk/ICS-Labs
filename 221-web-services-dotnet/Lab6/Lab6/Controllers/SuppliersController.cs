using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Lab6.Models;
using Microsoft.AspNetCore.Mvc;

namespace Lab6.Controllers {
    //[Produces("application/json")]
    [Route("api/Suppliers")]
    public class SuppliersController : Controller {
        private ISupplierRepository repo;
        // dependency injection supplies a concrete implementation
        // of ICustomerRepository
        public SuppliersController(ISupplierRepository repo) {
            this.repo = repo;
        }
        // GET: api/Customers/?country=[value]
        // Note that we are free to call this method whatever we like.
        // It returns a collection of Customer objects.
        [HttpGet]
        public IEnumerable<Supplier> GetSuppliers(string country) {
            if (string.IsNullOrWhiteSpace(country))
                return repo.GetAll();
            return repo.GetAll()
                .Where(supplier => supplier.Country.ToUpper() == country.ToUpper());
        }
        
       
        // GET: api/Customers/id-string
        // We have supplied a name for this route: GetCustomer, which we will
        // reference in the POST method below.
        // Note the return type: IActionResult
        [HttpGet("{id}", Name = "GetSupplier")]
        public IActionResult GetSupplier(int id) {
            Supplier c = repo.Find(id);
            if (c == null)
                return NotFound(); // 404
            return new ObjectResult(c); // 200 OK, and serialize the object
        }
        
        [HttpGet("{id}/Products", Name = "GetSupplierProd")]
        public IEnumerable<Product> GetSupplierProd(int id) {
            return repo.GetProd().Where(p => p.SupplierID == id);
        }

    }
}

