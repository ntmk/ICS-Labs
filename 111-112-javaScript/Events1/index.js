function newAccount() {
  var textInput = document.querySelector('#username');
  textInput.focus();
}
window.addEventListener('load',newAccount,false);
var textInput = document.querySelector('#username');
var elemFeedback = document.querySelector('#feedback');
function checkUsername() {
  var username = textInput.value;
  if (username.length < 5) {
    elemFeedback.className = 'warning';
    elemFeedback.textContent = 'oop...not enough letters';
  }
  else {
    elemFeedback.textContent = "";
  }
}
function tipUsername() {
  elemFeedback.className = 'tip';
  elemFeedback.innerHTML ='Username must be at least 5 characters';
}
textInput.addEventListener('focus',tipUsername,false);
textInput.addEventListener('blur',checkUsername,false);
var msg = '<div class=\"header\"><a id=\"close\" href="#">close X</a></div>';
msg += '<div><h2>System Maintenance</h2>';
msg += 'Our servers are being updated between 3 and 4 a.m. ';
msg += 'During this time, there may be minor disruptions to service.</div>';
var elemNote = document.createElement('div');
elemNote.setAttribute('id','note');
elemNote.innerHTML = msg;
document.body.appendChild(elemNote);
function dismissNote() {
  document.body.removeChild(elemNote);
}
var elemClose = document.querySelector('#close');
elemClose.addEventListener('click', dismissNote,false);

