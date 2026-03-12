// 8.  Input a string of even length and reverse the first half of the string.
package problems;
import java.util.*;
public class ReverseFirstHalf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string of even length: ");
        String str = sc.nextLine();
        int n = str.length();
        if (n % 2 != 0) {
            System.out.println("Error: String length must be even.");
            return;
        }
        String firstHalf = str.substring(0, n / 2);
        String secondHalf = str.substring(n / 2);
        String reversedFirstHalf = new StringBuilder(firstHalf).reverse().toString();
        String result = reversedFirstHalf + secondHalf;
        System.out.println("Resulting string: " + result);
    }
}
