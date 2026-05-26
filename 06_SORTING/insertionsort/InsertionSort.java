package insertionsort;

public class InsertionSort {
    static void insertionSort(int[] arr){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            int j  = i+1;
            while(j>=1 && arr[j]<arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {4,2,0,-5,6};
        insertionSort(arr);
        for (int ele:arr){
            System.out.print(ele + " ");
        }
    }
}
