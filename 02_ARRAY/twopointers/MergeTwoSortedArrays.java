package twopointers;

import java.util.Arrays;

public class MergeTwoSortedArrays {
    public static int[] sortArray(int[] arr1, int[] arr2){
        int n = arr1.length;
        int m = arr2.length;
        int[] arr3 = new int[m+n];
        int i = 0, j = 0, k = 0;
        while(i<=n-1 && j<=m-1){
            if (arr1[i] < arr2[j]){
                arr3[k] = arr1[i];
                i++;
                k++;
            }else {
                arr3[k] = arr2[j];
                j++;
                k++;
            }
        }
        if (i==n){
            while(j<=m-1){
                arr3[k] = arr2[j];
                j++;
                k++;
            }
        }
        if(j==m){
            while (i<=n-1){
                arr3[k] = arr1[i];
                i++;
                k++;
            }
        }
        return arr3;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,4,5,8};
        int[] arr2 = {2,3,6,7,10,13};
        int[] res = sortArray(arr1,arr2);
        System.out.println(Arrays.toString(res));
    }
}
