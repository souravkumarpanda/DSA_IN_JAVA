//        01 02 03 04 05
//        02 04 06 08 10
//        03 06 09 12 15
//        04 08 12 16 20
//        05 10 15 20 25

import java.util.Scanner;

public class SIXTH_PATTERN {
    public static void Print(int n){
        int num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.printf("%02d ", i*j);
                num++;
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
