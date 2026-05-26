package binarysearch.problems;

// GFG - Binary Search

public class FirstOccurrence_1 {
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

    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,3,3,4,5,6};
        System.out.println(firstOcc(arr,3));
    }
}
