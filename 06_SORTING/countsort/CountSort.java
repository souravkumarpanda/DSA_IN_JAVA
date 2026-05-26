package countsort;

public class CountSort {
    static void countSort(int[] arr){
        if (arr == null || arr.length <= 1){
            return;
        }
        int max = arr[0];
        for(int num:arr){
            if (num > max){
                max = num;
            }
        }
        int[] count = new int[max+1];
        int k = 0;
        for(int i=0;i<arr.length;i++){
            for (int j=0;j<count[i];j++){
                arr[k++] = i;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {4,2,2,8,3,3,1};
        countSort(arr);
        for(int ele:arr){
            System.out.print(ele + " ");
        }
    }
}
