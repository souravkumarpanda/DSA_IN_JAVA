package binarysearch.problems;

public class LowerAndUpperBound_4 {
    static int lower(int[] arr, int target) {
        int low = 0, high = arr.length-1;
        while (low < high) {
            int mid = low + (high-low)/2;
            if (arr[mid] < target) low = mid+1;
            else high = mid;
        }
        return low;
    }
    static int upper(int[] arr, int target) {
        int low = 0, high = arr.length-1;
        while (low < high) {
            int mid = low + (high-low)/2;
            if (arr[mid] <= target) low = mid+1;
            else high = mid-1;
        }
        return low;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,3,3,4,5,6};
        int target = 3;
        System.out.println(lower(arr,target));
        System.out.println(upper(arr,target));
    }
}
