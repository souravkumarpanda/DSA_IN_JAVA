package binarysearchonanswer;

// Leetcode - 875 and GFG Practice

public class KokoEatingBananas_2 {
    static int minEatingSpeed(int[] piles, int h) {
        int max = Integer.MIN_VALUE;
        for (int ele: piles) {
            max = Math.max(max,ele);
        }
        int low = 1, high = max, speed = max;
        while (low<=high) {
            int mid = low + (high-low)/2;
            if (hours(mid,piles) <= h) {
                high = mid-1;
                speed = mid;
            }else low = mid+1;
        }
        return speed;
    }
    static long hours(int speed, int[] arr) {
        long h = 0;
        for (int ele:arr) {
            h += (ele + speed - 1) / speed;
        }
        return h;
    }

    public static void main(String[] args) {
        int[] piles = {3,6,7,11};
        int h = 8;
        System.out.println(minEatingSpeed(piles,h));
    }
}
