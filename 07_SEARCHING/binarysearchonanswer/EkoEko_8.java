package binarysearchonanswer;

// SPOJ

public class EkoEko_8 {
    static int n;
    static long m;
    static long[] trees;
    static boolean isWoodSufficient(long h) {
        long wood = 0;
        for (long tree:trees) {
            if (tree > h) wood += (tree-h);
        }
        return wood >= m;
    }

    public static void main(String[] args) {
        n = 4;
        m = 7;
        trees = new long[]{20,15,10,17};
        long maxHeight = 0;
        for (long ele:trees) {
            maxHeight = Math.max(maxHeight,ele);
        }
        long low = 0, high = maxHeight, ans = 0;
        while (low <= high) {
            long mid = low + (high-low)/2;
            if (isWoodSufficient(mid)) {
                ans = mid;
                low = mid+1;
            }else high = mid-1;
        }
        System.out.println(ans);
    }
}
