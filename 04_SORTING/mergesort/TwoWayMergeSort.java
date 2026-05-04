package mergesort;

public class TwoWayMergeSort {
    static void merge(int[] arr, int left, int mid, int right) {
        int i = left;
        int j = mid + 1;
        int k = 0;
        int[] temp = new int[right - left + 1];
        while (i <= mid && j <= right) {
            if (arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= right) {
            temp[k++] = arr[j++];
        }
        // Copy back to an original array
        for (int x = 0; x < temp.length; x++) {
            arr[left + x] = temp[x];
        }
    }
    // Iterative Merge Sort
    static void mergeSort(int[] arr, int n) {
        // size = current subarray size
        for (int size = 1; size < n; size *= 2) {
            for (int left = 0; left < n - 1; left += 2 * size) {
                int mid = Math.min(left + size - 1, n - 1);
                int right = Math.min(left + 2 * size - 1, n - 1);
                merge(arr, left, mid, right);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {8, 3, 7, 4, 9, 2, 6, 5};
        mergeSort(arr, arr.length);
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }
}
