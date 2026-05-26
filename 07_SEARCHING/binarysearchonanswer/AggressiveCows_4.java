package binarysearchonanswer;

// GFG Practice

import java.util.Arrays;

public class AggressiveCows_4 {
    static int aggressiveCows(int[] stalls, int k) {
        Arrays.sort(stalls);
        int low = 1, high = stalls[stalls.length-1] - stalls[0], ans = -1;
        while (low <= high) {
            int mid = low + (high-low)/2;
            if (canPlace(stalls,k,mid)) {
                ans = mid;
                low = mid+1;
            }else high = mid-1;
        }
        return ans;
    }
    static boolean canPlace(int[] stalls, int k, int minDist) {
        int cowsPlaced = 1;
        int lastPlaced = stalls[0];
        for (int i=1;i<stalls.length;i++) {
            if (stalls[i] -lastPlaced >= minDist) {
                cowsPlaced++;
                lastPlaced = stalls[i];
                if (cowsPlaced==k) return true;
            }
        }
        return cowsPlaced >= k;
    }

    public static void main(String[] args) {
        int[] stalls = {1,2,5,7,10};
        int k = 3;
        System.out.println(aggressiveCows(stalls,k));
    }
}
