// Array define
let arr = [3, 5, 8, 7, 9, 1];

// 1.Given an array , find the index of the largest element
function maxIndex(arr) {
  let index = 0;
  for (i = 1; i < arr.length; i++) {
    if (arr[i] > arr[index]) {
      index = i;
    }
  }
  return index;
}
console.log(maxIndex([3, 5, 7, 2]));

// 2.Write the code to determine if the array is sorted already
function isSorted(arr) {
  for (i = 0; i < arr.length - 1; i++) {
    if (arr[i] > arr[i + 1]) {
      return false;
    }
  }
  return true;
}
console.log(isSorted([3, 5, 9, 11]));

// 3.Reverse array
function revArray(arr) {
  let rev = [];
  let i = arr.length - 1;
  let j = 0;
  while (i >= 0) {
    rev[j] = arr[i];
    j++;
    i--;
  }
  return rev;
}
console.log(revArray([5, 9, 6, 3]));
// Optimized code using two pointer approach
function revArr(arr) {
  let left = 0,
    right = arr.length - 1;
  while (left < right) {
    [arr[left], arr[right]] = [arr[right], arr[left]];
    left++;
    right--;
  }
  return arr;
}
console.log(revArr([5, 9, 6, 3]));
// 4. Remove duplicates from sorted array
// This is done by taken extra space
function removeDuplicates(arr) {
  let newA = [];
  newA.push(arr[0]);
  for (i = 1; i < arr.length; i++) {
    if (arr[i] == arr[i - 1]) {
      continue;
    } else {
      newA.push(arr[i]);
    }
  }
  return newA;
}
console.log(removeDuplicates([0, 1, 1, 2, 2, 3, 3, 4]));
// TC=O(n) & SC=O(n)
// If there is an array & told for any operation on sorting always use Two Pointer Approach
// Optimized code Two pointer Approach
function removeDuplicatesTPA(nums) {
  if (nums.length === 0) {
    return { count: 0, uniqueElements: [] };
  }
  let left = 0;
  for (let right = 1; right < nums.length; right++) {
    if (nums[left] != nums[right]) {
      left++;
      nums[left] = nums[right];
    }
  }
  return {
    count: left + 1,
    uniqueElements: nums.slice(0, left + 1),
  };
}
const result = removeDuplicatesTPA([0, 0, 1, 1, 1, 2, 2, 3, 3, 4]);
console.log(`Count of unique elements: ${result.count}`);
console.log(`Unique elements array: ${result.uniqueElements}`);

// 5.Convert 2D Array to Tranpose Matrix
function transpose(mat) {
  for (let i = 0; i < mat.length; i++) {
    for (let j = i; j < mat[0].length; j++) {
      temp = mat[i][j];
      mat[i][j] = mat[j][i];
      mat[j][i] = temp;
    }
  }
}
mat = [
  [1, 2, 3],
  [4, 5, 6],
  [7, 8, 9],
];
transpose(mat);
console.log(mat);

// 6.Rotate the given matrix 90 degree in clock-wise
function rotate90(mat) {
  for (let i = 0; i < mat.length; i++) {
    for (let j = i; j < mat[0].length; j++) {
      temp = mat[i][j];
      mat[i][j] = mat[j][i];
      mat[j][i] = temp;
    }
  }
  for (let i = 0; i < mat.length; i++) {
    revArr(mat[i]);
  }
}
function revArr(arr) {
  let left = 0,
    right = arr.length - 1;
  while (left < right) {
    [arr[left], arr[right]] = [arr[right], arr[left]];
    left++;
    right--;
  }
}
mat = [
  [1, 2, 3],
  [4, 5, 6],
  [7, 8, 9],
];
rotate90(mat);
console.log(mat);

// 7.Sprial printing of a matrix
function printSpiralOrder(mat) {
  if (mat.length == 0) {
    return;
  }
  let left = 0,
    right = mat[0].length - 1;
  let top = 0,
    bottom = mat.length - 1;
  while (top <= bottom && left <= right) {
    for (i = left; i <= right; i++) {
      console.log(mat[top][i]);
    }
    top++;
    for (i = top; i <= bottom; i++) {
      console.log(mat[i][right]);
    }
    right--;
    if (top <= bottom) {
      for (i = right; i >= left; i--) {
        console.log(mat[bottom][i]);
      }
      bottom--;
    }
    if (left <= right) {
      for (i = bottom; i >= top; i--) {
        console.log(mat[i][left]);
      }
      left++;
    }
  }
}
mat = [
  [1, 2, 3],
  [4, 5, 6],
  [7, 8, 9],
];
printSpiralOrder(mat);

// 8.We have a given array which contain only 0&1 we have to move all 0's into left & all 1's into right
function moveZeroLeft(arr) {
  let left = 0;
  let right = arr.length-1;
  while(left<right){
    while(arr[left]==0){
      left++;
    }
    while(arr[right]==1){
      right--;
    }
    if(left<right){
      temp = arr[left];
      arr[left] = arr[right];
      arr[right] = temp;
    }
  }
  return arr;
}
console.log(moveZeroLeft([1,0,0,1,0,1,0]));

// 9.Two sum-II - Input Array is sorted 
function findSumIndexses(arr,target){
  for(i=0;i<arr.length;i++){
    for(j=i+1;j<arr.length;j++){
      if(arr[i]+arr[j]==target){
        return [i+1,j+1];
      }
    }
  }
}
console.log(findSumIndexses([2,3,4],6));  // TC = O(n²)
// Optimized code
function twoSum(numbers, target) {
  let left = 0;
  let right = numbers.length-1;
  
  while(left<right){
    const sum = numbers[left]+numbers[right];
    if(sum===target){
      return [left+1,right+1];
    } else if(sum<target){
      left++;
    }else{
      right--;
    }
  }
  return [];
};
console.log(twoSum([2,7,11,15],9));

// 10. Container With Most Water.You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).Find two lines that together with the x-axis form a container, such that the container contains the most water.Return the maximum amount of water a container can store.Notice that you may not slant the container.
function maxAreaFind(height) {
  let left = 0;
  let right = height.length-1;
  let maxArea = 0;
  while(left<right){
    const width = right-left;
    const currentArea = Math.min(height[left], height[right])*width;
    if(maxArea<currentArea){
      maxArea=currentArea;
    }
    if(height[left]<height[right]){
      left++;
    }else{
      right--;
    }
  }
  return maxArea;
};
console.log(maxAreaFind([1,8,6,2,5,4,8,3,7]));

// 11.Sort Colors:- Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.You must solve this problem without using the library's sort function.
function moveZeroLeft(arr) {
  let left = 0;
  let right = arr.length - 1;
  let i = 0;

  while (i <= right) {
    if (arr[i] === 0) {
      [arr[i], arr[left]] = [arr[left], arr[i]];
      left++;
      i++;
    } else if (arr[i] === 2) {
      [arr[i], arr[right]] = [arr[right], arr[i]];
      right--;
    } else {
      i++;
    }
  }

  return arr;
}

console.log(moveZeroLeft([2, 0, 2, 1, 1, 0]));