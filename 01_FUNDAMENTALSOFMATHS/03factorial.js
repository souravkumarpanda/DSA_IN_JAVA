// 3. Find a factorial of the number.
// Iterative
function fact(fnum) {
  let i = 1;
  let result = 1;
  while (i <= fnum) {
    result = result * i;
    i = i + 1;
  }
  return result;
}
console.log(fact(4));
// Recursive
function factR(frnum) {
  if (frnum == 0 || frnum == 1) {
    return 1;
  }
  return frnum * factR(frnum - 1);
}
console.log(factR(4));