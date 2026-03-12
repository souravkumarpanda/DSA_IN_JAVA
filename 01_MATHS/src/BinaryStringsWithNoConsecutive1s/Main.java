package BinaryStringsWithNoConsecutive1s;

public class Main {
    static final int MOD = 1000000007;

    public static int countStrings(long N) {
        return (int) fib(N + 2);
    }

    public static long fib(long n) {
        if (n == 0)
            return 0;

        long F[][] = new long[][]{{1, 1}, {1, 0}};
        power(F, n - 1);

        return F[0][0];
    }

    public static void multiply(long F[][], long M[][]) {
        long x = (F[0][0] * M[0][0] + F[0][1] * M[1][0]) % MOD;
        long y = (F[0][0] * M[0][1] + F[0][1] * M[1][1]) % MOD;
        long z = (F[1][0] * M[0][0] + F[1][1] * M[1][0]) % MOD;
        long w = (F[1][0] * M[0][1] + F[1][1] * M[1][1]) % MOD;

        F[0][0] = x;
        F[0][1] = y;
        F[1][0] = z;
        F[1][1] = w;
    }

    public static void power(long F[][], long n) {
        if (n == 0 || n == 1)
            return;

        long M[][] = new long[][]{{1, 1}, {1, 0}};
        power(F, n / 2);
        multiply(F, F);

        if (n % 2 != 0)
            multiply(F, M);
    }

    public static void main(String[] args) {
        long N = 3;
        System.out.println("Number of binary strings of length " + N + " with no consecutive 1s: " + countStrings(N));
    }
}
