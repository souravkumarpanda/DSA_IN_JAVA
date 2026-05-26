// 13. Reverse an Array
package basicproblemsinanarray;
import java.util.*;
public class ReverseArray {
    public static void swap(int[] arr){
        int n = arr.length;
        int i=0;
        int j = n-1;
        while (i<j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public static void reverse(int[] arr){
        swap(arr);
        for (int ele:arr){
            System.out.println(ele);
        }
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
        reverse(arr);
    }
}
