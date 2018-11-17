1. Run the script and note the appearance of the items.

2. Add the jQuery  $('li em').addClass('seasonal').

3. Add the jQuery $('li.hot').addClass('favorite').

4. Run the script and see that the first item (seasonal) has changed appearance to include the calendar icon and the those with the 'hot' class have the 'heart' symbol.

5. The next jQuery will loop through all the list item elements so that all except the first list element appear hidden at first and then gradually fade in.  Add the jQuery

      $('li[id!="one"]').hide()
                        .delay(500)
                        .fadeIn(1400);

6. jQuery can add new content to the page. Add the jQuery below.  This adds a new paragraph to the start of the unordered list element.
              
                $('ul').before('<p class="notice">Just updated</p>');

7. Add the jQuery below. This adds a plus sign to any list element having a class of 'hot'.

               $('li.hot').prepend('+ ');

8. Add the jQuery below. This declares a new list item element with some content.

               var newListItem = $('<li><em>gluten-free</em> wasabi sause</li>');

9. Add the jQuery below. This adds the new list item element to the bottom of the unordered list.

                $('li:last').after(newListItem);

10. jQuery can manage attributes such as class and ID. Add the jQuery below. This removes the tangerine list item from the 'hot' class.

                $('li#three').removeClass('hot');

11. Add the jQuery below: This adds the last list item to the class 'favorite'.

                $('li:last').addClass('favorite');

12. Add the jQuery below. This adds the id='group' attribute to the unordered list element.

                  $('ul').attr('id', 'group');

13. In jQuery the .on() method is used to handle all events.  This example will make the mouseover and click events for each list element display that element's ID attribute. Add the jQuery below to start. The id variable will hold the selected list item element's ID attribute.  The listItems will reference all the list items.

                 var id = '';
                 var listItems = $('li');

14. Add the jQuery below.  This defines the event listener in jQuery for the mouseover event. The this.id returns the ID attribute for the selected list item.

               listItems.on('mouseover', function() {
                     id = this.id;
                     listItems.children('span').remove();
                     $(this).append(' <span class="priority">' + id + '</span>');
               });

15. Add the jQuery below. This event listener causes the id span element to be removed when the user mouseouts from the list element.

               listItems.on('mouseout', function() {
                  $(this).children('span').remove();
               });

16. This example shows an animation feature of jQuery. When you click on any of the list item elements, the custom animation will trigger. Inside the .animate() method, the opacity and paddingLeft are changed. The value of the paddingLeft property is increased by 80 pixels, which makes it look like the text is sliding to the right as it fades out.  The .animate() method has two more arguments. The first is the speed of the animation in milliseconds -- here 500 ms. The second is another anonymous function indicating what should happen when the animation ends.  When the animation is finished, the callback function removes that list item from the the page using the .remove() method.

               $('li').on('click', function() {
                    $(this).animate({
                     opacity: 0.0,
                     paddingLeft: '+=80'
                  }, 500, function() {
                               $(this).remove();
                             });
                });
