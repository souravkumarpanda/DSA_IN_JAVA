package binarysearch.problems;

// Leetcode - 2529

public class MaximumCountOfPositiveIntegerAndNegativeInteger_9 {
    static int maximumPN(int[] arr) {
        int n = arr.length;
        int lowerBound = binarySearch(arr,0);
        int upperBound = binarySearch(arr,1);
        int negativeCount = lowerBound;
        int positiveCount = n - upperBound;
        return maxValue(negativeCount,positiveCount);
    }
    static int binarySearch(int[] arr, int target){
        int low = 0, high = arr.length;
        while (low < high) {
            int mid = low + (high-low)/2;
            if (arr[mid] >= target) {
                high = mid;
            } else {
                low = mid+1;
            }
        }
        return low;
    }
    static int maxValue(int a, int b){
        if (a>b) {
            return a;
        }
        return b;
    }

    public static void main(String[] args) {
        int[] arr = {-3,-2,-1,0,0,1,2};
        System.out.println(maximumPN(arr));
    }
}
