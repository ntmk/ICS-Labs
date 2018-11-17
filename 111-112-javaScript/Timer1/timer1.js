var n = 10;
var parkWakeUp = setInterval(countDown, 1000);
function countDown() {
  console.log("animals wake up in " + n);
  n--;
  if (n === 0) {
    console.log('park is open');
    clearInterval(parkWakeUp);
    parkHasOpened();
  }
  return true;
}
function parkHasOpened() {
  var lion = function() {console.log('roar'); };
  var elephant = function() {console.log('trumpet'); };
  var parrot = function() {console.log('sqwuawk'); };
  var simba = setInterval(lion, 1000);
  var dumbo = setInterval(elephant, 1200);
  var iago = setInterval(parrot, 1500);
  setTimeout(function() {
  console.log('park is closed');
  clearInterval(simba);
  clearInterval(dumbo);
  clearInterval(iago); 
  }, 10000);
  
  return true;
}