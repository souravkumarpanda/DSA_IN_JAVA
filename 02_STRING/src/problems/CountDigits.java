// 11. Return the total number of digits in a number without using any loop.
package problems;
import java.util.Scanner;
public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n =  Math.abs(sc.nextInt());
        String str =""+n;
        System.out.println(str.length());
    }
}
