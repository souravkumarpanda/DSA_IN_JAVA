// By using Dutch National Flag Algorithm
package twopointers;

public class Sort0and1and2 {
    public static void rearrange(int[] arr){
        int low = 0;
        int mid = 0;
        int high = arr.length-1;
        while(mid<=high){
            if (arr[mid]==2){
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            } else if (arr[mid]==0) {
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                low++;
                mid++;
            }else {
                mid++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {0,1,2,2,1,2,0,1,0};
        rearrange(arr);
        for (int ele:arr) System.out.print(ele+" ");
    }
}
