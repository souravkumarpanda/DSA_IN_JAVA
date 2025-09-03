package recursive.leetcode6.permutationsequence;
import java.util.*;

public class PermutationSequence {
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

    public static void main(String[] args) {
        String str = "123";
        List<String> v = new ArrayList<>();
        permutation(v,"",str);
        for (int i=0;i<v.size();i++){
            System.out.println(v.get(i));
        }
    }
}
