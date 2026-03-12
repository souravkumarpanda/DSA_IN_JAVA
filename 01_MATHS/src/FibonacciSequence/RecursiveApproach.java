package FibonacciSequence;

public class RecursiveApproach {
    public static int Fib(int n){
        if (n==0){
            return 0;
        }
        if (n==1){
            return 1;
        }
        int fib = Fib(n-1)+Fib(n-2);
        return fib;
    }

    public static void main(String[] args) {
        System.out.println(Fib(10));
    }
}