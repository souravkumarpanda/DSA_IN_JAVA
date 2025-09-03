import java.util.Scanner;
public class ReverseNumber {
    public static int reverseNum(int num) {
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return reversed;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        System.out.println("The reverse of " + number + " is " + reverseNum(number));
        scanner.close();
    }
}
