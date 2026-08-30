package Problems;

// Leetcode - 20

import java.util.Stack;

public class ValidParentheses_3 {
    static boolean isValid(String s) {
        int n = s.length();
        if (n%2 == 1) return false;
        Stack<Character> st = new Stack<>();
        for (int i=0;i<n;i++) {
            char ch = s.charAt(i);
            if (ch=='(' || ch=='{' || ch=='[') st.push(ch);
            else {
                if (st.isEmpty()) return false;
                char top = st.peek();
                if (sameStyle(ch,top)) st.pop();
                else return false;
            }
        }
        return (st.isEmpty());
    }

    static boolean sameStyle(char ch, char top) {
        if (top=='(' && ch==')') return true;
        if (top=='{' && ch=='}') return true;
        if (top=='[' && ch==']') return true;
        return false;
    }

    public static void main(String[] args) {
        String s = "{([])}()";
        System.out.println(isValid(s));
    }
}
