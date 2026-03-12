import java.util.Scanner;
public class SwapVariables {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a = scanner.nextInt();
        System.out.print("Enter the value of b: ");
        int b = scanner.nextInt();
        System.out.println("\nBefore swapping:");
        System.out.println("a = " + a + ", b = " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("\nAfter swapping:");
        System.out.println("a = " + a + ", b = " + b);
        scanner.close();
    }
}
