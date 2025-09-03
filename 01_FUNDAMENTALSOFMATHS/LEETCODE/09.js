// Palindrome Number
var isPalindrome = function (x) {
  if (x < 0) {
    return false;
  }
  let temp = x;
  let rev = 0;
  while (temp != 0) {
    n = temp % 10;
    temp = parseInt(temp / 10);
    rev = rev * 10 + n;
  }
  return x == rev;
};
console.log(isPalindrome(-121));