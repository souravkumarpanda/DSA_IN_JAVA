// Print good morning n number of times, where n is user input.

package recursive.homeworks7;
import java.util.*;

public class printNTimes {
    public static void print(int n){
        if (n==0) return;
        System.out.println("Good Morning!");
        print(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        print(n);
    }
}
