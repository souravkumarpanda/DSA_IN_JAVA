package recursive.homeworks7;
import java.util.*;

public class Print1ToNNoExtraParameter {
    public static void Print(int n){
        if(n==0) return;
        Print(n-1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        Print(n);
    }
}
