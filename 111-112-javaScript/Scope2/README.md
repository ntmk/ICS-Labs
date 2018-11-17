Part A: Hoisting

1. Use console.log to output the literal string "The value of a is ..." where .... is the value of variable a.  This variable has not been declared or initialized yet so when this console.log statement runs, JavaScript will show a ReferenceError: a is not defined error message.

2. Below the console.log statement declare the variable a using the var keyword and initialize a's value to 100. Since you are declaring this variable outside of any function, this is a global variable which will be visible to any function within this script. Even though you have just declared this variable to be a global variable, the console.log statement above does not see its value, but thanks to JavaScript hoisting, the declaration of a (var a) is automatically 'hoisted' or effectively moved to the top of the script so that the console.log statement now sees a as a var ... just not its value.  The console.log will show "The value of a is undefined." now.

before hoisting:       after hoisting: (the JavaScript engine does this for you behind the scenes)
console.log(a);            var a;
var a = 100;                console.log(a);
                                 a = 100;

What this tells you about JavaScript is that global variables (if you use any) should always be declared at the top of the script.

3. In the line following the console.log statement (and before the var a statement), declare a new function named myFun having no arguments.  Within the function body:
Declare a variable b using var and initialize b to 200.
Apply the increment operator to the variable a.
Use console.log to output 'The sum of a and b is ...' where ... is (a+b).

4. In the line following the var a declaration add a call to the myFun function. Run the script and your output should have a line that has "The sum of a and b is 301." The variable a referenced inside the myFun function was assigned the value 100 before the call to the myFun function.

Part B: Lexical Scoping

5. In JavaScript you can define an inner function within its container outer function. This part of the exercise explores what happens inside a function scope (technically JavaScript uses lexical scoping which means the scope of any variable is determined by where you find it declared in the script). Declare a function named bigFun having no arguments. Inside the function declare using the var keyword a variable named outerCount and initialize it to zero. Because we declared outerCount inside a function, bigFun, the scope of the variable outerCount is bigFun only ... there is no access to outerCount outside of the bigFun function.

6. Inside the bigFun function declare a function named smallFun having no arguments. Inside smallFun declare a variable named innerCount using the var keyword and initialize it to zero. Also, within smallFun increment the variable outerCount, assign that to innerCount, and return innerCount. That's it for function smallFun.

7. Make a call to smallFun() within the bigFun function. Then use console.log to output the string literal: 'in bigFun outerCount is  ' + outerCount. Then on the next line use console.log to output the string literal: 'in bigFun innerCount is ' + innerCount. Then return outerCount. That's it for function bigFun.

8. This is now in global space (outside of any function), use console.log to output the string literal: 'in global space ' + a call to the smallFun function and on the next line use console.log to output the string literal: 'in global space ' + a call to the bigFun function. Use console.log to output the string literal: 'in global space outerCount is ' + outerCount.

9. When you run your script, you should see a "ReferenceError: innerCount is not defined" message for the line in the bigFun function where you used console.log to display innerCount. You cannot do this in JavaScript because innerCount was declared inside the smallFun function so its scope (visibility) is restricted to within smallFun only. The smallFun function can do anything it likes with its own function scope variables such as innerCount (and with outer function variables like outerCount, and with global variables) but outer function bigFun has no scope access to the innerCount variable. Comment out the line causing the ReferenceError and rerun the script.

10. Oh no! Another run time error.  This time a "ReferenceError: smallFun is not defined" message appears because your script attempted to call the smallFun function from outside its container function bigFun.  The smallFun function is defined inside bigFun so its visibility (scope) is restricted to inside bigFun only ... not outside in global space.  Outside bigFun the smallFun function has no visibility so that's why you got that second ReferenceError. The function bigFun is defined in global space so there is no problem calling it using console.log.  Comment out the line causing the ReferenceError and rerun the script. 

11. Not again?! This time the "ReferenceError" is referring to the console.log line that references the outerCount variable in global space, which you cannot do because outerCount is function scope to bigFun only, not global scope. There is no access to the variable outerCount outside the bigFun function. Comment out the line causing the ReferenceError and rerun the script.

12. The output should show "in bigFun outerCount is 1" followed by "in global space 1" on the next line.

Part C Closure

13. A closure is an environment where one or more of a function's variables are accessible (and even modifiable) after the function has ended. This bit of "wizardry" is accomplished with an inner function and the use of function expressions.  Recall that a function expression is different from a function declaration (function myFun(x) { return x + 1; } ).  A function expression is constructed similar to a function declaration but it usually isn't given a name and is assigned to a variable (e.g.  var a = function(x) { return x+1; }; ).  Closures are useful when coding in JavaScript's node.js server.

14. Declare a variable m with var and assign to it a function expression like this:  var m = function () { };  Don't forget the semi-colon at the end.  

15. Within the body of the function expression 
declare a variable n using var and initialize it to 100
declare a function named bar having no arguments. Inside inner function bar increment n by 1 using ++, then return n.
return bar();

16. Outside the function expression (global scope now), declare a variable s and assign to it m this way: var s = m;

17. Use console.log to output a call to s(). Repeat this line twice more for the next two lines.

18. Run the script. The output from the console.log message should show 101 three times. But this isn't a closure, yet. Note that the value of n does not get preserved between calls to the function expression. 

19. Edit the return bar(); statement to: return bar; and change the var s = m; statement to: var s = m(); . These changes say to JavaScript: return the reference to function bar once the function expression m points to is called. Run the script and note the difference in the output.  The numbers should appear ascending, which should appear odd considering the function expression is somehow remembering the value of n after the function has finished executing. The reason for this is somewhat complex but it involves where the variables are kept in memory (the stack or the heap).

20. Comment out the inner function bar completely (or delete it). Modify the return bar statement to this: return function() { return ++n; }  This is nearly the same thing but shorter-- no need for an inner function, just returning a function expression that returns ++n instead! Run the script and the ascending numbers should appear as in the previous step.