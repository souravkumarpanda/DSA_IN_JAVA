// Count the Digits That Divide a Number
function countDigits(num) {
    let count = 0;
    let originalNum = num;
    while (num > 0) {
        let digit = num % 10;
        if(digit !== 0 && originalNum%digit === 0){
            count++;
        }
        num = Math.floor(num/10);
    }
    return count;
}
console.log(countDigits(131));