package GCDLCM;

public class GCDOPTIMIZEEUCLIDEAN {
    public static int EuclideanOptimize(int a, int b){
        if(b==0){
            return a;
        }
        return EuclideanOptimize(b,a%b);
    }

    public static void main(String[] args) {
        System.out.println(EuclideanOptimize(36,60));
    }
}
