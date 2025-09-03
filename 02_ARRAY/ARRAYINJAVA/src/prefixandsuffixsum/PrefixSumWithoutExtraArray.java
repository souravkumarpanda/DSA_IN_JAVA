package prefixandsuffixsum;
import java.util.Scanner;
public class PrefixSumWithoutExtraArray {
    public static int[] prefixSum(int[] arr){
        int n = arr.length;
        for (int i=1;i<n;i++){
            arr[i] = arr[i]+arr[i-1];
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
        System.out.println("Prefix/Running Sum is: ");
        int[] pref = prefixSum(arr);
        for (int a:pref){
            System.out.print(a+" ");
        }
    }
}
