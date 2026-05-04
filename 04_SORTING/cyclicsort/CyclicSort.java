package cyclicsort;

public class CyclicSort {
    static void cyclic(int[] arr){
        int i = 0;
        while (i< arr.length){
            int idx = arr[i]-1;
            if(arr[i] != arr[idx]){
                swap(arr,i,idx);
            }else {
                i++;
            }
        }
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {3,5,2,1,4};
        cyclic(arr);
        for(int ele:arr){
            System.out.print(ele + " ");
        }
    }
}
