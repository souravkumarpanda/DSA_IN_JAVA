package recursive.leetcode6.generateparenthesis;

public class GenerateParenthesis {
    public static void generate(String s,int open,int close,int n){
        if (close == n){
            System.out.println(s);
            return;
        }
        if (open < n) generate(s+'(',open+1,close,n);
        if (close < open) generate(s+')',open,close+1,n);
    }

    public static void main(String[] args) {
        int n = 3;
        generate("",0,0,n);
    }
}
