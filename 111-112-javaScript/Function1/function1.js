function myFun(num) {
    return (num + 1);
}
function starThis(a, b){
    if ( a === undefined) { a = "";}
    
    if ( b === undefined){ b = "";}
        
    
    return ("*" + a + "*" + b +"*");
}
var p;
var q;
console.log(starThis(p,q));
function encrypt (message, num){
  var length = message.length;
  var coded = '';
  for (var i = 0; i < length; i++){
  coded +=
    String.fromCharCode(message [i].charCodeAt(0) + num);}

return coded ;
}
//console.log (encrypt("Hello, world!", 1));
function decrypt (message, num){
  var length = message.length;
  var coded = '';
  for (var i = 0; i < length; i++){
  coded +=
    String.fromCharCode(message [i].charCodeAt(0) - num);}

return coded ;
}
console.log(decrypt("Ifmmp-!xpsme\"", 1));
function transmit(f, message, num) {
    return f(message, num);

}
var m = "Today is Wednesday, January 25";
var p = transmit (encrypt, m, 3);
console.log(p);
console.log(transmit(decrypt, p, 3));
var s = function (x) { return x * 2;};
//console.log(s(44));
var f1 = (x) => (3 * x);
//console.log(f1(10));





