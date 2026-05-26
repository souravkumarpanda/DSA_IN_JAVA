package quicksort;

public class QuickSort {
//    Lomuto's Partition Scheme
    static int lomutoPartition(int[] arr, int lb, int ub){
        int pivot = arr[ub];
        int i = lb - 1;
        for (int j=lb;j<ub;j++){
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[ub];
        arr[ub] = temp;
        return i+1;
    }
//    Hoare's Partition Scheme
    static int hoarePartition(int[] arr, int lb, int ub){
        int pivot = arr[lb];
        int i = lb-1;
        int j = ub+1;
        while (true) {
            do {
                i++;
            } while (arr[i] < pivot);
            do {
                j--;
            } while (arr[j] > pivot);
            if (i>=j) return j;
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
    static void quickSort(int[] arr, int lb, int ub){
        if (lb < ub){
            int p = lomutoPartition(arr,lb,ub);
            quickSort(arr,lb,p-1);
            quickSort(arr,p+1,ub);
        }
    }
    static void quickSort1(int[] arr, int lb, int ub){
        if (lb < ub){
            int p = hoarePartition(arr,lb,ub);
            quickSort(arr,lb,p);
            quickSort(arr,p+1,ub);
        }
    }

    public static void main(String[] args) {
        int[] arr = {10,7,8,9,1,5};
        quickSort(arr,0,arr.length-1);
        for (int num:arr) {
            System.out.print(num + " ");
        }
        System.out.println();
        quickSort1(arr,0,arr.length-1);
        for (int num:arr) {
            System.out.print(num + " ");
        }
    }
}
