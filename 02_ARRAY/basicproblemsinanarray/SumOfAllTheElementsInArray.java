// 3. Calculate the sum of all the elements present in the given array.
package basicproblemsinanarray;

import java.util.Scanner;

public class SumOfAllTheElementsInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Array Elements: ");
        for (int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i=0;i<n;i++){
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
