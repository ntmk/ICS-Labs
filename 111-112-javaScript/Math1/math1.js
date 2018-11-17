function calcArea(radius) {
    if (radius <=0) {
        return 0;
    }
    return Math.PI * Math.pow(radius,2);
}
console.log(calcArea(Math.SQRT2));
function calcDistance(x1,y1,x2,y2){
    s = Math.pow(x1-x2,2) + Math.pow(y1-y2,2);
    return (Math.sqrt(s));
}
console.log(calcDistance(0,0,1,1));
function throwTwoDice() {
    var d1 = Math.floor(Math.random() * 6+1);
    var d2 = Math.floor(Math.random() * 6+1);
    return d1+d2;
}
console.log(throwTwoDice());
function throwNDice(n) {
    if ((n <= 0) || (n >=7)) {
        roll = 0;
    }
    else {
        roll = n * Math.floor(Math.random() * 6+1);
    }
    
    return  roll;
}