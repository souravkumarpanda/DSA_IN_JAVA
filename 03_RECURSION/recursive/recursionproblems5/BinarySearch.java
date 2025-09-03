package recursive.recursionproblems5;
import java.util.Scanner;

public class BinarySearch {
    public static int BS(int[] arr, int left, int right, int x){
        if (right >= left){
            int mid = (left+(right-left)/2);
            if (arr[mid] == x){
                return mid;
            }
            if (arr[mid] > x){
                return BS(arr, left, mid-1, x);
            }
            return BS(arr,mid+1,right,x);
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array in sorted order:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the value to search for (x): ");
        int x = sc.nextInt();
        int result = BS(arr, 0, n - 1, x);
        if (result == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
}
