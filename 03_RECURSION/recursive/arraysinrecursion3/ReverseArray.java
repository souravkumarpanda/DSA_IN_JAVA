package recursive.arraysinrecursion3;

// Reverse of an Array

import java.util.Scanner;

public class ReverseArray {
    public static void Array(int[] arr, int si){
        if (si >= arr.length){
            return ;
        }
        Array(arr, si+1);
        System.out.print(arr[si]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array in reverse order:");
        Array(arr, 0);
    }
}
