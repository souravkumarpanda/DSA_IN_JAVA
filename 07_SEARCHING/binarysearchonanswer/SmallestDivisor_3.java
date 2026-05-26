package binarysearchonanswer;

// Leetcode - 1283 and GFG Practice

public class SmallestDivisor_3 {
    static int smallestDivisor(int[] arr, int threshold) {
        int max = Integer.MIN_VALUE;
        for (int ele:arr) {
            max = Math.max(max,ele);
        }
        int low = 1, high = max, ans = high;
        while (low<=high) {
            int mid = low + (high-low)/2;
            if (computeSum(arr,mid) <= threshold) {
                high = mid-1;
                ans = mid;
            }else low = mid+1;
        }
        return ans;
    }
    static int computeSum(int[] arr, int divisor) {
        int sum = 0;
        for (int ele:arr) {
            sum += (ele+divisor-1)/divisor;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,5,9};
        int k = 6;
        System.out.println(smallestDivisor(arr,k));
    }
}
