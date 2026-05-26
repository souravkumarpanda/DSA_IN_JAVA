// 10. Input a string of even length and return the second half of that string using
// inbuilt substr function.
package problems;
import java.util.*;
public class SecondHalfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string of even length: ");
        String str = sc.nextLine();
        int n = str.length();
        if (n % 2 != 0) {
            System.out.println("Error: String length must be even.");
            return;
        }
        String secondHalf = str.substring(n / 2);
        System.out.println("Second half of the string: " + secondHalf);
    }
}
