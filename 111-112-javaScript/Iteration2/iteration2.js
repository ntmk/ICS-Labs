var strWord = 'discombobulation';
var wordLength = strWord.length;
var vowelCount = 0;
for (i = 0; i < wordLength; i++) {
    if ((strWord.charAt(i) == 'a') || (strWord.charAt(i) == 'e') || (strWord.charAt(i)== 'i') || (strWord.charAt(i) == 'o') || (strWord.charAt(i) == 'u') || (strWord.charAt(i) == 'y')) {
        vowelCount++
    }
}
console.log("The word " + strWord + " has " + vowelCount + " vowels.");
var amount = 0;
var principal = 1000;
var rate = 0.05;
console.log("Year Amount on Deposit");
for (year = 1; year <= 10; year++) {
    amount = principal * Math.pow(1.0 + rate, year);
    console.log(year + " " + amount.toFixed(2));
}
var strStars = '************';
for (i = 10; i > 0; i--) {
    strStars = strStars.substr(1,i);
    console.log(strStars);
} 
var strWordA = 'apple';
var strWordB = 'scarf';
strScrambled = "";
for (i = 0; i < strWordA.length; i++) {
    strScrambled = strScrambled + strWordA[i] + strWordB[i];
}
console.log(strScrambled);
strScrambled = "";
for (i= 0,j = strWordB.length - 1; i < strWordA.length; i++,j--) {
    strScrambled = strScrambled + strWordA[i] + strWordB[j];
}
console.log(strScrambled);










