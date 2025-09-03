package recursive.arraysinrecursion3;

// Traversing an Array

public class PrintArray {
    public static void display(int[] arr,int n,int idx){
        if (idx == n) return;
        System.out.print(arr[idx] + " ");
        display(arr,n,idx+1);
    }

    public static void main(String[] args) {
        int[] arr = {2,1,6,3,9,0,2};
        int n = arr.length;
        display(arr,n,0);
    }
}
