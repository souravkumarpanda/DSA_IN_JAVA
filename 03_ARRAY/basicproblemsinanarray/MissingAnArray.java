// 15. Missing An Array.
package basicproblemsinanarray;
import java.util.*;
public class MissingAnArray {
    public static int missingNum(int[] arr) {
        int n = arr.length + 1;
        int sum = n * (n + 1) / 2;
        int arraySum = 0;
        for (int ele : arr) {
            arraySum += ele;
        }
        return sum - arraySum;
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
        System.out.println(missingNum(arr));
    }
}
