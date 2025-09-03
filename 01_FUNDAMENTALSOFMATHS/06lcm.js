// 6. Finding the LCM of two number
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
function lcm(a, b) {
  return (a * b) / gcdOptimize(a, b);
}
console.log(lcm(15, 20));