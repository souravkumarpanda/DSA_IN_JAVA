import java.util.Scanner;
public class Armstrong {
    static int armstrongSum(int n, int k) {
        if (n == 0) {
            return 0;
        }
        int digit = n % 10;
        return (int) Math.pow(digit, k) + armstrongSum(n / 10, k);
    }
    static boolean isArmstrong(int n) {
        int k = (int) Math.log10(n) + 1;
        int sum = armstrongSum(n, k);
        return sum == n;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        if (isArmstrong(n)) {
            System.out.println(n + " is an Armstrong Number");
        } else {
            System.out.println(n + " is not an Armstrong Number");
        }
        scanner.close();
    }
}
