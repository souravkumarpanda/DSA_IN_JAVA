package recursive.recursionproblems5;
import java.util.*;
public class SubsetSums {
    public static void find(int idx, int[] arr, int sum, int n,ArrayList<Integer> ans) {

        if(idx >= n) {
            ans.add(sum);
            return ;
        }
        find(idx+1, arr, sum + arr[idx], n,ans);
        find(idx+1, arr, sum, n, ans);
    }
    public static ArrayList<Integer> subsetSums(int[] arr) {
        ArrayList<Integer> ans = new ArrayList<>();
        int n = arr.length;
        find(0, arr, 0, n, ans);
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 5};
        ArrayList<Integer> result = subsetSums(arr);
        Collections.sort(result);
        System.out.println("Subset sums: " + result);
    }
}
