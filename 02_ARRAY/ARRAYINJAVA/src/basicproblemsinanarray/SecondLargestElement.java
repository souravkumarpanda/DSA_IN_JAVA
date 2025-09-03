// 10. Find the second-largest element in the given array.
package basicproblemsinanarray;

import java.util.Scanner;

public class SecondLargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements present in array: ");
        for (int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            if (arr[i] > max) max = arr[i];
        }
        int second_max = Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            if (arr[i] > second_max && arr[i]!=max) second_max = arr[i];
        }
        System.out.println(second_max);
    }
}
