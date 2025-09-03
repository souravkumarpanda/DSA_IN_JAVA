package recursive.leetcode6.permutationsequence;

public class Leetcode60Better {
    String helper(String str,int k,String ans){
        int n = str.length();
        if (n==0) return ans;
        int fact = 1;
        for (int i=2;i<=n-1;i++){
            fact *= i;
        }
        int idx = k/fact;
        if (k%fact==0) idx--;
        char ch = str.charAt(idx);
        String left = str.substring(0,idx);
        String right = str.substring(idx+1);
        int q = 1;
        if (k%fact==0) q=fact;
        else q=k%fact;
        return helper(left+right,q,ans+ch);
    }
    String getPermutation(int n,int k){
        String str = "";
        for (int i=1;i<=n;i++){
            str += Integer.toString(i);
        }
        return helper(str,k,"");
    }

    public static void main(String[] args) {
        Leetcode60Better obj = new Leetcode60Better();
        System.out.println(obj.getPermutation(3,3));
    }
}
