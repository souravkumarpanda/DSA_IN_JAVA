package recursive.leetcode6.combinationsum;
import java.util.*;

public class LeetcodeSolution {
    static void combination(List<List<Integer>> ans, List<Integer> v, int[] candidates, int target, int index){
        if (target == 0){
            ans.add(new ArrayList<>(v));
            return;
        }
        if (target<0) return;

        for (int i=index; i<candidates.length;i++){
            v.add(candidates[i]);
            combination(ans, v, candidates, target-candidates[i], i);
            v.remove(v.size()-1);
        }
    }
    static List<List<Integer>> combinationSum(int[] candidates, int target){
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> v = new ArrayList<>();
        combination(ans,v,candidates,target,0);
        return ans;
    }

    public static void main(String[] args) {
        int[] candidates = {2,3,5};
        int target = 8;
        List<List<Integer>> result = combinationSum(candidates,target);
        for (List<Integer> comb : result){
            for (int val:comb){
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
