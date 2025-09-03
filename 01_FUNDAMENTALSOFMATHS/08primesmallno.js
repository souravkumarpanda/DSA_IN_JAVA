// 9. Print all the prime numbers smaller than the given number.
function printPrimes(n) {
  for (i = 2; i < n; i++) {
    if (isPrime(i)) {
      console.log(i);
    }
  }
}
console.log(printPrimes(10));
// Optimized code using Sieve of Eratosthenes Algorithm
function isPrimeSoE(n) {
  let prime = [];
  for (let i = 0; i <= n; i++) {
    prime[i] = true;
  }
  for (let p = 2; p * p <= n; p++) {
    if (prime[p] == true) {
      for (i = p * p; i <= n; i += p) {
        prime[i] = false;
      }
    }
  }
  for (i = 2; i <= n; i++) {
    if (prime[i]) {
      console.log(i);
    }
  }
}
console.log(isPrimeSoE(10));