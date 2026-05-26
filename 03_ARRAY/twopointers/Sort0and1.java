// Sort 0's and 1's
package twopointers;

public class Sort0and1 {
    public static void sortZeroAndOne(int[] arr){
        int low = 0;
        int high = arr.length-1;
        while (low < high){
            if (arr[low]==0){
                low++;
            } else if (arr[low] == 1 && arr[high] == 0) {
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
                low++;
                high--;
            }else {
                high--;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 0, 1, 0, 0, 1};
        sortZeroAndOne(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
