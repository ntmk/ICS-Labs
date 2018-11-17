$('li em').addClass('seasonal');
$('li.hot').addClass('favorite');
$('li[id!="one"]').hide().delay(500).fadeIn(1400);
$('ul').before('<p class="notice">Just updated</p>');
$('li.hot').prepend('+ ');

var newListItem = $('<li><em>gluten-free</em> wasabi sause</li>');

$('li:last').after(newListItem);
$('li#three').removeClass('hot');
$('li:last').addClass('favorite');
$('ul').attr('id', 'group');

var id = '';
var listItems = $('li');

listItems.on('mouseover', function() {
  id = this.id;
  listItems.children('span').remove();
  $(this).append(' <span class="priority">' + id + '</span>');
});

$('li').on('click', function() {
$(this).animate({
opacity: 0.0,
 paddingLeft: '+=80'
}, 
500, function() {
$(this).remove();
});
});