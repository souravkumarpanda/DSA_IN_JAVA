package recursive.homeworks7;
import java.util.*;

public class PrintNTo1 {
    public static void Print(int n){
        if(n==0) return;
        System.out.print(n + " ");
        Print(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        Print(n);
    }
}
