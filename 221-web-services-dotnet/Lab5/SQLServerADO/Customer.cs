using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;

namespace SQLServerADO
{
    [Table("Customers")]
    public class Customer
    {
        [Key]
        public string CustomerID { get; set; }

        [Required]
        [MaxLength(40)]

        public string City { get; set; }
        public string CompanyName { get; set; }
    }
}
