// 2. Count the number of triplets whose sum is equal to the given x.
package targetsum;
import java.util.*;
public class TotalNumberOfTripletsEqualsToX {
    public static int tripletSum(int[] arr, int target){
        int n = arr.length;
        int ans = 0;
        for (int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                for (int k=j+1;k<n;k++){
                    if (arr[i] + arr[j] + arr[k] == target){
                        ans++;
                }
                }
            }
        }
        return ans;
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
        System.out.println("Enter target: ");
        int target = sc.nextInt();
        System.out.println(tripletSum(arr,target));
    }
}
