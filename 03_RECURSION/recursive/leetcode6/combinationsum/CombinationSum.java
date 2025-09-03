package recursive.leetcode6.combinationsum;

import java.util.*;

public class CombinationSum {
    static void combination(List<Integer> v, int[] candidates, int n, int target, int index){
        if (target == 0){
            for (int i=0;i<v.size();i++){
                System.out.print(v.get(i) + " ");
            }
            System.out.println();
            return;
        }
        if (target < 0) return;
        for (int i=index;i<n;i++){
            v.add(candidates[i]);
            combination(v, candidates,n,target- candidates[i], i);
            v.remove(v.size()-1);
        }
    }

    public static void main(String[] args) {
        int[] candidates = {2,3,5};
        int n = candidates.length;
        List<Integer> v = new ArrayList<>();
        combination(v, candidates,n,8,0);
    }
}
