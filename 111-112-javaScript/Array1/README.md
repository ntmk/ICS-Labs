Please only use Google Chrome or Firefox browsers for these labs. You may experience unexpected results with Microsoft Internet Explorer.

JavaScript arrays are not declared in the same way as they are in Java.  You are not required use the special new keyword to instantiate a new array in JavaScript (although you can if you want -- here is an example: var myArray = new Array( 33, 44, 55);). The preferred short method of declaring and instantiating arrays in JavaScript is just use a pair of matching square brackets [ ] and provide elements as needed.  var myArrray = [ 33, 44, 55 ];

Elements listed in the array are always delimited (separated) by commas.  If you forget a comma within the list of elements, you may get a run-time error. Double-check.

The square brackets are used to contain the array's contents, called elements.  e.g. var myArray = [ ]; is an empty array and var myArray = [33, 44, 55]; is an array of three number elements.  

JavaScript arrays may contain elements of different types e.g. [ 'pencil', 55.6, true, null ] is allowed -- this array has a string element, a number element, a boolean element, and a null value element.

The length property of a JavaScript array returns the number of elements currently in that array (e.g.  console.log( [44,66,88].length ); returns 3 and console.log( [].length ); returns zero. 

The first element in an array is index number zero.  So, given this statement: var myArray = ['pencil', 33];  you will get 'pencil' when you reference myArray[0] and 33 when you reference myArray[1] and undefined when you reference anything other than index 0 or 1.

The push method adds a new element to the end of the array. So, myArray.push('star'); will add the element 'star' to the end of the myArray array.

The splice method causes one or more array elements to be taken out of the array. The first argument to splice is the starting index of the element(s) to remove and the second argument is how many elements. So  var myArray = ['pencil', 33];  myArray.splice(1,1);  makes myArray contain just ['pencil'].  

A string of delimited words (tokens) such as "red,blue,green,orange,yellow" can be converted into an array of those words as elements (e.g. [ 'red', 'blue', 'green', 'orange', 'yellow' ]).  The split method requires an argument -- a string -- which indicates the delimiter between the words.  For example 
    var str = "red,blue,green,orange,yellow";  // the comma is the delimiter between words
     var newArray = str.split(',');  // newArray is ['red', 'blue', 'green', 'orange', 'yellow']; 
The opposite of split is join.  The join method is applied to an array and converts it into a string with a delimiter separating the words.

Arrays are objects so when they are passed into a function as an argument, they are passed by reference. Recall that primitives like numbers and strings are passed into function arguments as pass by value. Pass by reference means that if the function changes the array in any way, that change is not undone once the function ends.

JavaScript uses object literals to represent something that contains more than just one simple value. For example a person object literal : var person = { name: "Sally Smith", employeeID: 3092, salary: 45000 };
and person.name would be "Sally Smith" and person.employeeID would be 3092.  For an array of object literals, you can push a new literal into the array in one of two ways:
     var employeeArray = [];    
     employeeArray.push( { name: "Sally Smith", employeID: 3092, salary: 45000 } );

    //  employeeArray is an already populated array of person literal objects

   
     myArray = [];
     for (var i = 0; i < fullName.length; i++) {
               myArray.push( { firstName: employeeArray[i].name,  
                                  salary: employeeArray[i].salary } );
     }

    - or -

     myArray = [];
     for (var i = 0; i < fullName.length; i++) {
          var s = { firstName: employeeArray[i].name,
                       salary: employeeArray[i].salary };
          myArray.push( s );
     }

1. Declare fname with var and assign it to the empty array [].  

2. Declare lname (lowercase LNAME) with var and assign to it the empty array [].

3. In this part of the array exercise you will create an array of randomized first and last names into a new array of full names.

For example, if the array of first names is [ 'Clara', 'Caspar', 'Crispin' ] and the array of last names is [ 'Downs', 'Dvorak', 'Dixon']  (the arrays of names do not have to be in alphabetic order), a randomized set of full names could be [ 'Clara Dixon', 'Caspar Downs', 'Crispin Dvorak'].  Each first name is used once and each last name is used once in the full names array.

4. Declare a new function named createFullName which accepts two arguments: firstName and lastName, both are arrays.

5. Inside the function declare fullName with var and assign it to the empty array.  This array will be returned from the function and it will contain elements that are strings (a first name, a space, a random last name).

6. Add in the return fullName; statement just above the closing function brace }.

