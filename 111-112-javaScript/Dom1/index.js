var headingElem = document.getElementById("catalog");
if (headingElem.hasAttribute('class')) {
  var attr = headingElem.getAttribute("class");
  headingElem.setAttribute("class", attr + " cool");
}
else {headingElem.className = "hot";
}
var brandList = ['Nike', 'Puma', 'LA Gear', 'Adidas', 'Vans'];
var listShoes = document.getElementById("brands");
for (var i = 0;i<brandList.length; i++) {
  var item = document.createElement('li');
  var itemText = document.createTextNode(brandList[i]);
  item.appendChild(itemText);
  listShoes.appendChild(item);
}
var listItems = document.getElementsByTagName('li');
for (var i = 0; i < listItems.length; i++) {
  listItems[i].className = 'cool';
}
var headingText = headingElem.firstChild.nodeValue;
var newHeading = headingText + ' - <span>' + listItems.length + ' brands</span>';
headingElem.innerHTML = newHeading;
var brandCode = [ 3402,5923,6492,3810,1593];
function tableCreate() {
 var body = document.body;
 var brandTable = document.createElement('table');
 brandTable.style.width = '200px';
               brandTable.style.border = '1px solid black';
               for (var i = 0; i < brandList.length; i++) {
                 var tr = brandTable.insertRow();
                 var td =tr.insertCell();
                 td.appendChild(document.createTextNode(brandList[i]));
        td.style.border = '1px solid black';
                 td = tr.insertCell();
      td.appendChild(document.createTextNode(brandCode[i]));
 td.style.border = '1px solid black';
               }
  body.appendChild(brandTable);
}
tableCreate();
var liToRemove = listShoes.childNodes[2];
listShoes.removeChild(liToRemove);
var imgElem=document.createElement('img');
imgElem.src 
= "https://s-media-cache-ak0.pinimg.com/564x/60/e4/e2/60e4e2b21d2df744bfe34edafb4d5e77.jpg";
document.body.appendChild(imgElem);
 imgElem.style.width = "188px";
             imgElem.style.height = "282px";

