package prefixandsuffixsum;
import java.util.*;
public class RunningOrPrefixSum {
    public static int[] prefixSum(int[] arr){
        int n = arr.length;
        int[] pref = new int[n];
        pref[0] = arr[0];
        for (int i=1;i<n;i++){
            pref[i] = pref[i-1]+arr[i];
        }
        return pref;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of the array: ");
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
