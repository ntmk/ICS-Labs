var sum = 0;
var count = 1;
while (count <= 20) {
    sum += count++;
    }
console.log("The sum of the first 20 numbers is " + sum);
var sum = 0;
var count = 1;
while (count <= 20) {
    if (count % 2 === 0){
        sum += count;
        }
    count++;
    }
console.log("The sum of the even numbers between 1 and 20 is " + sum);
var sum = 0;
var count = 1;
while (count < 100) {
        counter = count.toString();
        if ((counter == 3) || (counter == 7)) {
            count++;
        }
        else if ((counter == 33) || (counter == 77)) {
            count++;
        }
        if ((counter.match(/3/g) > 0) || (counter.match(/7/g) > 0)) {
            count++;
        }
        else {
            sum += count;
            count++;
        }
    }
console.log("The sum of the nice numbers between 1 and 100 is " + sum);
var wordList = "";
i = 0;
words = [];
do {
    wordList = prompt("Enter word") + i++;
    words.push(wordList);
}
while (i < 10);
console.log("The list of entered words is " + words);












