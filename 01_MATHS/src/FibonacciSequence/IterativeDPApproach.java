package FibonacciSequence;

public class IterativeDPApproach {
    //    Most optimized approach Space-Optimized Dynamic Programming
    public static int Fib(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        int a = 0, b = 1, fib = 0;
        for (int i = 2; i <= n; i++) {
            fib = a + b;
            a = b;
            b = fib;
        }
        return fib;
    }

    public static void main(String[] args) {
        System.out.println(Fib(10));
    }
}
