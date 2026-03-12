package prefixandsuffixsum;

import java.util.Scanner;

public class PrefixSumEqualSuffixSum {
    public static int findArraySum(int[] arr){
        int totalSum = 0;
        int n = arr.length;
        for (int ele : arr) {
            totalSum += ele;
        }
        return totalSum;
    }
    public static boolean equalSumPartition(int[] arr){
        int totalSum = findArraySum(arr);
        int prefixSum = 0;
        for (int num : arr) {
            prefixSum += num;
            int suffixSum = totalSum - prefixSum;
            if (prefixSum == suffixSum) return true;
        }
        return false;
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
        System.out.println();
        System.out.println("Equal partition possible: " + equalSumPartition(arr));
    }
}
