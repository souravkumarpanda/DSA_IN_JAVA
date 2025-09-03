// Given a number, explain if it's a Palindrome number
// e.g:- 123 In first step 123 % 10   = 3 |  123 / 10 = 12 then reverse=reverse*10+3=3
// Second step 12 % 10 = 2 | 12 /10 = 1 then reverse = reverse*10+2 = 32
// Third step 1 % 10 = 1 | 1 / 10 = 0 reverse = reverse*10+1 = 321
// 123 != 321 Hence it is not palindrome number

function isPalindrome(num) {
  let temp = num;
  let rev = 0;
  while (temp != 0) {
    n = temp % 10;
    temp = Math.floor(temp / 10);
    rev = rev * 10 + n;
  }
  return num == rev;
}
console.log(isPalindrome(131));