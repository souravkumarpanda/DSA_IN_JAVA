package prefixandsuffixsum;
import java.util.*;
public class SuffixSum {
    public static int[] suffix(int[] arr){
        int n = arr.length;
        for (int i=n-2;i>=0;i--){
            arr[i] += arr[i+1];
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter "+ n +" elements of the array: ");
        for (int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Original Array: ");
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        System.out.println("Suffix Sum is: ");
        int[] suff = suffix(arr);
        for (int a: suff){
            System.out.print(a+" ");
        }
    }
}
