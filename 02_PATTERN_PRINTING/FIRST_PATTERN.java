//        * * * * *
//        * * * * *
//        * * * * *
//        * * * * *
//        * * * * *

import java.util.Scanner;

public class FIRST_PATTERN {
    public static void Print(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        Print(n);
    }
}
