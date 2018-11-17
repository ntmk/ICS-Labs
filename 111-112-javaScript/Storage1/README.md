1. Check if window.sessionStorage is supported by the browser.  All the steps will be placed within the true clause of this if statement.

          if (window.sessionStorage) {

2. If so, then declare with var a variable username and assign to it the element having an ID of username.

3. Also, declare with var a variable answer and assign to it the element having an ID of answer.

4. Assign to username.value the sessionStorage.getItem('username')

5. Assign to answer.value the sessionStorage.getItem('answer')

6. Declare a new function named saveUsername having no arguments.  This function will set the username item in sessionStorage to username.value.   sessionStorage.setItem('username', username.value)

7. Declare a new function named saveAnswer having no arguments. This function will set the answer item in sessionStorage to answer.value.  See above step for hints.

8. Add an eventListener to username on the input event to call saveUsername.  username.addEventListener('input', saveUserName, false).

9. Add an eventListener to answer on the input event to call saveAnswer.  See above for hints.

10. Run the script. Enter some text for the name and answer elements and click on the green Submit button (which calls blank.php and does nothing but say "cannot find blank.php" ... this is ok).

11. Rerun the script and your previous entries saved in session storage should re-appear.

12. Make the clear button on the form 'unsave' the username and answer data from session storage. You will need to do the following: define a function that will set the sessionStorage.username and sessionStorage.answer to the empty string (that's all the function need do).  Declare a variable that references the clear button and add an event listener to the clear button to call the function on the click event.