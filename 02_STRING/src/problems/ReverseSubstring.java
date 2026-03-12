// 9. Input a string of length greater than 5 and reverse the substring from position
// 2 to 5 using inbuilt functions.
package problems;
import java.util.Scanner;
public class ReverseSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string (length > 5): ");
        String str = sc.nextLine();
        if (str.length() <= 5) {
            System.out.println("Error: String length must be greater than 5.");
            return;
        }
        String part1 = str.substring(0, 2);
        String part2 = str.substring(2, 6);
        String part3 = str.substring(6);
        String reversedPart2 = new StringBuilder(part2).reverse().toString();
        String result = part1 + reversedPart2 + part3;
        System.out.println("Resulting string: " + result);
    }
}
