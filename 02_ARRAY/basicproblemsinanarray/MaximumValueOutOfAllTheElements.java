// 4. Find the maximum value out of all the elements in the given array.
package basicproblemsinanarray;

import java.util.*;

public class MaximumValueOutOfAllTheElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        for (int i=0;i< arr.length;i++){
            if (arr[i] > max) max = arr[i];
        }
        System.out.println(max);
    }
}
