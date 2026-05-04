package radixsort;

public class RadixSort {
    static void countSort(int[] arr, int place){
        int n = arr.length;
        if (n==0) return;
        int[] count = new int[10];
        for (int i=0;i<n;i++){
            count[(arr[i]/place)%10]++;
        }
//        Make a prefix sum array of a count array
        for (int i=1;i<count.length;i++){
            count[i] += count[i-1];
        }
//        Traverse backward in an original array and place it in an output array
        int[] output = new int[n];
        for (int i=n-1;i>=0;i--) {
            int idx = count[(arr[i]/place)%10] - 1;
            output[idx] = arr[i];
            count[(arr[i]/place)%10]--;
        }
//        Copy an output array to an original array
        for (int i=0;i<n;i++){
            arr[i] = output[i];
        }
    }
    static void radixSort(int[] arr){
//        Find maximum element
        int max = arr[0];
        for (int ele:arr){
            if (ele > max){
                max = ele;
            }
        }
//        Apply count sort to sort elements based on place value
        for (int place=1;max/place>0;place*=10) {
            countSort(arr,place);
        }
    }

    public static void main(String[] args) {
        int[] arr = {170,45,75,90,802,24,2,66};
        radixSort(arr);
        for (int ele:arr){
            System.out.print(ele + " ");
        }
    }
}
