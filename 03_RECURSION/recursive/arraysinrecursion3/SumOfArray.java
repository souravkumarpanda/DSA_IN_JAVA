package recursive.arraysinrecursion3;

// Sum of an Array

import java.util.Scanner;

public class SumOfArray {
    public static int SOA(int[] arr, int si){
        if (si >= arr.length) return 0;
        return arr[si] + SOA(arr,si+1);
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
        System.out.println("Enter the value of start index: ");
        int si = sc.nextInt();
        System.out.println(SOA(arr,si));
    }
}
