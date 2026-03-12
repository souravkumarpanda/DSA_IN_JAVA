package Factorial;

public class RecursiveApproach {
    public static int Fact(int num){
        if (num == 0 || num == 1){
            return 1;
        }
        return num*Fact(num-1);
    }

    public static void main(String[] args) {
        System.out.println("Factorial of 5 is: "+Fact(5));
    }
}