7. After the closing function brace } add a new line that declares a variable named str using var and is assigned to the string literal "Alex,Chris,Jaimie,Morgan,Pat,Tracy". No spaces--just the comma between the names. Use the split method on the next line to set the fname array to contain the names in str as separate elements. 

8. Add a new line that sets str to the string literal: "Green,Mustard,Peacock,Plum,Scarlet,White". On the next line use the split method to set the lname array to contain those last names of str as separate elements.

9. Add a line that declares customers with var and assigns to it the function call to createFullName with the  arguments fname and lname.

10. Use console.log to display the array customers.

11. Run the script.  The console.log should only show the empty array [] because the createFullName function currently does nothing but return the empty array.

12. Edit the createFullName function and after the var fullName statement, add a new line which declares len with var and assigns to it the length of the firstName array.

13. Write the for loop statement that will use loop counter i starting with zero and ends when i is equal to len. This structure will provide the sequential index numbers (0, 1, 2, 3, 4, and 5) for accessing the firstName array elements one at a time within a loop.

14. Within the for loop add the firstName element at index i to the end of the fullName array. Need help: see the notes at the top on using the push method and accessing array elements by index number.

15. Run the script. You should see the list of first names appear in the output of the console.log in the same element order as the fname array.

16. Edit the createFullName function. The next step is to find a random last name to join with each first name. You know the index numbers of the lastName array are as follows: 0, 1, 2, 3, 4, and 5. You just need to come up with a statement that will randomly return one of those numbers....assign that random number to k using var. e.g. var k = Math..<something something random that uses len>.

17. Modify the push statement so that instead of just the first name string being pushed as an element on the fullName array, the first name joined with a space joined with a last name is pushed. Don't forget to use the correct index number on the lastName array.

18. Run the script. Perhaps some of the last names are the same within the customers array?  Let's fix that so that every element in the customers array has a unique last name.

19. One way to ensure only unique last names are randomly selected in the function is to simply remove that selected last name from the lastName array within the for loop once it is used. So, the lastName array would begin as [ 'Green', 'Mustard', 'Peacock', 'Plum', 'Scarlet', 'White' ] and, assuming 'Plum' was the randomly selected name, the lastName array would be modified within the for loop to be [ 'Green', 'Mustard', 'Peacock', 'Scarlet', 'White' ] (only five elements to choose from now instead of the original six). You will need to come up with a statement that removes one element from the lastName array given its index number. See the notes at the top on using the splice method.

20. Run the script. The last names should appear ok...except for those that say undefined! A bug to fix. Recall that when you attempt to access an array element for an index it doesn't have, JavaScript returns undefined. So, if an array has 3 elements and your JavaScript tries to access that array's index number 0, 1, or 2, you will be ok ... but if your JavaScript attempts to access that array's index number 4, 5, or 6, you will get undefined (rather than a run time error). So, it appears your selection of random index numbers for last name needs to be modified. In other words, you cannot randomly select from (0, 1, 2, 3, 4, or 5)  on every loop cycle.  You used the splice method to remove an element from the lastName array so the valid set of index numbers is reduced by one each time you do the loop.  The first loop cycle the valid set is six numbers (zero through five), the second loop cycle has five numbers (zero through four), the third loop cycle has four numbers (zero through three), and so on. Figure out what must be changed in your random number calculation to effect this correction. Hint: it involves the loop counter.

21. Run the script to ensure all six elements in the customers array have unique last names.

22. After the last console.log statement, add another console.log statement to display the lname array. Run the script. Note that the lname array shows as having no elements now. Why? Because the lname array was passed by reference into the createFullName function, which performed splice on lastName six times, effectively removing all of its elements.  When the createFullName function completed, the updated lname array did not revert back to its original six element array. Be aware in JavaScript when you pass arrays or other objects as arguments into functions, that pass by reference is used not pass by value.

23. In this part of the array lab you will create another array called desserts containing six unique object literals of (guess what?) desserts.  This array of object literals looks like this:  

