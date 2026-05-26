//        01 02 03 04 05
//        06 07 08 09 10
//        11 12 13 14 15
//        16 17 18 19 20
//        21 22 23 24 25


import java.util.Scanner;

public class FIFTH_PATTERN {
    public static void Print(int n){
        int num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.printf("%02d ", num);
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
