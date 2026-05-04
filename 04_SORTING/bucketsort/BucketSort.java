package bucketsort;

import java.util.*;
public class BucketSort {
    static void bucketSort(float[] arr){
        int n = arr.length;
        if (n<=0) return;
//        Create Buckets
        List<Float>[] buckets = new ArrayList[n];
        for (int i=0;i<n;i++){
            buckets[i] = new ArrayList<>();
        }
//        Put elements into buckets
        for (float num:arr){
            int index = (int) (num*n);
            buckets[index].add(num);
        }
//        Sort each bucket
        for (int i=0;i<n;i++){
            Collections.sort(buckets[i]);
        }
//        Concatenate
        int k = 0;
        for (int i=0;i<n;i++){
            for (float num:buckets[i]){
                arr[k++] = num;
            }
        }
    }

    public static void main(String[] args) {
        float[] arr = {0.42f, 0.32f, 0.23f, 0.52f, 0.25f, 0.47f, 0.51f};
        bucketSort(arr);
        for (float ele:arr){
            System.out.print(ele + " ");
        }
    }
}
