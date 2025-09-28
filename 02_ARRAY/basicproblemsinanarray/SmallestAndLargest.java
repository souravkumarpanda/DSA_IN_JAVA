// 5. The smallest and largest element in the given array.
package basicproblemsinanarray;

import java.util.*;

public class SmallestAndLargest {
    public static int[] SmallestLargest(int[] arr){
        Arrays.sort(arr);
        int[] ans = {arr[0], arr[arr.length-1]};
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
        int[] ans = SmallestLargest(arr);
        System.out.println(ans[0]);
        System.out.println(ans[1]);
    }
}
