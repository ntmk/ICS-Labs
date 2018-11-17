1. Declare a variable named strWord and assign to it the literal string "discombobulation".
2. Declare a variable named wordLength and assign to it the length of strWord.
3. Declare a variable named vowelCount and assign to it zero.
4. Use a for-loop structure to count how many vowels (a,e,i,o,u,y) are contained in strWord. In JavaScript you can use either the string substr method, the string charAt method, or use the index. For example, for the string variable str = "abc", then str.substr(0,1) is "a", str.charAt(0) is "a", and str[0] is "a". You do not have to check for upper case letters.
5. Use console.log to display the text "The word ... has ... vowels."  where ... and ... are strWord and the vowel count, respectively.
6. Declare a variable named amount and initialize it to zero.
7. Declare a variable named principal and initialize it to 1000.
8. Declare a variable named rate and initialize it to 0.05 (or 5e-2).
9. Use console.log to output column headings "Year" and "Amount on Deposit".
10. Use a for-loop structure with the variable year as the counter from year = 1 to year = 10 in steps of one year.  The body of the for-loop should calculate amount as principal * Math.pow( 1.0 + rate, year ), and then use console.log to print the year and the value of amount for that year.  Since JavaScript will output the calculated amount as several decimal places, use the toFixed(2) method on the amount to round the values to the nearest penny instead.
11. Declare a variable strStars and assign to it the literal string "************" (there are 12 asterisks in the string).
12. Use a for-loop structure which uses strStars in the for loop body to output a line of 10 asterisks, followed by a line of 9 asterisks, followed by a line of 8 asterisks, and so on down to a single line of a single asterisk. (Hint: use the string substr method).
13. Declare a variable strWordA and assign to it the literal string "apple";
14. Declare a variable strWordB and assign to it the literal string "scarf";
15. Declare a variable strScrambled and assign to it the literal string "" (the empty string -- which is not the same as null or undefined).
16. Use a for-loop structure using i as counter which will create a new nonsense word in strScrambled consisting of the first letter of strWordA, first letter of strWordB, second letter of strWordA, second letter of strWordB, third letter of strWordA, third letter of strWordB, and so on.
17. Use console.log to output the scrambled word.
18. In JavaScript a comma operator can be useful in certain situations. The comma operator simply evaluates both of the operands so you can use it in the following example.
19. Reset the value of strScrambled to the empty string ("").
20. Instead of alternately adding both first letters of the two words, then the second letters, then the third letters, and so on, we are going to scramble the letters this way: first letter of strWordA, last letter of strWordB, second letter of strWordA, second-last letter of strWordB, and so on. This step's for-loop structure will use counter i to move forword one letter in strWordA and counter j to move backward one letter in strWordB like this:  for (var i = 0, var j = strWordB.length-1 ; i < ..... ; i++ , j-- ).
21. Use console.log to output the scrambled word.