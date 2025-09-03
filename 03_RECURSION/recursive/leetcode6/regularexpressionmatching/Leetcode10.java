package recursive.leetcode6.regularexpressionmatching;
import java.util.*;

public class Leetcode10 {
    public boolean isMatch(String text, String pattern){
        if(pattern.isEmpty()) return text.isEmpty();
        boolean first_match = (!text.isEmpty() && (pattern.charAt(0) == text.charAt(0) || pattern.charAt(0) == '.'));
        if (pattern.length() >= 2 && pattern.charAt(1) == '*') {
            return (isMatch(text, pattern.substring(2)) || (first_match && isMatch(text.substring(1), pattern)));
        } else {
            return (
                    first_match && isMatch(text.substring(1), pattern.substring(1))
            );
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a text: ");
        String text = sc.next();
        System.out.println("Enter a pattern: ");
        String pattern = sc.next();
        Leetcode10 RE = new Leetcode10();
        System.out.println(RE.isMatch(text,pattern));
    }
}