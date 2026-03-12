public class Perfect {
    public static boolean isPerfect(int n){
        if(n<=0){
            return false;
        }
        int sum = 0;
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                sum += i;
            }
        }
        return sum==n;
    }

    public static void main(String[] args) {
        System.out.println("Is 28 a perfect number: "+isPerfect(28));
    }
}
// A perfect number is a positive integer that is equal to the sum of its proper divisors (excluding itself).