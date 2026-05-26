package binarysearchonanswer;

// GFG Practice

class BookAllocation_5 {
    public static int findPages(int[] arr, int k) {
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
    static boolean isPossible(int[] arr, int k, int minPages) {
        int studentCount = 1;
        int pageSum = 0;
        for (int i=0;i<arr.length;i++) {
            if (pageSum + arr[i] <= minPages) {
                pageSum += arr[i];
            }else {
                studentCount++;
                if (studentCount > k || arr[i] > minPages) {
                    return false;
                }
                pageSum = arr[i];
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        int k = 2;
        System.out.println(findPages(arr,k));
    }
}
