Simple JavaScript function declaration:

1. Declare a JavaScript function named myFun that accepts a single argument named num and returns the value of num + 1.
----------

Declaring a JavaScript function with two parameters and it returns a string:

2. Declare a JavaScript function named starThis that accepts two arguments named a and b and returns a string literal of "*" joined with a joined with a second "*" joined with b joined with a third "*". For example, starThis("red", "car") would return "*red*car*".
3. Declare a variable p (but do not assign it a value).
4. Declare a variable q (but do not assign it a value).
5. Use console.log to display a call to function starThis with arguments p and q. (e.g. console.log( starThis(p, q) ); )  You should see two undefineds in the result. 
6. Add appropriate if statements to the starThis function to check if either parameter value is undefined, then set it to the empty string instead.
7. Use console.log to display a call to function starThis with arguments p and q.  No undefineds should appear, just three stars.
--------

Exploring the use of JavaScript functions as first-class objects by passing the function as a parameter

8. Declare a JavaScript function named encrypt that accepts two parameters: the first is a string message and the second is an integer num you can assume will be between -10 and 10. The function encrypts the string by adding num to each of the message's characters (update: I originally wrote this part to be only the letters were encrypted but now I have changed it so that all characters including numbers and spaces are encrypted -- if you have already completed this lab, don't bother redoing this). You can use the JavaScript example from the encode function near slide 85 in the Function module. The method String.fromCharCode( n ) returns the ASCII character having a code of n.  The string method charCodeAt(0) returns the ASCII code number of that character at index 0.  Example:  "a".charCodeAt(0) is 97, String.fromCharCode(97) is "a".  
9. Declare a JavaScript function named decrypt that is nearly identical to the previous step but goes the other way (i.e. all characters are decrypted back to their original text.
10. Declare a JavaScript function named transmit that accepts three parameters named: f, message, and num. The transmit function uses the function name passed in as f to call either the encrypt or decrypt function this way:  return f(message, num); This is an example of passing in a function name as a parameter to another function.
11. Declare a variable m and assign to it some literal string such as "Hello, world!".
12. Declare a variable p and assign to it the call to function transmit this way:  transmit(encyrpt, m, 3). Note that the function name encrypt is not in double quotes -- it is not literal string, it is a function name.
12. Use console.log to display the value of p.
13. Use console.log to display the result of calling transmit(decrypt, p, 3) to reveal the decrypted message in its original form.
---------

JavaScript function expression 

14. JavaScript can do something many other languages cannot: declare anonymous functions. An anonymous function has no name and is typically used as an expression this way for example:   var s = function( n ) {  return n * n; };   Note three things here: 1. The function is used as an expression and is assigned to some variable. 2. The function has no name but still can have parameters.  and 3. There is a semi-colon at the end of the closing brace -- because this is a valid JavaScript statement after all.
15. Declare a variable s and assign to it a function expression that has one parameter and returns twice that parameter value.
16. Use console.log to call s with some parameter number value to confirm the function expression works properly.
----------

JavaScript arrow functions

17. An even shorter function expression syntax is available now: arrow functions.  How it works is described on slides 108-110. All you need to do is list any parameter name on the left side of the arrow (=>) and what you want done to that parameter displayed on the right side of the arrow.  For example,   var f = x => x+1;  means the function expression returns the parameter value plus one.  f(1) returns 2, f(33) returns 34,etc.
18. Declare a JavaScript variable f1 and assign to it an arrow function that returns three times the parameter value.
