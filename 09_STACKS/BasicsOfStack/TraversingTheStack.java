package BasicsOfStack;

import java.util.Stack;

public class TraversingTheStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        Stack<Integer> st2 = new Stack<>();
        st.push(10); st.push(40); st.push(-2);
        st.push(30); st.push(80);
        while (!st.isEmpty()) {
            int top = st.pop();
            System.out.println(top);
            st2.push(top);
        }
        while (!st2.isEmpty()) {
            st.push(st2.pop());
        }
    }
}
