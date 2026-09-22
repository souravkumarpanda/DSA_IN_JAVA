package HashSet.Problems;

// GFG
import java.util.*;

public class MissingElementsInRange_4 {
    static ArrayList<Integer> missingRange(int[] arr, int low, int high) {
        ArrayList<Integer> ans = new ArrayList<>(arr.length);
        HashSet<Integer> set = new HashSet<>();
        for (int ele:arr) set.add(ele);
        for (int i=low;i<=high;i++) {
            if (!set.contains(i)) ans.add(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {10,12,11,15};
        int low = 10, high = 15;
        System.out.println(missingRange(arr,low,high));
    }
}
