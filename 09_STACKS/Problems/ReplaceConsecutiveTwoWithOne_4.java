package Problems;

// GFG

import java.util.Stack;

public class ReplaceConsecutiveTwoWithOne_4 {
    static String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        for (char ch:s.toCharArray()) {
            if (stack.isEmpty() || stack.peek()!=ch) {
                stack.push(ch);
            }
        }
        StringBuilder result = new StringBuilder();
        for (char ch:stack) result.append(ch);
        return result.toString();
    }

    public static void main(String[] args) {
        String s = "aaabbcccdaa";
        System.out.println(removeDuplicates(s));
    }
}
