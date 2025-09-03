// 17. Wave array
package basicproblemsinanarray;
import java.util.*;
public class WaveArray {
    public static void sortInWave(int[] arr){
        for(int i=0;i< arr.length-1;i+=2){
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
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
        sortInWave(arr);
        System.out.println(Arrays.toString(arr));
    }
}
