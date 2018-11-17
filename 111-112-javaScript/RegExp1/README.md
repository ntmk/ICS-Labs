A regular expression is a sequence of characters describing a pattern that will be applied against some input text to determine if there is a match there.

In JavaScript you can write a regular expression in one of two ways:  using forward slashes, or using the RegExp object.   The first way is easier.

                    var re = /a/;     or   var re = new RegExp("a");

The regular expression's test method returns a true value if the match is found.

                    if ( /a/.test("happy")) {
                              console.log("found a match!");
                    }

        or         var re = /a/;
                     if ( re.test("happy")) {
                              console.log("found a match!");
                     }

The replace method used by strings allows regular expressions as first argument.

       var re = /[a-m]/g;    // the g pattern flag means global -- all a-m characters
       var str = "Lucy is at the museum.";
       console.log( str.replace( re, "+" ) );  // displays Lu+y +s +t t++ +us+u+.
 
Data cleansing is the process of ensuring that the information you need is valid and is accurate.  It is a necessary activity in information processing because you do not want to include data that have errors or problems. 

This lab's exercises provide practice writing JavaScript functions that will determine whether a string of information matches some criteria that ensure data validity. 

Note that "word" here means a standalone word with nonword boundaries surrounding. So, in this string:  "Shall I compare thee to a summer's day?", the text strings "hall", "are", "the", and "sum" are not valid matches as words (because they are part of a word) but they are valid matches for text strings.  

1. Write a function named checkA that accepts an argument named str  and returns true if that argument (a string) contains the text sequence "one" (either as a separate word or found anywhere within a word). If there is no match, the function returns false. Only lowercase "one" should match.

2. Write a function named checkB that accepts an argument and returns true if that string argument contains any of the following words: apple, banana, or cherry. (all lowercase).

3. Write a function named checkC that accepts an argument and returns true if that argument (a string) does NOT contain a single letter 'word' anywhere. So if "a", "I", 'n', 'o', or 'O'  appears in the string, false is returned. Check for any uppercase or lowercase letter as a single word.

4. Write a function named checkD that accepts an argument and returns true if there is a word in that argument string that starts with any letter from a to m and ends with any letter from n to z (upper or lowercase). So, input strings of  "Drop", "KART", and "awW" would match the regular expression.

5. Write a function named checkE that accepts an argument and returns true if the argument contains at least two A's, followed by at most two spaces, followed by at least 3 W's.

6. Write a function named checkF that accepts an argument and returns true if the argument string starts with a three digit number, then a hyphen, then five or more uppercase letters.

7. Write a function named checkG that accepts an argument string and returns a new string after it replaces all the lowercase vowels with asterisks: So, the string "I hope you have a nice day!" would return as "I h*p* y* h*v* * n*c* d*y!"