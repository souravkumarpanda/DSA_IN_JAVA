package binarysearch.problems;

// GFG Practice and Leetcode - 69

public class SquareRootUsingBinarySearch_7 {
    static long sqrt(long n){
        if (n<2) return n;
        long low=1, high=n/2, result = 1;
        while (low <= high) {
            long mid = low + (high-low)/2;
            if (mid*mid==n) return mid;
            else if (mid*mid<n) {
                result = mid;
                low = mid + 1;
            } else high = mid-1;
        }
        return result;
    }

    public static void main(String[] args) {
        long n = 64;
        System.out.println(sqrt(n));
    }
}
