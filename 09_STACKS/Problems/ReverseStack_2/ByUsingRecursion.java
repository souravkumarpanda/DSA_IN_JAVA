package Problems.ReverseStack_2;

import java.util.Stack;

public class ByUsingRecursion {
    //  TC = O(n^2) and AS = O(n)
    static void reverse(Stack<Integer> st) {
        if (st.isEmpty()) return;
        int top = st.pop();
        reverse(st);
        insertAtBottom(st,top);
    }
    static void insertAtBottom(Stack<Integer> st, int x) {
        if (st.isEmpty()) {
            st.push(x);
            return;
        }
        int top = st.pop();
        insertAtBottom(st,x);
        st.push(top);
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
