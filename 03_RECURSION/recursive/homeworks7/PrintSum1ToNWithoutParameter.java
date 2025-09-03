package recursive.homeworks7;
import java.util.*;

public class PrintSum1ToNWithoutParameter {
    public static int PrintSum(int n){
        if (n==0) return 0;
        return n+PrintSum(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.println(PrintSum(n));
    }
}
