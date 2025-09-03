package recursive.leetcode6.generateparenthesis;
import java.util.*;

public class Leetcode22 {
    public static void generate(List<String> ans,String s,int open,int close,int n){
        if (close == n){
            ans.add(s);
            return;
        }
        if (open < n) generate(ans,s+'(',open+1,close,n);
        if (close < open) generate(ans,s+')',open,close+1,n);
    }
    List<String> generateParenthesis(int n){
        List<String> ans = new ArrayList<>();
        generate(ans,"",0,0,n);
        return ans;
    }

    public static void main(String[] args) {
        int n = 3;
        Leetcode22 obj = new Leetcode22();
        List<String> result = obj.generateParenthesis(n);
        System.out.println(result);
    }
}
