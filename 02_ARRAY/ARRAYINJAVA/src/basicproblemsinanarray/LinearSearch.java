// 1. Find the element x in the array. Linear search.
package basicproblemsinanarray;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements of array: ");
        for (int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter x: ");
        int x = sc.nextInt();
        boolean flag = false;
        for (int i=0;i< arr.length;i++){
            if (arr[i] == x){
                flag = true;
                break;
            }
        }
        if (!flag) System.out.println("No number is not found");
        else System.out.println("Yes number is found.");
    }
}
