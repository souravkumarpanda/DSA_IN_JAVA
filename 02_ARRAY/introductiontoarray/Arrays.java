package introductiontoarray;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
//        Array Initialization & Declaration
        int[] arr = {10,20,30,40,50};
//        Print the Array
        System.out.println(arr);
        System.out.println(arr[3]);
//        Update in Array
        arr[3] = 31;
        System.out.println(arr[3]);
//        New way
        int[] arr_new = new int[7];
        System.out.println(arr_new[1]);
        arr_new[1] = 20;
        System.out.println(arr_new[1]);
//        Printing Output
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
//        Taking Input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size: ");
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        System.out.println("Enter Array Elements: ");
        for (int i=0;i<n;i++){
            arr1[i] = sc.nextInt();
        }
        for (int i=0;i< arr1.length;i++){
            System.out.print(arr1[i] + " ");
        }

    }
}
