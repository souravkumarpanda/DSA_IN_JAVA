package GCDLCM;

public class GCD {
    public static int HCF(int a, int b){
        int result = Math.min(a,b);
        while (result > 0){
            if(a%result == 0 && b%result == 0){
                break;
            }
            result--;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(HCF(36,60));
    }
}
