package recursive.homeworks7;
import java.util.*;

public class PrintSum1ToNParameterized {
    public static void Sum1ToN(int sum, int n){
        if (n==0){
            System.out.print(sum);
            return;
        }
        Sum1ToN(sum+n,n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Sum: ");
        int sum = sc.nextInt();
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        Sum1ToN(sum,n);
    }
}
