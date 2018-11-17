if (window.sessionStorage) {
    var username = document.querySelector('#username');
    var answer = document.querySelector('#answer');
    username.value = sessionStorage.getItem('username');
    answer.value = sessionStorage.getItem('answer');
}
function saveUsername() {
    sessionStorage.setItem('username', username.value);
  }
function saveAnswer() {
  sessionStorage.setItem('answer', answer.value);
}
  
username.addEventListener('input', saveUsername, false);
answer.addEventListener('input', saveAnswer, false);
function clear() {
  sessionStorage.setItem('username',"");
  sessionStorage.setItem('answer',"");
}
var clickClear = document.querySelector('#clear');
clickClear.addEventListener('click',clear,false);