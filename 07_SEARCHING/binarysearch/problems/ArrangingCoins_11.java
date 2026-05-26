package binarysearch.problems;

// Leetcode - 441

public class ArrangingCoins_11 {
    static int sqrt(long n){
        if (n==0) return 0;
        long low=1, high=n;
        while (low <= high) {
            long mid = low + (high-low)/2;
            if (mid*mid==n) return (int)mid;
            else if (mid>n/mid) {
                high = mid-1;
            } else low = mid + 1;
        }
        return (int)high;
    }
    static int arrangeCoins(int n) {
        long m = (long)n;
        return (sqrt(8*m+1)-1)/2;
    }

//    static int arrangeCoins(int  n){
//        long lo = 0, hi = n, ans = 0;
//        while (lo <= hi) {
//            long k = lo + (hi-lo)/2;
//            long m = k*(k+1)/2;
//            if (m==n) return (int)k;
//            else if (m>n) {
//                hi = k-1;
//            }else {
//                ans = k;
//                lo = k+1;
//            }
//        }
//        return (int)ans;
//    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(arrangeCoins(n));
    }
}
