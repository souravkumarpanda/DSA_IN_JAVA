//         *
//        * *
//       * * *
//      * * * *
//     * * * * *
//     * * * * *
//      * * * *
//       * * *
//        * *
//         *
import java.util.Scanner;

public class NINTH_PATTERN {
    public static void Print(int n){
        // Upper half of the Diamond
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        // Lower half of the diamond
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        Print(n);
    }
}