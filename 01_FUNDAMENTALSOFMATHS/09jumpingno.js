//10. Given a positive int n, print all jumping numbers smaller than or equal to n. A number is called a jumping number if all adjacent digits in it differ by 1. For example, 8987 and 4343456 are jumping numbers, but 796 and 89098 are not. All single digit numbers are considered as jumping numbers.
// Example:
// Input: 105
// Output: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 21, 23, 32, 34, 43, 45, 54, 56, 65, 67, 76, 78, 87, 89, 98, 101]
var jumpingCode = function (n) {
  let queue = new Array();
  for (let i = 1; i <= 9; i++) {
    queue.push(i);
    while (!queue.length == 0) {
      let temp = queue.shift();
      if (temp > n) continue;
      console.log(temp);
      let leftMost = temp % 10;
      if (leftMost > 0) queue.push(temp * 10 + (leftMost - 1));
      if (leftMost < 9) queue.push(temp * 10 + (leftMost + 1));
    }
  }
};
console.log(jumpingCode(105));
// Optimal sol TC=O(k)
function printJumpingNumbers(N) {
  // Function to perform BFS starting from a given digit
  function bfs(x) {
    const queue = [];
    queue.push(x);

    // BFS loop
    while (queue.length > 0) {
      const num = queue.shift();

      if (num <= N) {
        result.push(num);

        const lastDigit = num % 10;

        // If last digit is 0, append lastDigit + 1
        if (lastDigit > 0) {
          queue.push(num * 10 + (lastDigit - 1));
        }
        // If last digit is 9, append lastDigit - 1
        if (lastDigit < 9) {
          queue.push(num * 10 + (lastDigit + 1));
        }
      }
    }
  }

  const result = [];

  // Add single-digit numbers (0-9) as jumping numbers
  for (let i = 0; i <= 9; i++) {
    bfs(i);
  }

  // Sort the result and print it
  result.sort((a, b) => a - b);
  console.log(result.join(" "));
}

// Read input (example inputs provided)
function processInput(input) {
  const lines = input.split("\n");
  const T = parseInt(lines[0]);

  for (let i = 1; i <= T; i++) {
    const N = parseInt(lines[i]);
    printJumpingNumbers(N);
  }
}
// Example usage
const input = `2
  25
  45`;
processInput(input);