** NOTE: You should be able to complete this lab by yourself but the test portion to submit is not working 100% yet. I may have to test this manually for each student.  I will advise later. **

1. Declare a variable lion using var.  The variable lion will be a function object defined in the following step.

2. Assign to lion the function object.  var lion = function() { console.log('roar'); };

3. Declare a variable elephant using var. The variable elephant will be a function object defined in the following step.

4. Assign to elephant this function object: function() { console.log('trumpet'); };

5. Declare a variable parrot using var. The variable parrot will be a function object defined in the following step.

6. Assign to parrot this function object: function() { console.log('squawk'); };

7. Use console.log to display a string literal: "park is open".

8. Declare a variable simba using var and assign to simba this function: setInterval(lion, ?);  For example, 
var simba = setInterval(lion, ?);. You must replace the ? with a number that represents how often simba roars at the park, make it every second -- not millisecond!

9. Declare a variable dumbo using var and assign to dumbo a similar function as above but dumbo does not trumpet as often as simba roars. In fact, he only trumpets every 1.2 seconds.

10. Declare a variable iago using var and assign to iago a similar function as simba ...iago is a bit cranky today so he squawks every 1 and half seconds.

11. Do not run the script, yet. If you do, the timer will run indefinitely and you will need to enter the following: 
             clearInterval(simba); clearInterval(dumbo); clearInterval(iago); 
  to stop the timers.

12. Enter the following statement. This sets up the timeout condition (after 10000 milliseconds), run the anonymous function to show the 'park is closed' message then clear the three timer interval objects.

       setTimeout( function() { console.log("park is closed");
                                            clearInterval(simba);  
	                                    clearInterval(dumbo);  
				            clearInterval(iago);  
				        }, 10000);
 
13. Run the script. Note that the function objects run independently and display the animals' sounds either every 1000 milliseconds, 1200 milliseconds, or 1500 milliseconds. Then after 10 seconds, the setTimeout fires and the clearInterval functions stop the three animal timers.

14. Declare a variable parkWakeUp with var and assign to parkWakeUp the following:
              
			    var parkWakeUp = setInterval( countDown, 1000);
				
     This sets up an interval timer that will fire every 1000 milliseconds and make a call to a new function called countDown.
	   
15. Declare a new function named countDown having no arguments. The function contains a console.log  that displays the literal string: "animals wake up in " followed by n.
 
16. The next line in the countDown function is a statement that decrements n by one.

17. The next line in the countDown function is a check if n is zero.  If n is zero, there are three  statements to run:  first, use console.log to display the literal string "park is open".  Second, we need to stop the parkWakeUp interval timer (figure that yourself). Third, make a call to a new function named parkHasOpened. This function has no arguments and is described below in step 19.
 
18. There is nothing to do if n is 1 or more, so just return true at the end of the countDown function.

19. Declare a new function named parkHasOpened.  This function will set up all the animal interval timers and start them *and* has the setTimeout to close the park after 10 seconds.  You will move the relevant statements from steps 1-6, plus 8-10, plus 12 inside this parkHasOpened function. Plus, you may remove the extra console.log('park is open') statement from step 7 because you are already doing that in step 17. Add a return true statement at the bottom of the parkHasOpened function. It isn't really necessary but it is good practice for functions to return a value. 

20. Declare a variable n at the top of the script and assign 10 to it.  Yes, it is a global variable so function countDown can see and modify it.

21. When you run the script, there should be ten messages appearing every second, counting down until the park opens.  Then the parkWakeUp interval is cleared and the animals' interval timers start up in the parkHasOpened function.

22. The timer objects you used in this short script are: simba, dumbo, iago, and parkWakeUp.