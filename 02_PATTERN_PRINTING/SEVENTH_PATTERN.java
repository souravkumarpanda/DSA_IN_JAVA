//         *
//        * *
//       * * *
//      * * * *
//     * * * * *

import java.util.Scanner;

public class SEVENTH_PATTERN {
    public static void Print(int rows){
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows: ");
        int rows = sc.nextInt();
        Print(rows);
    }
}
