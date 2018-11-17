using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Lab6.Models;
using Microsoft.AspNetCore.Mvc;

namespace Lab6.Controllers
{
    [Route("api/Products")]
    public class ProductsController : Controller
    {
        private IProductRepository repo;
        // dependency injection supplies a concrete implementation
        // of ICustomerRepository
        public ProductsController(IProductRepository repo) {
            this.repo = repo;
        }

        // GET: api/Customers/?country=[value]
        // Note that we are free to call this method whatever we like.
        // It returns a collection of Customer objects.
        [HttpGet]
        public IEnumerable<Product> GetProducts(string supplier) {
            if (string.IsNullOrWhiteSpace(supplier))
                return repo.GetAll();
            return repo.GetAll().Where(product => product.ProductName == supplier);

        }

        [HttpGet("{id}", Name = "GetProduct")]
        public IActionResult GetProduct(int id) {
            Product c = repo.Find(id);
            if (c == null)
                return NotFound(); // 404
            return new ObjectResult(c); // 200 OK, and serialize the object
        }

        [HttpPost]
        public IActionResult Create([FromBody] Product c) {

            if (c == null)

                return BadRequest(); // 400 Bad Request
            repo.Add(c);

            // return a 201 Created with a route to get the object

            // the route will be the value of the Location header in the response.

            return CreatedAtRoute("GetProduct", new { id = c.ProductID }, c);

        }



        // PUT: api/Customers/ALFKI

        [HttpPut("{id}")]

        public IActionResult Update(int id, [FromBody] Product value) {

            if (value == null) // we couldn't deserialize the request body

                return BadRequest(); // HTTP 400

            value.ProductID = value.ProductID;

            if (value.ProductID != id)
                return BadRequest(); // HTTP 400
            var existing = repo.Find(id);
            if (existing == null)
                return NotFound(); // HTTP 404
            repo.Update(id, value);
            return new NoContentResult();
        }

        // DELETE: api/customers/ALFKI
        [HttpDelete("{id}")]
        public IActionResult Delete(int id) {
            Product existing = repo.Find(id);
            if (existing == null)
                return NotFound(); // HTTP 404
            repo.Remove(id);
            return new NoContentResult(); // 204 No Content
        }
    
}
}
