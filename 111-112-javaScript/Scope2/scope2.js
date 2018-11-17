console.log("The value of a is " + a);
function myFun() {
    b = 200;
    a++;
    console.log("The sum of a and b is " + (a+b));
}
var a = 100;
myFun();
function bigFun() {
    var outerCount = 0;
    function smallFun() {
        innerCount = 0;
        innerCount = outerCount++;
        return innerCount;
    }
    smallFun();
    console.log("in bigFun outerCount is " + outerCount);
    //console.log("in bbigFun innerCount is " + innerCount);
    return outerCount;
}
//console.log("in global space " + smallFun());
console.log("in global space " + bigFun());
//console.log("in global space outerCount is " + outerCount);
var m = function() {
    var n = 100;
    //function bar() {
        n++;
        //return n;
    //}
    return function() {return n++};
};
var s = m();
console.log(s());
console.log(s());
console.log(s());

