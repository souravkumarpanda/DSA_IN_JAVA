package recursive.leetcode6.combinationsum;

import java.util.*;
public class CombinationSumWrongly {
    public static void combination(List<Integer> v, int[] candidates, int n, int target){
        if (target==0){
            for (int i=0;i<v.size();i++){
                System.out.print(v.get(i) + " ");
            }
            System.out.println();
            return;
        }
        if (target<0) return;
        for (int i=0;i<n;i++){
            v.add(candidates[i]);
            combination(v, candidates, n, target- candidates[i]);
            v.removeLast();
        }
    }

    public static void main(String[] args) {
        int[] candidates = {2,3,5};
        int n = candidates.length;
        List<Integer> v = new ArrayList<>();
        combination(v, candidates,n,8);
    }
}
