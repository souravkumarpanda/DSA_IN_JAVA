// 4.Find the count of Trailing zeroes in a factorial
// e.g:- 5! = 5*4*3*2*1 = 120 so No of zeroes = 1
function findTrailingZeroes(tnum) {
  if (tnum < 0) {
    return -1;
  }
  let count = 0;
  for (let i = 5; Math.floor(tnum / i) >= 1; i *= 5) {
    count += Math.floor(tnum / i);
  }
  return count;
}
console.log(findTrailingZeroes(4));
console.log(findTrailingZeroes(5));
console.log(findTrailingZeroes(10));
console.log(findTrailingZeroes(15));
console.log(findTrailingZeroes(20));
console.log(findTrailingZeroes(25));
console.log(findTrailingZeroes(100));