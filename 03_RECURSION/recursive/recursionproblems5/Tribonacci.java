package recursive.recursionproblems5;
import java.util.Scanner;

public class Tribonacci {
    public static int Tri(int n){
        if (n==0) return 0;
        if (n==1 || n==2) return 1;
        return Tri(n-1) + Tri(n-2) + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        System.out.println(Tri(n));
    }
}
