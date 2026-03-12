// 4. Java program to reverse each word in a string.
package problems.reverseeachwords;
import java.util.*;
public class ReverseEachWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder ans = new StringBuilder();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != ' ') {
                sb.append(ch);
            } else {
                ans.append(sb.reverse());
                ans.append(" ");
                sb.setLength(0);
            }
        }
        ans.append(sb.reverse());
        System.out.println(ans.toString());
    }
}
