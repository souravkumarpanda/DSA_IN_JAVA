package recursive.recursionproblems5;
import java.util.Scanner;

public class CustomRecurrence {
    public static int custom(int n){
        if (n<=1){
            return 1;
        }
        int subProblem1 = custom(n/2);
        int subProblem2 = custom(n/4);
        return subProblem1 + subProblem2 + 1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        int result = custom(n);
        System.out.println("Result: "+result);
    }
}
