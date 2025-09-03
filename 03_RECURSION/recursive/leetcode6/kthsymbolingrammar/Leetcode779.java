package recursive.leetcode6.kthsymbolingrammar;

public class Leetcode779 {
    public static int kthGrammar(int n, int k){
        if (n==1) return 0;
        if (k%2 == 0){
            int prevAns = kthGrammar(n-1,k/2);
            if (prevAns == 0) return 1;
            else return 0;
        }else {
            int prevAns = kthGrammar(n-1,k/2+1);
            return prevAns;
        }
    }

    public static void main(String[] args) {
        System.out.println(kthGrammar(4,7));
    }
}
