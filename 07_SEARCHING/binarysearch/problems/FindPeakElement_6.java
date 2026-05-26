package binarysearch.problems;

// Leetcode - 162 and 852

public class FindPeakElement_6 {
    static int findPeak(int[] arr) {
        int low = 0, high = arr.length-1;
        while (low < high) {
            int mid = low + (high-low)/2;
            if (arr[mid] > arr[mid+1]) high = mid;
            else low = mid+1;
        }
        return low;
    }

    public static void main(String[] args) {
        int[] arr = {1,3,8,5,2};
        System.out.println(findPeak(arr));
    }
}
