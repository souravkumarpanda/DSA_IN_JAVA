package recursive.recursionproblems5;
import java.util.Scanner;

public class ExponentialGrowth {
    public static int EG(int n, int c){
        if (n==0) return 1;
        return 2*EG(n-1,c) + c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        System.out.println("Enter the value of c: ");
        int c = sc.nextInt();
        System.out.println(EG(n,c));
    }
}
