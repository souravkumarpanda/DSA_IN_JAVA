package HashSet.Problems;

// GFG
import java.util.*;

public class TwoSumPairWithGivenSum_2 {
    static boolean twoSum(int[] arr, int target) {
        HashSet<Integer> set = new HashSet<>();
        for (int ele:arr) {
            int rem = target-ele;
            if (set.contains(rem)) return true;
            set.add(ele);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {0,-1,2,-3,1};
        int target = -2;
        System.out.println(twoSum(arr,target));
    }
}
