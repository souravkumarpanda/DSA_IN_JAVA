package binarysearchonanswer;

// Leetcode - 410

public class SplitTheLargestSum_7 {
    public static int splitArray(int[] arr, int k) {
        if (k > arr.length) return -1;
        int low = 0, sum = 0, ans = -1;
        for (int ele:arr) {
            sum += ele;
        }
        int high = sum;
        while (low<=high) {
            int mid = low + (high-low)/2;
            if (canSplit(arr,k,mid)) {
                ans = mid;
                high = mid-1;
            } else low = mid+1;
        }
        return ans;
    }
    static boolean canSplit(int[] arr, int k, int maxAllowedSum) {
        int subarrayCount  = 1, currentSum  = 0;
        for (int i=0;i<arr.length;i++) {
            if (currentSum  + arr[i] <= maxAllowedSum) {
                currentSum  += arr[i];
            }else {
                subarrayCount ++;
                if (subarrayCount  > k || arr[i] > maxAllowedSum) {
                    return false;
                }
                currentSum  = arr[i];
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {7,2,5,10,8};
        int k = 2;
        System.out.println(splitArray(arr,k));
    }
}
