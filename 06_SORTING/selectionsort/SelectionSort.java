package selectionsort;

public class SelectionSort {
    static void selectionSort(int[] arr) {
        int n = arr.length;
        for(int i = 0; i < n - 1; i++) {
            int min = Integer.MAX_VALUE, minIndex = -1;
            for(int j = i; j<n; j++) {
                if(arr[j] < min) {
                    min = arr[j];
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, -2, 6, 7, 2, 0, 7, 2};
        selectionSort(arr);
        for(int num : arr) {
            System.out.print(num + " ");
        }
    }
}
