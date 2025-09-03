package Factorial;

public class IterativeApproach {
    public static int Fact(int num){
        int i = 1;
        int result = 1;
        while (i <= num){
            result = result*i;
            i = i+1;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Fact(5));
    }
}
