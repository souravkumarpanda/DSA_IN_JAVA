// 5.Find the HCF or GCD of two number.
// e.g:- 20 = 2*2*5
//       28 = 2*2*7
// HCF/GCD = 4
function gcd(a, b) {
  let result = Math.min(a, b);
  while (result > 0) {
    if (a % result == 0 && b % result == 0) {
      break;
    }
    result--;
  }
  return result;
}
console.log(gcd(8, 6));
// optimizing by using Euclidian Algorithm
function gcdOptimize(x, y) {
  if (x == 0) {
    return y;
  }
  if (y == 0) {
    return x;
  }
  if (x == y) {
    return x;
  }
  if (x > y) {
    return gcdOptimize(x - y, y);
  }
  if (y > x) {
    return gcdOptimize(y - x, x);
  }
}
console.log(gcdOptimize(36, 60));