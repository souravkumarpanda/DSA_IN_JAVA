package binarysearchonanswer;

// Leetcode - 1482

public class MinimumNumberOfDaysToMakeMBouquets_9 {
    public static int minDays(int[] bloomDay, int m, int k) {
        long totalFlowersNeeded = (long) m * k;
        if (totalFlowersNeeded > bloomDay.length) {
            return -1;
        }
        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;
        for (int day : bloomDay) {
            low = Math.min(low, day);
            high = Math.max(high, day);
        }
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (canMake(bloomDay, m, k, mid)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
    static boolean canMake(int[] bloomDay, int m, int k, int days) {
        int count = 0;
        int bouquets = 0;
        for (int bloom : bloomDay) {
            if (bloom <= days) {
                count++;
                if (count == k) {
                    bouquets++;
                    count = 0;
                }
            } else {
                count = 0;
            }
        }
        return bouquets >= m;
    }

    public static void main(String[] args) {
        int[] bloomDays = {7,7,7,7,12,7,7};
        System.out.println(minDays(bloomDays,2,3));
    }
}
