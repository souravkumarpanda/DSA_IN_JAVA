// Number of Digits one
function digitsOne(n) {
  let count = 0;
  for (let i = 1; i <= n; i++) {
    let currentNumber = i;
    while (currentNumber > 0) {
      if (currentNumber % 10 === 1) {
        count++;
      }
      currentNumber = Math.floor(currentNumber / 10);
    }
  }

  return count;
}
console.log(digitsOne(0));


var countDigitOne = function(n) {
    let count = 0;
    let factor = 1;
    
    while (factor <= n) {
        const higher = Math.floor(n / (factor * 10));
        const current = Math.floor(n / factor) % 10;
        const lower = n % factor;
        
        if (current === 0) {
            count += higher * factor;
        } else if (current === 1) {
            count += higher * factor + lower + 1;
        } else {
            count += (higher + 1) * factor;
        }
        
        factor *= 10;
    }
    
    return count;
};