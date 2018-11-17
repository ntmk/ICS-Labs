Part 1. Selecting an element and modifying its style

1. In the index.js file declare a new variable naemd headingElem with var and assign to it the element having the ID of catalog.  You can use either querySelector or getElementById.  Your JavaScript now has a variable that references that element in the DOM.

2. Write an if statement that checks whether headingElem has an attribute of 'class'.  If so, then you need to provide two statements: the first is to declare a new variable attr to be the heading's class attribute and the second is to set the class attribute of headingElem to be that attribute and the class style of 'cool' (which is already defined in the index.css file.  If headingElem does not have a class attribute, then assign to headingElem the class style of 'hot' using the className property.

        if (headingElem.hasAttribute('????')) {
               var attr = headingElem.getAttribute('????');  
               headingElem.setAttribute('class', attr + '  ????');
        } else {
              headingElem.className = '????';
        }

3. Run the script.  You should see the Brand catalogue heading text with green background and modified font and width (that is the combination of the header class style and the cool class style). 

Go to the index.html page and remove the "class='header'" attribute from the h1 element and rerun the script. The heading text should appear with orange background and full width because only the class='hot' style is applied to the h1 element, not the header style.

Part 2. Adding list element items 

4. Declare an array named brandList using var and assign to it the following items: 'Nike', 'Puma', 'LA Gear', 'Adidas', 'Vans'.

5. Declare a variable named listShoes and assign to it the element having the id of 'brands'.

6. This step will add in the brandList as new list item elements to the unordered list. Use a for loop structure to loop the counter i from zero to brandList.length one at a time. Within the for loop, declare a new variable named item using var and assign to it document.createElement('li'). Then the next line will declare a new variable named itemText using var assign to it document.createTextNode( brandList[i] ).  Then the next line will append the itemText node as a child to item:  item.appendChild(itemText). Finally, the last line in the loop body will append the item as a child to listShoes:  listShoes.appendChild(item).

7. Run this script.  You should see the new unordered list appear in the page with the five shoe brands.

Part 3, Applying a class style to a collection of elements

8. Declare a new variable listItems using var and assign to it all the li tag elements.  You can use querySelectorAll or getElementsByTagName.

9. Use a for loop structure to loop the counter i from zero to listItems.length one at a time. The body of the loop should assign the 'cool' class to each listItem element:  listItems[i].className = '????';

10. Run the script.  The list items should appear with green background and modified typeface.

Part 4. Extracting and modifying an element's text

11. Declare a new variable headingText using var and assign to it headingElem.firstChild.nodeValue.  This represents the text in that element.  Declare a new variable named newHeading and assign to it
    headingText + ' - <span> " + listItems.length + '  brands</span>'. 

12. Use the innerHTML property of heading to assign to it newHeading. 

 headingElem.innerHTML = newHeading;

13. Run the script.  The heading should include the additional text of ' - 5 brands'.

Part 5. Building an HTML table element using JavaScript

14. In this part you will build an HTML table consisting of two columns and five rows. 
 The first column is the brand name and the second column is a made-up brand code, one
 for each brand.
 Declare a new array named brandCode having five numeric values of 3402, 5923, 6942, 3810, and
 1593.

15. Declare a new function named tableCreate having no arguments. 

16. Inside the function declare a new variable named body assigned to document.body.

17. Next declare a new variable brandTable assigned to document.createElement('table');

18. Let's style the table. The next two lines are

               brandTable.style.width = '200px';
               brandTable.style.border = '1px solid black';
               
19. Make a new for loop with loop counter i that loops through each element in brandList.

20. Inside the for loop, declare a new variable tr using var and assign to tr brandTable.insertRow();

Declare a new variable td using var and assign to td tr.insertCell();
 Next, you append the brandList[i] as a new text node to the td element.

             td.appendChild(document.createTextNode(brandList[i]));
 
  3. Style the brand name td border:  td.style.border = '1px solid black';

 4.  Insert a new cell  td = tr.insertCell();

 5.  Append the brandCode[i] as a new text node to the td element

	    td.appendChild(document.createTextNode(brandCode[i]));
	    
 6.  Style the brand code td border:  

            td.style.border = '1px solid black';

27.  End of the for loop. After the for loop, append the brandTable element to the body:

           body.appendChild(brandTable);
           
28. End of the tableCreate function.

29. Invoke the tableCreate function:  

           tableCreate();

30. Run the script. You should see the table of five rows and two columns.

Part 6. Removing an element

31. To remove an element from a list using JavaScript, first assign a reference to it:

             var liToRemove = listShoes.childNodes[2];

32. Then, invoke the removeChild method on the list:

             listShoes.removeChild(liToRemove);
             
33. Run the script, the list should appear with one less list element.

Part 7. Adding an image

34. Declare a new variable named imgElem using var and assign to it 

             document.createElement('img');

35. Next, set the src attribute for the image: (you can use any image but it must come from an https protocol for repl.it to work)

 imgElem.src 
= "https://s-media-cache-ak0.pinimg.com/564x/60/e4/e2/60e4e2b21d2df744bfe34edafb4d5e77.jpg"

36. Next, append the child element to the body: 

             document.body.appendChild(imgElem);

37. Modify the image width and height attributes: 

             imgElem.style.width = "188px";
             imgElem.style.height = "282px";


end of DOM_1
