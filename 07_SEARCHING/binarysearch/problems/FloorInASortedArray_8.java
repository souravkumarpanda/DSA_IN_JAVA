package binarysearch.problems;

// GFG Practice

public class FloorInASortedArray_8 {
    static int findFloor(int[] arr, int x){
        int low = 0, high = arr.length-1, idx = -1;
        while (low <= high) {
            int mid = low + (high-low)/2;
            if (arr[mid] > x) high = mid-1;
            else {
                idx = mid;
                low = mid+1;
            }
        }
        return idx;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,8,10,10,12,9};
        int x = 5;
        System.out.println(findFloor(arr,x));
    }
}
