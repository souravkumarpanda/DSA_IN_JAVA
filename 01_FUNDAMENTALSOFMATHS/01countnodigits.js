// count the number of digits
// Iterative method
function countDigit(n) {
  if (n == 0) {
    return 1;
  }
  let count = 0;
  while (n != 0) {
    n = Math.floor(n / 10);
    count++;
  }
  return count;
}
console.log(countDigit(12345));

// Recursive Method
function countR(number) {
  if (parseInt(number / 10) == 0) {
    return 1;
  }
  return 1 + countR(parseInt(number / 10));
}
console.log(countR(13311331));
// Time complexity in both method is: O(n) & Space Complexity is: O(n)