package recursive.homeworks7;
import java.util.*;

public class Print1ToNExtraParameter {
    public static void ExtraParameter(int i,int n){
        if(i>n) return;
        System.out.print(i + " ");
        ExtraParameter(i+1,n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        ExtraParameter(1,n);
    }
}
