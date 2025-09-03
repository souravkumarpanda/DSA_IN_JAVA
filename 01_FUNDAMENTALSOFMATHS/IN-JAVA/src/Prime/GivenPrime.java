package Prime;

public class GivenPrime {
    public static boolean IsPrime(int num){
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
    public static void PrintPrimeNumbers(int n){
        for (int i=2;i<n;i++){
            if (IsPrime(i)){
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        PrintPrimeNumbers(23);
    }
}
