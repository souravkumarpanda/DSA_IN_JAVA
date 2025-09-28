// Given an array a consisting of integers. Return the first value repeated in this
// array. If no value is repeated, return -1.
package arraymanipulation;
import java.util.*;
public class FirstValueRepeating {
    public static int firstRepeatingNumber(int[] arr){
        int n = arr.length;
        for (int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                if (arr[i] == arr[j]) return arr[i];
            }
        }
        return -1;
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
        System.out.println(firstRepeatingNumber(arr));
    }
}
