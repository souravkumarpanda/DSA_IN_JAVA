// 9.
package basicproblemsinanarray;
import java.util.*;
public class SecondLargestElementAnotherApproach {
    public static int secondLargest(int[] arr){
        if (arr.length < 2) {
            throw new IllegalArgumentException("Array must contain at least two elements.");
        }

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num < first) {
                second = num;
            }
        }

        if (second == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("No second largest element found.");
        }

        return second;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        try {
            int secondLargest = secondLargest(arr);
            System.out.println("The second largest element in the array is: " + secondLargest);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }
}
