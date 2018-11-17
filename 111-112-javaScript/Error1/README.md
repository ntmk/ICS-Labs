Handling Exceptions

1. To prevent your application from crashing unexpectedly due to a runtime error, you can write code that handles any exception.  These are runtime errors that occur due to unwanted error conditions that you have anticipated during the code design and want to handle gracefully within the code so that the user does not have an unpleasant experience dealing with a mysterious error.

2. Declare a function named calcFutureValue which accepts three arguments: principal, rate, and years. Inside the function if the principal value is less than or equal to zero, throw an error like this: new Error("Principal value must be greater than zero").  If the rate value is less than or equal to zero, throw an error: new Error("Rate value must be greater than zero").  If the years value is less than or equal to zero, throw an error: new Error("Years value must be greater than zero").

3. Checking the argument values first within a function is good coding practice. You do not want the function to perform calculations on invalid amounts. Now that the function arguments have been properly vetted, the function can proceed to do its work. Next:
Declare a variable monthlyRate using var and assign to it the expression rate divided by twelve divided by 100.
Declare a variable months using var and assign to it the expression years multiplied by twelve.
Declare a variable futureValue using var and assign to it the value of zero
Define an iteration loop that will loop months number of times and inside the body of iteration loop assign to futureValue the expression of (futureValue + principal) times (one plus monthlyRate)
Return the futureValue fixed to two decimal places.

4. Now we create a 'test harness' function that will call calcFutureValue with test values in the arguments. Declare a variable named calc and assign to it an anonymous function expression.  Inside the function expression, create a try-catch block.  Inside the try block:
Declare a variable investment and assign to it the value of 10.
Declare a variable annualRate and assign to it the value of 4;
Declare a variable years and assign to it the value of 5;
Assign to variable futureValue the function call to calcFutureValue with the arguments investment, annualRate, and years.
Return the variable futureValue

5. Inside the catch block, use this code:
       catch (error) {
          console.log(error.message);
      }

6. Do not forget the function expression needs a semicolon at the end.

7. Call the function object calc like this:  calc();  Run the script.  The display should read '665.20'.

8. Modify the values of investment, annualRate, and years in the test harness to confirm the error messages are created appropriately when the script is run.  The catch block is used when the try block encounters an error thrown by the function calcFutureValue.
