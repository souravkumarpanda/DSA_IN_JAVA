package FibonacciSequence;

public class MemoizationApproach {
    public static void main(String[] args) {
        int n = 10;
        int[] memo = new int[n+1];
        for (int i=1;i<=n;i++){
            System.out.print(Fib(i,memo)+" ");
        }
    }
    public static int Fib(int n, int[] memo){
        if (memo[n] != 0){
            return memo[n];
        }
        if (n==1 || n==2){
            return 1;
        }else {
            memo[n] = Fib(n-1,memo) + Fib(n-2,memo);
            return memo[n];
        }
    }
}
