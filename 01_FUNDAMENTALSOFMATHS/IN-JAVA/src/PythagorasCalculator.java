import java.util.Scanner;
public class PythagorasCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose an option:");
        System.out.println("1. Calculate the hypotenuse (given two sides).\n2. Verify if the given sides satisfy Pythagoras' theorem.");
        System.out.print("Enter your choice (1 or 2): ");
        int choice = scanner.nextInt();
        if (choice == 1) {
            System.out.print("Enter the lengths of the two sides (a and b): ");
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            double c = Math.sqrt(a * a + b * b);
            System.out.printf("The hypotenuse is: %.2f\n", c);
        } else if (choice == 2) {
            System.out.print("Enter the lengths of the three sides (a, b, and c): ");
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            double c = scanner.nextDouble();
            if (Math.abs(c * c - (a * a + b * b)) < 1e-6) {
                System.out.println("The given sides satisfy Pythagoras' theorem.");
            } else {
                System.out.println("The given sides do not satisfy Pythagoras' theorem.");
            }
        } else {
            System.out.println("Invalid choice. Please run the program again.");
        }
        scanner.close();
    }
}
