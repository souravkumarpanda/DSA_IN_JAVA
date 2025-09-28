package twopointers;

public class NonDecreasingSort {
    public static void reverse(int[] arr){
        int i =0, j= arr.length-1;
        while (i<j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for (int ele:arr){
            System.out.print(ele + " ");
        }
    }
    public static void nonDecreasingOrder(int[] arr){
        int n = arr.length;
        int left =0;
        int right = n-1;
        int[] ans = new int[n];
        int k = 0;
        while(left <= right){
            if (Math.abs(arr[left]) > Math.abs(arr[right])){
                ans[k++] = arr[left] * arr[left];
                left++;
            }else {
                ans[k++] = arr[right] * arr[right];
                right--;
            }
        }
        reverse(ans);
    }

    public static void main(String[] args) {
        int[] arr = {-10,-5,-3,1,3,5,10};
        nonDecreasingOrder(arr);
    }
}
