package Nthdigitofpi;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;

public class AnotherSolution {
    public static BigInteger sqrt(BigInteger n, BigInteger m) {
        BigInteger m1 = BigInteger.TEN.pow(16);
        BigDecimal m2 = new BigDecimal(n.multiply(m1)).divide(new BigDecimal(m), MathContext.DECIMAL128);
        BigInteger b = BigInteger.valueOf((int) Math.sqrt(m2.doubleValue())).multiply(m).divide(m1);
        BigInteger n_m = n.multiply(m);

        while (true) {
            BigInteger a = b;
            b = b.add(n_m.divide(b)).divide(BigInteger.valueOf(2));
            if (b.equals(a)) {
                break;
            }
        }
        return b;
    }

    public static BigInteger power(int n) {
        if (n == 0) {
            return BigInteger.ONE;
        }
        BigInteger r = power(n / 2);
        if (n % 2 == 0) {
            return r.multiply(r);
        }
        return r.multiply(r).multiply(BigInteger.TEN);
    }

    public static BigInteger pi() {
        BigInteger m = power(100000);
        BigInteger c = BigInteger.valueOf(640320).pow(3).divide(BigInteger.valueOf(24));
        int n = 1;
        BigInteger Ak = m;
        BigInteger Asum = m;
        BigInteger Bsum = BigInteger.ZERO;

        while (!Ak.equals(BigInteger.ZERO)) {
            Ak = Ak.multiply(BigInteger.valueOf(-(6 * n - 5) * (2 * n - 1) * (6 * n - 1))).divide(BigInteger.valueOf(n * n * n).multiply(c));
            Asum = Asum.add(Ak);
            Bsum = Bsum.add(BigInteger.valueOf(n).multiply(Ak));
            n = n + 1;

            BigInteger result = BigInteger.valueOf(426880).multiply(sqrt(BigInteger.valueOf(10005).multiply(m), m)).multiply(m).divide(BigInteger.valueOf(13591409).multiply(Asum).add(BigInteger.valueOf(545140134).multiply(Bsum)));
            return result;
        }
        return BigInteger.ZERO;
    }

    public static void main(String[] args) {
        String stringPi = pi().toString();
        System.out.println("Value of Pi: " + stringPi);
    }
}