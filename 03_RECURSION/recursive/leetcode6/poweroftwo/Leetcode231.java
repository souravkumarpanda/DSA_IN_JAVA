package recursive.leetcode6.poweroftwo;
import java.util.Scanner;

public class Leetcode231 {
    public boolean isPowerOfTwo(int n){
        double num = n;
        while (num > 1) num = num/2;
        if(num == 1.0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        Leetcode231 myObj = new Leetcode231();
        System.out.println(myObj.isPowerOfTwo(n));
    }
}
