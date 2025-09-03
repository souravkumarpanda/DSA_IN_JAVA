package recursive.recursionproblems5;
import java.util.Scanner;

public class PrintNtimes {
    public static void print(int n) {
        if (n == 0) {
            return;
        }
        System.out.println("message");
        print(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many times you want to print: ");
        int n = sc.nextInt();
        print(n);
    }
}
