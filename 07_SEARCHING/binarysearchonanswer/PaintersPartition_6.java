package binarysearchonanswer;

// GFG Practice

class PaintersPartition_6 {
    public static int minTime(int[] arr, int k) {
        if (k > arr.length) return -1;
        int low = 0, sum = 0, ans = -1;
        for (int ele:arr) {
            sum += ele;
        }
        int high = sum;
        while (low<=high) {
            int mid = low + (high-low)/2;
            if (isPossible(arr,k,mid)) {
                ans = mid;
                high = mid-1;
            }else low = mid+1;
        }
        return ans;
    }
    static boolean isPossible(int[] arr, int k, int minTime) {
        int painterCount = 1;
        int paintSum = 0;
        for (int i=0;i<arr.length;i++) {
            if (paintSum + arr[i] <= minTime) {
                paintSum += arr[i];
            }else {
                painterCount++;
                if (painterCount > k || arr[i] > minTime) {
                    return false;
                }
                paintSum = arr[i];
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr = {5, 10, 30, 20, 15};
        int k = 3;
        System.out.println(minTime(arr,k));
    }
}
