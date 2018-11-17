var fname = [];
var lname = [];
function createFullName(firstName, lastName) {
var fullName = [];
var len = firstName.length;
for (i = 0; i < len; i++){
  var k = Math.floor(Math.random()*(len - i));
  fullName.push(firstName[i] + ' ' + lastName[k]);
  lastName.splice(k,1);
}
return fullName;
}
var str = "Alex ,Chris, Jaimie, Morgan, Pat, Tracy";
fname = str.split(',');
var str = "Green, Mustard, Peacock, Plum, Scarlet, White";
lname = str.split(',');
var customers = createFullName(fname, lname);
console.log(customers);
console.log(lname);
var desserts = [{ item:"chocolate cake", price:5.75 }, { item:"apple pie", price: 4.00 }, { item:"strawberry tart", price:3.50 },
{ item:"lemon loaf", price: 5.00 }, { item:"walnut square", price: 2.00 }, { item:"petit fours", price:5.00 }];
for (var i = 0; i < desserts.length; i++) {
  console.log(desserts[i].item + 'costs $' + (desserts[i].price.toFixed(2)));
}
function createOrders(customerArray, dessertArray) {
  var ordersArray = [];
  var len = customers.length;
  var n = Math.floor(Math.random()*len);
  for (i = 0; i < len; i++){
    ordersArray.push({ customer: customerArray[i],
      item: dessertArray[n].item,
      price: dessertArray[n].price
    });
  }
  return ordersArray;

}
var o = createOrders(customers, desserts);
console.log(o);
o.sort(function(a,b) {return a.price-b.price;});
console.log(o);
 var sum = function (items, prop) {
                   if (items === null) {
                       return 0;
 }
return items.reduce( function (a, b) {
return b[prop] === null ? a : a + b[prop];
}, 0);
            };
            console.log('Total is ' + (sum(o, 'price')));
            var pricey = Math.max.apply(Math, o.map(function(a) { return a.price; }));
            
console.log('selection is' + pricey);
var filteredArray = o.filter(function (element) { 
                                              return element.price === pricey;
                                          });
                                          var filteredArray = o.filter( element => element.price === pricey);

console.log(filteredArray);
