package mergesort;

public class MergeSort {
    static void mergeSort(int[] arr, int l, int r) {
        if (l < r) {
            int mid = (l + r) / 2;
            mergeSort(arr, l, mid);
            mergeSort(arr, mid + 1, r);
            merge(arr, l, mid, r);
        }
    }
    static void merge(int[] arr, int l, int mid, int r) {
        int n1 = mid - l + 1;
        int n2 = r - mid;
        int[] A = new int[n1];
        int[] B = new int[n2];
        // Copy data into A and B
        for (int i = 0; i < n1; i++) {
            A[i] = arr[l + i];
        }
        for (int j = 0; j < n2; j++) {
            B[j] = arr[mid + 1 + j];
        }
        int i = 0, j = 0, k = l;
        while (i < n1 && j < n2) {
            if (A[i] <= B[j]) {
                arr[k++] = A[i++];
            } else {
                arr[k++] = B[j++];
            }
        }
        while (i < n1) {
            arr[k++] = A[i++];
        }
        while (j < n2) {
            arr[k++] = B[j++];
        }
    }

//    Another method to write merge sort
// public static void mergeSort(int[] arr){
//    int n = arr.length;
//    if(n<=1) return;
//    int[] a = new int[n/2];
//    int[] b = new int[n-n/2];
//    int idx = 0;
//    for(int i=0;i<a.length;i++) a[i] = arr[idx++];
//    for(int i=0;i<b.length;i++) b[i] = arr[idx++];
//    mergeSort(a); mergeSort(b); merge(a,b,arr);
//}
//    public static void merge(int[] a, int[] b, int[] c){
//        int i =0, j=0, k=0;
//        while(i<a.length && j<b.length){
//            if(a[i]<=b[j]) c[k++] = a[i++];
//            else{
//                c[k++] = b[j++];
//            }
//        }
//        while(i<a.length) c[k++] = a[i++];
//        while(j<b.length) c[k++] = b[j++];
//    }

    public static void main(String[] args) {
        int[] arr = {8, 5, 1, 3, 4, 6, 2, 7};
        mergeSort(arr, 0, arr.length - 1);
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }
}
