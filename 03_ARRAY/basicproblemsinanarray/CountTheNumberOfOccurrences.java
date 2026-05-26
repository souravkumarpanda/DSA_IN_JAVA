// 2. count the number of occurrences present of a particular elements x.
package basicproblemsinanarray;
import java.util.*;

public class CountTheNumberOfOccurrences {
    public static int countOccurrences(int[] arr, int x){
        int count = 0;
        for (int i=0;i< arr.length;i++){
            if (arr[i]==x){
                count++;
            }
        }
        return count;
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
        int x = sc.nextInt();
        System.out.println(countOccurrences(arr,x));
    }
}
