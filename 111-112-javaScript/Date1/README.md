Date Object
1. Declare a variable named labDay using var and assign to it new Date() as in var labDay = new Date().  Objects such as Date require the new keyword when they are created.

2. Use console.log to display the literal string "labDay is " followed by labDay. Note the format of the date is shown with day of the week, month name, day, year, hour, minutes, seconds and time zone (Pacific Standard Time is Greenwich Mean Time minus 8 hours).

3. Use console.log to output the value labDay.toDateString().  Note the difference from the above.  The hours and minutes are not shown.

4. Use console.log to output the value labDay.toTimeString(). This method only shows the time and not the date values.

5. Use console.log to display the literal string "labDay as UTC is " followed by labDay.getTime(). This method shows the UTC (Universal Time Co-ordinated) format -- the number of milliseconds since midnight January 1, 1970. 

6. Use console.log to output the string labDay.getDay() + " / " + labDay.getMonth() + " / " + labDay.getYear().  Note that the values returned from the methods getDay() and getMonth() are zero-based.  The getYear() returns the number of years since 1900.

7. Use console.log to output the string labDay.getHours() + " : " + labDay.getMinutes().

8. Change the new Date() in step 1 to new Date(2017, 5, 15) and re run the script. Note the changes in the display. Another way to create a Date is to use Date.now(). Declare a variable now using var and assign to it Date.now().

9. Use console.log to output the value of now. Notice it is not the string version of the day, month, and year, but rather the UTC format.  Date.now() is the same as (new Date()).getTime().

10. Declare a variable errorDate with var and assign to it new Date(2016, 33, 1).  The 33 value is the month number for the year 2016 but JavaScript will see that it is more than 11 and scale the actual date forward by (33 minus 11) months.

11. Use console.log to output errorDate.  Note that this date value has been set forward into 2018 October because of the incorrect month value used in the previous step.

12. Another way to define dates is to provide the string literal as "October 23, 2017" for example.  What happens if there is an error in the string literal?  Define a variable named invalidDate with var and assign to it new Date("Funuary 3, 2018").  

13. Use console.log to output invalidDate.  It should show Invalid Date...this is a string literal. JavaScript code can verify if a date is valid by comparing with this string.

14. You may have noticed that the weekday and month names are displaying in their shortened form (e.g. Mon, Tue, Jan, Feb, etc). JavaScript has options to change that display format and the language as well (in case your web site is catering to languages other than English). Declare a variable named options using var and assign to it the following object literal:   { weekday: 'long' ,  year: 'numeric', month: 'long', day: 'numeric' }

15. Use console.log to output labDay.toLocaleString('de-DE', options).  The toLocalString() method accepts argument values to switch the language display to other languages and display formats.  The 'de-DE' locale is for the German language.

16. The only way to add time to a Date object is to use the UTC representation (the number of milliseconds since Jan 1, 1970) and add in the amount of extra milliseconds for a forward date (or subtract milliseconds for a prior date -- yes, that is how you get a JavaScript Date for a time before Jan 1, 1970). The next part will demonstrate how to add in enough milliseconds to a Date object to push it into the next day.

17. Declare a variable msDay with var and assign to it the expression that calculates the number of milliseconds in one day (hint: 24 hours in one day, 60 minutes in one hour, 60 seconds in one minute, 1000 milliseconds in one second).

18. Declare a variable mslabDay with var and assign to it labDay.getTime().

19. Assign to labDay a new Date( mslabDay + msDay ) to create a new date (tomorrow).

20. Use console.log to display the labDay variable. It should show as June 16's date with the same hour and minute.

21. [Challenge - This part is intended to offer more challenge to complete. If you get stuck or need help, contact the instructor]  Most employees are paid on Fridays on a two week pay cycle. Last year's pay period ended on Friday December 30, 2016 so the first pay period for 2017 ends on Friday January 13, 2017, the second pay period ends on Friday January 27, 2017. Let's use JavaScript to display all the employee pay periods' 26 pay days for the 2017 calendar year.  Declare a function named showPayPeriods which accepts a single argument: a Date of the previous year's pay day (e.g. new Date('December 30, 2016')). The function displays the following pay period information using console.log. The function should use some type of loop statement. The function should have a return true as its last statement.

    pay period 1 : Fri Jan 13 2017
    pay period 2 : Fri Jan 27 2017
    pay period 3 : Fri Feb 10 2017
    ...
    pay period 25 : Fri Dec 15 2017
    pay period 26 : Fri Dec 29 2017