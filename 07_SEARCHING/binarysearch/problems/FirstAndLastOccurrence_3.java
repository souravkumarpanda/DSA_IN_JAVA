package binarysearch.problems;

// GFG Practice

import java.util.ArrayList;

public class FirstAndLastOccurrence_3 {
    static int firstOcc(int[] arr, int target){
        int low = 0, high = arr.length-1, idx = -1;
        while (low<=high){
            int mid = low + (high-low)/2;
            if (arr[mid]>target) high = mid-1;
            else if (arr[mid]<target) low = mid+1;
            else{
                idx = mid;
                high = mid-1;
            }
        }
        return idx;
    }
    static int lastOcc(int[] arr, int target){
        int low = 0, high = arr.length-1, idx = -1;
        while (low<=high){
            int mid = low + (high-low)/2;
            if (arr[mid]>target) high = mid-1;
            else if (arr[mid]<target) low = mid+1;
            else{
                idx = mid;
                low = mid+1;
            }
        }
        return idx;
    }
    static ArrayList<Integer> find(int[] arr, int target){
        ArrayList<Integer> result = new ArrayList<>();
        if (arr==null || arr.length==0) {
            result.add(-1);
            result.add(-1);
            return result;
        }
        result.add(firstOcc(arr,target));
        result.add(lastOcc(arr,target));
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,3,3,4,5,6};
        int target = 3;
        System.out.println(find(arr,target));
    }
}
