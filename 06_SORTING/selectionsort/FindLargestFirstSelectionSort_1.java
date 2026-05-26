package selectionsort;

public class FindLargestFirstSelectionSort_1 {
    static void findLargestFirst(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n - 1; i++) {
            int max = Integer.MIN_VALUE, maxIndex = i;
            for(int j = i; j<n; j++) {
                if(arr[j] > max) {
                    max = arr[j];
                    maxIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[maxIndex];
            arr[maxIndex] = temp;
        }
//        Reverse the array
        int start = 0, end = n - 1;
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, -2, 6, 7, 2, 0, 7, 2};
        findLargestFirst(arr);
        for(int num : arr) {
            System.out.print(num + " ");
        }
    }
}
