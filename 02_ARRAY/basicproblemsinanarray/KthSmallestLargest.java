// 11. Find the k-th smallest and largest elements.
package basicproblemsinanarray;

import java.util.*;

public class KthSmallestLargest {

    public static int[] findKthSmallestAndLargest(int[] arr, int k) {
        Arrays.sort(arr);
        int kthSmallest = arr[k - 1];
        int kthLargest = arr[arr.length - k];
        return new int[]{kthSmallest, kthLargest};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the value of k: ");
        int k = sc.nextInt();

        if (k <= 0 || k > n) {
            System.out.println("Invalid value of k. It should be between 1 and " + n);
        } else {
            int[] result = findKthSmallestAndLargest(arr, k);
            System.out.println("K-th Smallest Element: " + result[0]);
            System.out.println("K-th Largest Element: " + result[1]);
        }

        sc.close();
    }
}

