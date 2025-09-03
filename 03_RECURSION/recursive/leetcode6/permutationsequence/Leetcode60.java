package recursive.leetcode6.permutationsequence;

import java.util.*;

public class Leetcode60 {
    public static void permutation(List<String> v, String ans, String org){
        if (org.isEmpty()){
            v.add(ans);
            return;
        }
        for (int i=0;i<org.length();i++){
            char ch = org.charAt(i);
            String left = org.substring(0,i);
            String right = org.substring(i+1);
            permutation(v,ans+ch,left+right);
        }
    }
    String getPermutation(int n, int k){
        String str = "";
        for (int i=1;i<=n;i++){
            str += Integer.toString(i);
        }
        List<String> v = new ArrayList<>();
        permutation(v,"",str);
        return v.get(k - 1);
    }

    public static void main(String[] args) {
        Leetcode60 obj = new Leetcode60();
        System.out.println(obj.getPermutation(3,3));
    }
}
