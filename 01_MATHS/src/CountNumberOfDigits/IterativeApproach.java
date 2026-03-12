package CountNumberOfDigits;

public class IterativeApproach {
    public static int Count(int n){
        if (n==0){
            return 1;
        }
        int count = 0;
        while (n!=0){
            n = n / 10;
            count++;
        }
        return count;
    }
    public static void main(String[] args){
        System.out.println(Count(12345));
    }
}
