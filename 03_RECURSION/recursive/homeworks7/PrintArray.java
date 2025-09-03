package recursive.homeworks7;

public class PrintArray {
    public static void display(int[] arr, int n, int idx){
        if (idx == n) return;
        System.out.print(arr[idx] + " ");
        display(arr, n, idx+1);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int n = arr.length;
        display(arr,n,0);
    }
}
