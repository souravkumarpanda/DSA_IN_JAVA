package binarysearchonanswer;

// Leetcode - 1552

import java.util.Arrays;

public class MagneticForceBetweenTwoBalls_11 {
    static int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int low = 1, high = position[position.length-1]-position[0], ans = -1;
        while (low <= high) {
            int mid = low + (high-low)/2;
            if (canPlace(position,m,mid)) {
                ans = mid;
                low = mid+1;
            }else high = mid-1;
        }
        return ans;
    }
    static boolean canPlace(int[] position, int m, int minDistance) {
        int magnetPlaced = 1;
        int lastPlaced = position[0];
        for (int i=0;i<position.length;i++) {
            if (position[i]-lastPlaced >= minDistance) {
                magnetPlaced++;
                lastPlaced = position[i];
                if (magnetPlaced == m) return true;
            }
        }
        return magnetPlaced >= m;
    }

    public static void main(String[] args) {
        int[] position = {1,2,3,4,7};
        int m = 3;
        System.out.println(maxDistance(position,m));
    }
}
