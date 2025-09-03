package Tribonacci;

public class MemoizationApproach {
    public static int tribonacci(int n) {
        int[] memo = new int[n + 1];
        return tribonacciHelper(n, memo);
    }

    private static int tribonacciHelper(int n, int[] memo) {
        if (n == 0) return 0;
        if (n == 1 || n == 2) return 1;
        if (memo[n] != 0) return memo[n];
        memo[n] = tribonacciHelper(n - 1, memo) + tribonacciHelper(n - 2, memo) + tribonacciHelper(n - 3, memo);
        return memo[n];
    }

    public static void main(String[] args) {
        System.out.println(tribonacci(3));
    }
}
