var labDay = new Date(2017, 5, 15);
console.log("labDay is " + labDay);
console.log(labDay.toDateString());
console.log(labDay.toTimeString());
console.log("labDay as UTC is " + labDay.getTime());
console.log(labDay.getDay() + " / " + labDay.getMonth() + " / " + labDay.getYear());
console.log(labDay.getHours() + " : " + labDay.getMinutes());

var now = Date.now();
console.log(now);
var errorDate = new Date(2016, 33, 1);
console.log(errorDate);
var invalidDate = new Date("Funnuary 3, 2018");
console.log(invalidDate);
var options = {weekday: 'long', year: 'numeric', month: 'long', day: 'numeric'};
console.log(labDay.toLocaleString('de-DE', options));
var msDay = 24 * 60 * 60 * 1000;
var mslabDay = labDay.getTime();
var labDay = new Date(mslabDay + msDay);
console.log(labDay);
var payDay = new Date('December 30, 2016');
function showPayPeriods(payDay) {
    for (i=1; i <= 26; i++) {
        day = new Date (payDay.getTime() + 14 * i * msDay);
        pay = day.toDateString();
        console.log("pay period " + i + " : " + pay);
    }
    return true;
}
showPayPeriods(payDay);
