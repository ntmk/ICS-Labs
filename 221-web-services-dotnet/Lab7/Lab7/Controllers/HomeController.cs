using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Mvc;
using Lab7.Models;



namespace Lab7.Controllers
{
    public class HomeController : Controller {
        public IActionResult Index() {
            ViewData["Title"] = "Add /square/ and a number to the end of the url to get a square root";
            return View();
        }

        [HttpGet("Square/{id}", Name="Square")]
        public IActionResult Square(int id) {
            double result = Math.Sqrt(id);
            ViewData["sqrt"] = result + " is the square root of " + id;
            return View();
        }
        public IActionResult Error()
        {
            return View(new ErrorViewModel { RequestId = Activity.Current?.Id ?? HttpContext.TraceIdentifier });
        }
    }
}
