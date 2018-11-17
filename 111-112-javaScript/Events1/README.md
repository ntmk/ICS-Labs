User Interface event
Run the script and note how the new account form does not provide focus to the username element (the textbox below the text Create a username:). When the window loads in the browser, what is supposed to happen is the "create a username" textbox element should receive the focus so the user can start typing that in.
Declare a new function named newAccount having no arguments. This function will make the form's input element having an ID of username receive focus.   Declare a new variable named textInput using var and assign to it document.querySelector('#username').  Then give the element focus using this JavaScript statement: textInput.focus(). That is all you need for the newAccount function.
When the page loads, you want to call the newAccount function, so add in this JavaScript statement:  window.addEventListener('load', newAccount, false);  Run the script and ensure the cursor appears correctly in the username input textbox element.

4. When the username input element loses focus, we need to check the entered username length is at least 5 letters.  Declare a new function named checkUsername having no arguments. 

5. Inside the function declare a new variable named textInput using var and assign to it the element having the ID attribute of username.

6. Declare a new variable named elemFeedback using var and assign to it the element having the ID of feedback.  This element displays feedback messages to the user based on their username entry.

7. Declare a new variable named username using var and assign to it the value of textInput: username = textInput.value.  This assigns the literal string entered in the username box to the username variable.

8. Check if the string username has less than five characters.  If it does, then set the elemFeedback.className to 'warning' and set the elemFeedback.textContent  to 'ooops...not enough letters'.  If the username length is five or more characters, all is ok so set the elemFeedback.textContent to the empty string.  This is all the checkUserName function need to do.

9. Declare a new function named tipUsername having no arguments. Inside the function set the elemFeedback class name to 'tip' and the elemFeedback innerHTML to 'Username must be at least 5 characters'.  That is all this function need perform.

10. We need to attach focus and blur event handlers to the username element.  Since we need to use references to both username and feedback, move the statements in step 5 and 6 (the ones that declared textInput and elemFeedback) out of the function and place it after the function so the variables are now global, accessible to all functions and code outside functions.

11. Add the event listener for the username's focus event:  textInput.addEventListener('focus', tipUsername, false).

12. Add the event listener for the username's blur event.  It calls the checkUsername function. (see step 11 for a hint)

13. Run the script. You should be prompted for a username and a tip should appear just below the username element.  Enter two letters and tab out of the username (or click in the password box). The checkUsername function should cause the error message to appear.  Add in a valid username and press the tab key to 'blur' out of the field.  The tip text disappears.

14. This step defines a click event listener on a close button. Declare a new variable msg using var and use this text below to assign to it.

var msg = '<div class=\"header\"><a id=\"close\" href="#">close X</a></div>';
msg += '<div><h2>System Maintenance</h2>';
msg += 'Our servers are being updated between 3 and 4 a.m. ';
msg += 'During this time, there may be minor disruptions to service.</div>';

15. Declare a new variable named elemNote with var and assign to it a new div element  var elemNote = document.createElement('div');

16. Set the ID attribute of elemNote to 'note'.  elemNote.setAttribute('id', 'note');

17. Set the innerHTML of elemNote to msg.  elemNote.innerHTML = msg.

18. Add it to the page  document.body.appendChild(elemNote);

19. Declare a new function dismissNote having no arguments.  The only statement in the function is to remove the note.   document.body.removeChild(elemNote);

20. Declare a new variable elemClose with var and assign to it the element having the ID of close.

21. Attach the click event listener to elemClose to call dismissNote.  elemClose.addEventListener('click', dismissNote, false);

22. Run the script.  The system maintenance note should appear and the close button will respond to the click event to make the window go away.

23. You may have noticed that if you enter a username having less than 5 letters, the warning message appears and the form allows the user to tab or click out of the username box rather than force the user to stay on the username box until the entry is valid.  Also, when you enter a valid username, tab down to the password box, and then return back to the username box, the tip message reappears even though the username is valid. These are usability design features that will need to be tested by users to see how well they respond to them.