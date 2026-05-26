package binarysearchonanswer;

// Leetcode - 1011

public class CapacityToShipPackagesWithinDDays_1 {
    static int shipWithinDays(int[] weights, int d) {
        int max = Integer.MIN_VALUE, sum = 0;
        for (int ele: weights) {
            max = Math.max(max,ele);
            sum += ele;
        }
        int low = max, high = sum, ans = -1;
        while (low<=high) {
            int mid = low + (high-low)/2;
            if (days(mid,weights) <= d) {
                high = mid-1;
                ans = mid;
            }else low = mid+1;
        }
        return ans;
    }
    static int days(int capacity, int[] arr) {
        int days = 0;
        int c = capacity;
        for (int ele:arr) {
            if (c>=ele) c -= ele;
            else{
                days++;
                c = capacity - ele;
            }
        }
        days++;
        return days;
    }

    public static void main(String[] args) {
        int[] weights = {1,2,3,4,5,6,7,8,9,10};
        int days = 5;
        System.out.println(shipWithinDays(weights, days));
    }
}
