// 14. Rotate Array
package basicproblemsinanarray;
import java.util.*;
public class RotateArray {
    public static void rotate(int[] arr, int d){
        int n = arr.length;
        if (n==0) return;
        d = d%n;
        if (d==0) return;
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
    }
    public static void reverse(int[] arr, int i, int j){
        while (i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
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
        System.out.println("Enter d: ");
        int d = sc.nextInt();
        rotate(arr,d);
        System.out.println(Arrays.toString(arr));
    }
}
