import java.util.Scanner;
public class MultiplicationTables {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the starting number: ");
        int start = scanner.nextInt();
        System.out.print("Enter the ending number: ");
        int end = scanner.nextInt();
        System.out.print("Enter the range for the multiplication tables: ");
        int range = scanner.nextInt();
        for (int num = start; num <= end; num++) {
            System.out.println("\nMultiplication table for " + num + ":");
            for (int i = 1; i <= range; i++) {
                System.out.println(num + " x " + i + " = " + (num * i));
            }
        }
        scanner.close();
    }
}
