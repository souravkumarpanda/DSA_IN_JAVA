package Problems.ReverseStack_2;

// GFG

import java.util.Stack;

public class ByUsingExtraStack {
    // TC = O(n) and AS = O(n)
    static void reverse(Stack<Integer> st) {
        Stack<Integer> st2 = new Stack<>();
        Stack<Integer> st3 = new Stack<>();
        while (!st.isEmpty()) {
            st2.push(st.pop());
        }
        while (!st2.isEmpty()) {
            st3.push(st2.pop());
        }
        while (!st3.isEmpty()) {
            st.push(st3.pop());
        }
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10); st.push(40); st.push(-2);
        st.push(30); st.push(80);
        System.out.println("Original Stack: " + st);
        reverse(st);
        System.out.println("After Reverse: " + st);
    }
}
