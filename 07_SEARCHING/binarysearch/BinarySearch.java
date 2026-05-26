package binarysearch;

// Leetcode - 704

public class BinarySearch {
    static int iterativeApproach(int[] arr, int target){
        int n = arr.length;
        int low = 0, high = n-1;
        while (low <= high){
            int mid = low + (high-low)/2;
            if (arr[mid]==target) return mid;
            else if (arr[mid]<=target) low = mid+1;
            else high = mid-1;
        }
        return -1;
    }
    static int recursiveApproach(int[] arr, int low, int high, int target){
        if (low > high) return -1;
        int mid = low + (high-low)/2;
        if (arr[mid]==target){
            return mid;
        }else if (arr[mid] <= target){
            return recursiveApproach(arr,mid+1,high,target);
        }else {
            return recursiveApproach(arr,low,mid-1,target);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9,11,13,15};
        int target = 13;
        System.out.println(iterativeApproach(arr,target));
        System.out.println(recursiveApproach(arr,0,arr.length-1,target));
    }
}
