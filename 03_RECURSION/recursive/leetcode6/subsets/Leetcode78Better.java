package recursive.leetcode6.subsets;
import java.util.*;

public class Leetcode78Better {
    public List<List<Integer>> subsets(int[] nums){
        List<List<Integer>> output = new ArrayList<>();
        int n = nums.length;
        for (int i=(int)Math.pow(2,n);i<(int)Math.pow(2,n+1);++i){
            String bitmask = Integer.toBinaryString(i).substring(1);
            List<Integer> curr = new ArrayList<>();
            for (int j=0;j<n;++j){
                if (bitmask.charAt(j)=='1'){
                    curr.add(nums[j]);
                }
            }
            output.add(curr);
        }
        return output;
    }

    public static void main(String[] args) {
        Leetcode78Better sol = new Leetcode78Better();
        int[] nums = {1,2,3};
        List<List<Integer>> result = sol.subsets(nums);
        System.out.println("All subsets:");
        for (List<Integer> subset:result){
            System.out.println(subset);
        }
    }
}
