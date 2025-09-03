public class PowerofXN {
    public double myPow(double x, int n) {
        long N = n;
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }

        double result = 1.0;
        double currentProduct = x;

        while (N > 0) {
            if ((N % 2) == 1) {
                result *= currentProduct;
            }
            currentProduct *= currentProduct;
            N /= 2;
        }

        return result;
    }

    public static void main(String[] args) {
        PowerofXN solution = new PowerofXN();
        double base = 2.0;
        int exponent = 10;
        System.out.println("2^10 = " + solution.myPow(base, exponent));
    }
}
