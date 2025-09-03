package recursive.leetcode6.powxn;

public class Leetcode50 {
//    Basic Recursion
    public static double myPower(double x, int n){
        if(n==0) return 1;
        return x*myPower(x,n-1);
    }
//    Exponentiation squaring approach
    public static double myPow(double a, int b){
        long B = b;
        if(B < 0){
            a = 1/a;
            B = -B;
        }
        double result = 1.0;
        double currentProduct = a;
        while (B > 0){
            if (B % 2 == 1){
                result *= currentProduct;
            }
            currentProduct *= currentProduct;
            B /= 2;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(myPower(2.0,10));
        System.out.println(myPow(2.000,10));
    }
}
