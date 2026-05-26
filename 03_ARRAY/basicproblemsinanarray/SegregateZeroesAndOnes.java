// 16. Segregate 0's and 1's in an array
// This is brute force approach better is by using two pointer techniques.
package basicproblemsinanarray;
import java.util.*;
public class SegregateZeroesAndOnes {
        public static void segregate0and1(int[] arr) {
            int numberOfZeroes = 0;
            int numberOfOnes = 0;
            for(int ele:arr){
                if(ele==0) numberOfZeroes++;
                else numberOfOnes++;
            }
            for(int i=0;i<numberOfZeroes;i++){
                arr[i] = 0;
            }
            for(int i=numberOfZeroes;i<arr.length;i++){
                arr[i] = 1;
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
        segregate0and1(arr);
        System.out.println(Arrays.toString(arr));
    }
}
