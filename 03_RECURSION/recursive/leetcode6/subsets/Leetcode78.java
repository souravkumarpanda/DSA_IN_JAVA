package recursive.leetcode6.subsets;

import java.util.*;

public class Leetcode78 {
    static void helper(List<Integer> num, List<Integer> ans, List<List<Integer>> finalAns, int idx){
        if (idx == num.size()) {
            finalAns.add(new ArrayList<>(ans));
            return;
        }
        helper(num, ans, finalAns, idx+1);
        ans.add(num.get(idx));
        helper(num, ans, finalAns, idx+1);
        ans.remove(ans.size() - 1);
    }
    public List<List<Integer>> subsets(List<Integer> num){
        List<Integer> ans = new ArrayList<>();
        List<List<Integer>> finalAns = new ArrayList<>();
        helper(num,ans,finalAns,0);
        return finalAns;
    }

    public static void main(String[] args) {
        Leetcode78 solution = new Leetcode78();
        List<Integer> num = Arrays.asList(1,2,3);
        List<List<Integer>> result = solution.subsets(num);
        for (List<Integer> subset:result){
            System.out.println(subset);
        }
    }
}
