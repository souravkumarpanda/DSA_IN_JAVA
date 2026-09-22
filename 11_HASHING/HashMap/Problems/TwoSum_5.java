package HashMap.Problems;

// Leetcode - 1

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class TwoSum_5 {
    static int[] twoSum(int[] arr, int target) {
        int n = arr.length;
        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i=0;i<n;i++) {
            int rem = target-arr[i];
            if (map.containsKey(rem)) {
                ans.add(map.get(rem));
                ans.add(i);
            }else map.put(arr[i],i);
        }
        int[] res = new int[ans.size()];
        for (int i=0;i<ans.size();i++) res[i] = ans.get(i);
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(arr,target)));
    }
}
