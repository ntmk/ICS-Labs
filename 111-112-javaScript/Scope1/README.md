Understanding Global Scope and Function Scope
1. Recall from the Scope 2 module that any variable or constant declared outside a function is called a global variable.  All functions within the script document have visibility and access to global variables.

2. Declare a variable x with var and initialize it to 7.

3. Declare a function named doThis having no arguments. Inside the doThis function:
Declare a variable named a using var and initialize it to 10.  Since a is declared inside a function using the var keyword, it is function scope not global scope. Visibility and access to this variable a is restricted to within function doThis only.
Declare a variable named b but do not use var and assign 6 to it.  When you create a new variable without the var keyword within a function, JavaScript makes it a new global scope variable.
Define a statement that returns the sum of a, b, and x.

4. Outside the function (global scope), use console.log to display the string literal 'doThis is ' followed by a call to the function doThis(). (e.g. console.log('doThis is ' + doThis()); )

5. Use console.log to display the string literal 'variable a declared in function doThis is ' followed by typeof a.

6. Use console.log to display the string literal 'variable b after doThis is ' followed by b.

7. Run the script and you should see 'doThis is 25' in the first line. JavaScript says that variable a is undefined, why?   Also, JavaScript says that variable b is 6.  Why? Because b was declared without using the var keyword within the function so variable b is a global variable and visible outside the function.

Variable Masking
8. What happens if you declare a function scope variable with the same name as a global scope variable?  Let's find out.

9. Within the doThis function just before the return statement, add in a new statement that declares x using the var keyword and assign to it the value of 9.  Then on the following line, add in a new statement that uses console.log to display the literal string "inside function doThis x is " followed by x.

10. For the last line of the script add a console.log statement that displays the string literal "variable x after doThis is " followed by x.

11. Run the script. You should see that the variable x inside the doThis function has the value of 9 while the value of variable x outside the doThis function (in global space) has the value of 7.  What is happening here?  The variable x in the function 'masked' the global variable having the same name.  The function scope variable x was used in the return sum and not the global scope variable x.  Then, when the function doThis ended, the global scope variable x value was restored back to 9.

12. What if the argument name in a function declaration is the same as a global variable name?  Let's see. Following the last statement in your script, declare a new function named doThat having x as its only argument.  Inside the function 
Assign 5 to variable a (do not use var)
Assign 4 to variable b (do not use var)
Use console.log to display the string literal 'inside function doThat x is ' followed by x. 
Define a statement that returns the sum of a, b, and x.

13. Use console.log to display the literal string 'doThat is ' followed by a call to the function doThat with a 3 as parameter.

14. Use console.log to display the literal string 'variable a declared in function doThat is ' followed by typeof a.

15. Use console.log to display the literal string 'variable b after doThat is ' followed by b.

16. Use console.log to display the literal string 'variable x after doThat is ' followed by x.

17. Run the script. Observe that the argument x in the doThat function masked the global variable x value. Once the doThat function completed execution, the global variable x retained its original value of 7.

IIFE - Immediately Invoked Function Expression

18. JavaScript functions are usually declared and then invoked by calling them like this:

        function foo() {
           ...
        }
        .... some JavaScript code

        foo();  // call the function to be executed

        Occasionally in JavaScript it is necessary to both declare a function and then execute it immediately.  This is like a 'one-off' statement where you are declaring a function so that it can be run straight-away and not ever again elsewhere in the script. Also, any variables declared within the IIFE are function scope so you do not have to worry about creating problems with global variables. The syntax for doing this as an IIFE (Immediately Invoked Function Expression) may appear to be strange. This example below is a very simple function that shows how it works.

19. Declare a function named runMe having no parameters.  Inside this function:
Declare a variable y using the var keyword and assign to it the value of 10.
Use console.log to display the literal string 'in runMe y is ' followed by y

20. Now, wrap the entire runMe function with enclosing parentheses ( ) and then add these three symbols at the end: ( ) ;

21. Run the script.  The IIFE should display the message.  The reason for the ending parentheses ( ) is to force the function to execute as a statement (hence the semicolon at the end).  The first enclosing parentheses turn the code into an expression.

Anonymous function

22. Function expressions are not required to have a function name. These are called anonymous functions because, well, they are nameless and you are only interested in the function in one particular occasion only. 

23. Convert the runMe function into an anonymous function by deleting the function name.

24. Outside the anonymous function use console.log to display the literal string 'variable y after running anonymous IIFE is ' followed by typeof y.

24. Run the script. The anonymous function should continue to execute as previously when it was named runMe. And the output from console.log should show that variable y is undefined.

25. If the IIFE requires arguments, place those values (or expressions) inside the trailing parentheses and then list the argument names in the parentheses following the function keyword.