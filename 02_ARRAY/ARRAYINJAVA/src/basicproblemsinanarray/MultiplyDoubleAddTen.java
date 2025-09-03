// 12. Multiply odd indexed elements by 2 and add even indexed elements by 10.
package basicproblemsinanarray;
import java.util.*;
public class MultiplyDoubleAddTen {
    public static void multiplyAndAdd(int[] arr){
        for (int i=0;i<arr.length;i++){
            if (i%2==0) System.out.print(arr[i]*2 + " ");
            else System.out.print(arr[i]+10 + " ");
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
        multiplyAndAdd(arr);
    }
}
