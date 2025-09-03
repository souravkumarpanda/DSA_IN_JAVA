package Prime;

public class OptimizePrime {
    public static boolean PrimeOptimize(int num){
        if(num == 0 || num == 1){
            return false;
        }
        if(num == 2){
            return true;
        }
        for (int i=2;i*i<=num;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(PrimeOptimize(3));
    }
}
