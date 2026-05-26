package twopointers;

import java.util.Arrays;

public class NonDecreasingSortWithoutReverse {
    public static int[] nonDecreasingOrder(int[] arr){
        int n = arr.length;
        int left =0;
        int right = n-1;
        int[] ans = new int[n];
        int k = n-1;
        while(left <= right){
            if (Math.abs(arr[left]) > Math.abs(arr[right])){
                ans[k--] = arr[left] * arr[left];
                left++;
            }else {
                ans[k--] = arr[right] * arr[right];
                right--;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {-10,-5,-3,1,3,5,10};
        int[] result = nonDecreasingOrder(arr);
        System.out.println(Arrays.toString(result));
    }
}
