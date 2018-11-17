var x = 100;
function doThis() {
    var a = 10;
    b = 6;
    var x = 7;
    console.log("inside function doThis x is "+ x);
    return a + b + x;
}
console.log("doThis is " + doThis());
console.log("variable a declared in function doThis is " + typeof(a));
console.log("variable b after doThis is " + b);
console.log(" variable x after doThis is " + x);
function doThat(x) {
    a = 5;
    b = 4;
    console.log("inside function doThat x is " + x);
    return a + b + x;
}
console.log("doThat is " + doThat(3));
console.log("variable a declared in function doThat is " + typeof(a));
console.log("variable b after doThat is " + b);
