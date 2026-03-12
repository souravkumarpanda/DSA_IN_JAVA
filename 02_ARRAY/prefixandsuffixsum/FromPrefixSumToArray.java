// Original Array from given Prefix Sums. You are given a prefix sum array prefixSum[]
// of an array arr[]. The task is to find the original array arr[] whose prefix sum is prefixSum[].
package prefixandsuffixsum;
import java.util.Scanner;
public class FromPrefixSumToArray {
    public static int[] prefixToArray(int[] prefix){
        int n = prefix.length;
        int[] orig = new int[n];
        orig[0] = prefix[0];
        for (int i = 1; i < n; i++) {
            orig[i] = prefix[i] - prefix[i - 1];
        }
        return orig;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter " + n + " elements of the prefix sum array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Prefix Sum Array: ");
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();

        System.out.println("Reconstructed Original Array: ");
        int[] orig = prefixToArray(arr);
        for (int a : orig) {
            System.out.print(a + " ");
        }
    }
}
