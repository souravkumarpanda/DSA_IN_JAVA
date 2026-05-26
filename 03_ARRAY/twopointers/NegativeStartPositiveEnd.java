package twopointers;

public class NegativeStartPositiveEnd {
    public static void rearrange(int[] arr){
        int left = 0, right = arr.length-1;
        while(left <= right){
            if (arr[left] < 0 && arr[right] < 0) left++;
            else if (arr[left] > 0 && arr[right] > 0) right--;
            else if (arr[left] > 0 && arr[right] < 0) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
            else{
                left++;
                right--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,8,3,6,-5,-4,-2};
        rearrange(arr);
        for (int ele:arr) System.out.print(ele+" ");
    }
}
