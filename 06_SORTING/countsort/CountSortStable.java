package countsort;

public class CountSortStable {
    static void countSortStable(int[] arr){
        int n = arr.length;
        if (n==0) return;
//        Find maximum element
        int max = arr[0];
        for (int ele:arr){
            if (ele > max){
                max = ele;
            }
        }
//        Create a count array of size max+1
        int[] count = new int[max+1];
        for (int i=0;i<n;i++){
            count[arr[i]]++;
        }
//        Make a prefix sum array of a count array
        for (int i=1;i<count.length;i++){
            count[i] += count[i-1];
        }
//        Traverse backward in an original array and place it in an output array
        int[] output = new int[n];
        for (int i=n-1;i>=0;i--) {
            int idx = count[arr[i]] - 1;
            output[idx] = arr[i];
            count[arr[i]]--;
        }
//        Copy an output array to an original array
        for (int i=0;i<n;i++){
            arr[i] = output[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = {4,2,2,8,3,3,1};
        countSortStable(arr);
        for (int ele:arr){
            System.out.print(ele + " ");
        }
    }
}
