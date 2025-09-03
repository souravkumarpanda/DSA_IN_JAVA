package recursive.homeworks7;
import java.util.*;

public class Factorial {
    public static int Fact(int n){
        if(n==0 || n==1) return 1;
        return n*Fact(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.println(Fact(n));
    }
}
