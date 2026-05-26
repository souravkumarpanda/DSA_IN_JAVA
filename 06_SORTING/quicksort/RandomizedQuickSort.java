package quicksort;

import java.util.Random;

public class RandomizedQuickSort {
    static Random rand = new Random();
    static int partition(int[] arr, int lb, int ub){
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
    static int randomizedPartition(int[] arr, int lb, int ub){
        int randomIndex = lb + rand.nextInt(ub-lb+1);
        int temp = arr[randomIndex];
        arr[randomIndex] = arr[ub];
        arr[ub] = temp;
        return partition(arr,lb,ub);
    }
    static void quickSort(int[] arr, int lb, int ub){
        if (lb < ub){
            int p = randomizedPartition(arr, lb, ub);
            quickSort(arr, lb, p-1);
            quickSort(arr, p+1, ub);
        }
    }

    public static void main(String[] args) {
        int[] arr = {10,7,8,9,1,5};
        quickSort(arr,0, arr.length-1);
        for (int num:arr){
            System.out.print(num + " ");
        }
    }
}
