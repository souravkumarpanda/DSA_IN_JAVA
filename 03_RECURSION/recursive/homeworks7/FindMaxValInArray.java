package recursive.homeworks7;

public class FindMaxValInArray {
    public  static void display(int[] arr,int n,int idx,int max){
        if (idx == n){
            System.out.println(max);
            return;
        }
        if (max < arr[idx])  max = arr[idx];
        display(arr, n, idx+1, max);
    }

    public static void main(String[] args) {
        int[] arr = {1,49,78,254};
        int n = arr.length;
        display(arr,n,0,Integer.MIN_VALUE);
    }
}
