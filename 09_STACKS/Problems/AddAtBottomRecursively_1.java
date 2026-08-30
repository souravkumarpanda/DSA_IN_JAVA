package Problems;

// GFG

import java.util.Stack;

public class AddAtBottomRecursively_1 {
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
        int x = 50;
        System.out.println("Original Stack: " + st);
        insertAtBottom(st,x);
        System.out.println("After Add, New Stack: " + st);
    }
}
