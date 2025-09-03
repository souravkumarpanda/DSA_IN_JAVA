package prefixandsuffixsum;

import java.util.Scanner;

public class RangeQuery {
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
        int[] arr = new int[n+1];
        System.out.print("Enter "+ n +" elements of the array: ");
        for (int i=1;i<=n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Original Array: ");
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        int[] pref = prefixSum(arr);
        System.out.println("Enter queries: ");
        int q = sc.nextInt();
        while (q-- > 0){
            System.out.println("Enter range: ");
            int l = sc.nextInt();
            int r = sc.nextInt();
            int ans = pref[r]-pref[l-1];
            System.out.println("Sum: " + ans);
        }
    }
}
