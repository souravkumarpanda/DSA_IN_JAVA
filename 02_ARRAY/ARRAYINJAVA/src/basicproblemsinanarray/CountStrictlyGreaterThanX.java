// 8. count the number of elements strictly greater than the value x
package basicproblemsinanarray;

import java.util.Scanner;

public class CountStrictlyGreaterThanX {
    public static int strictlyGreater(int[] arr, int x){
        int count = 0;
        for (int i=0;i< arr.length;i++){
            if (arr[i] > x){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        System.out.println("Count of elements strictly greater than " + x + " is: " + strictlyGreater(arr,x));
    }
}
