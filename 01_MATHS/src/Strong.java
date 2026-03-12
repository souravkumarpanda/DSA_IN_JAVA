public class Strong {
    public static int Factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        return n*Factorial(n-1);
    }
    public static boolean isStrong(int n){
        int temp = n;
        int sum = 0;
        while (n>0){
            int digit = n%10;
            sum += Factorial(digit);
            n = n/10;
        }
        return sum == temp;
    }

    public static void main(String[] args) {
        System.out.println(isStrong(145));
    }
}
