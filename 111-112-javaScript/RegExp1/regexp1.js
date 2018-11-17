function checkA(str) {
  if (/one/.test(str)) {
    return true;
  }
    return false;
}

function checkB(str) {
  if (/\bapple|banana|cherry\b/.test(str)) {
    return true;
  }
    return false;
}
function checkC(str) {
  if (/\b[a-zA-Z]\b/.test(str)) {
    return false;
  }
    return true;
}
function checkD(str) {
  if (/\b[a-mA-m][a-zA-Z]*[n-zN-Z]\b/.test(str)) {
    return true;
  }
    return false;
}
function checkE(str) {
  if (/A{2}\s{0,2}W{3}/.test(str)) {
    return true;
  }
    return false;
}
function checkF(str) {
  if (/^\d\d\d-[A-Z]{5}/.test(str)) {
    return true;
  }
    return false;
}
function checkG(str) {
  var re = /a|e|i|o|u/g;
  return str.replace(re, "*");
}