var desserts = [  { item:"chocolate cake", price:5.75 },
                  { item:"apple pie", price: 4.00 },
                  { item:"strawberry tart", price:3.50 },
                  { item:"lemon loaf", price: 5.00 },
                  { item:"walnut square", price: 2.00 },
                  { item:"petit fours", price:5.00 }
               ];

          Ensure you have a start [ and the end ] square brackets as shown, indicating the array.
          Ensure each object literal is surrounded by a matching set of braces { and }. Not parentheses!
          Ensure there is a comma between each object literal.
          Ensure there is a comma separating the item property from the price property.
          Ensure the property name is followed by a colon as in item:  and price: . You are allowed to have
            one or more spaces between the property name and the colon.
          Ensure you have spelled all the properties correctly as item and price.

24. Create a for loop which will display all the dessert items one per line as 

                      chocolate cake costs $5.75
                      apple pie costs $4.00
            et cetera

           Object literal property values for the desserts array are accessed by desserts[i].item and desserts[i].price, where i is the index of the element.

25. Create a new function named createOrders which accepts two arguments: customerArray and dessertArray.  The purpose of this function is to randomly assign a dessert object to each customer. It is possible for a dessert to be selected by more than one customer. All customers get assigned a dessert. This function will create a new array named ordersArray and return it.  The ordersArray is an array; its elements are object literals consisting of a customer property, an item property, and a price property. Here is an example of a possible ordersArray:

                     [  { customer: 'Chris Green', item:'apple pie', price: 4 },
                        { customer: 'Pat Mustard', item:'chocolate cake', price:5.75 },
                        { customer: 'Alex Peacock', item:'petit fours', price:5},
                        { customer: 'Jaimie White', item:'walnut squares', price: 2},
                        { customer: 'Tracy Scarlet', item:'chocolate cake', price:5.75 },
                        { customer: Morgan Plum', item:'apple pie', price:4}
                     ]

26. The JavaScript for the createOrders function is similar to the createFullName function. No splice method need be used, though.

27. After the definition of the createOrders function add a statement that declares o using var and assign to o the call to createOrders with the correct arguments.

28. Use console.log to display the array o. You should see six elements -- each element is an object literal of a customer name, a dessert item, and its price.  If you do not see these results, check with the instructor.

29. JavaScript arrays can be sorted anyway you like. Let's sort the o array from the least costly dessert selection to most costly.  Enter this JavaScript:

               o.sort( function(a,b) { return a.price-b.price; } );

30. Use console.log to display the array o. All the elements should now appear in increasing price order rather than by customer order.  The unnamed function within the sort method call is telling JavaScript to use this function to perform the sort (base it on increasing price).

31.  Let's use JavaScript's reduce method to sum up all the ordered dessert items in the o array. The reduce method automatically loops over each element in the array. Declare sum using var and assign to it this function object:

            var sum = function (items, prop) {
                   if (items === null) {
                       return 0;
                   }
                   return items.reduce( function (a, b) {
                                   return b[prop] === null ? a : a + b[prop];
                              }, 0);
            };

32. Use console.log to display the string 'Total is ' + sum(o, 'price').  The total of all selected dessert items in the o array should appear.

33. Let's use JavaScript's map method to find the costliest dessert item selected by the customers. Declare a variable pricey and assign to pricey this JavaScript:

            var pricey = Math.max.apply(Math, o.map(function(a) { return a.price; }));

   This is saying use this function to perform the find maximum operation. The map method also loops over each element in the array returning the price that it finds to be the highest in the array.  If you want, you may rewrite the function inside the map to be even more concise using arrow functions:

            var pricey = Math.max.apply(Math, o.map( a => a.price ));

34. Use console.log to display the string 'Priciest selection is ' + pricey.

35. Now that we know which price was the highest, let's use the filter method to find out who selected those pricey dessert items.

           var filteredArray = o.filter(function (element) { 
                                              return element.price === pricey;
                                          });

           or, if you want to use arrow functions instead:

           var filteredArray = o.filter( element => element.price === pricey);


36. Use console.log to display filteredArray. This will show all the customers who selected the priciest dessert item in the o array.

