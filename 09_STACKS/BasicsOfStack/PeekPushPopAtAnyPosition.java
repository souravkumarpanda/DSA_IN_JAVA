package BasicsOfStack;

import java.util.Stack;

public class PeekPushPopAtAnyPosition {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        Stack<Integer> st2 = new Stack<>();
        st.push(10); st.push(40); st.push(-2);
        st.push(30); st.push(80);
        System.out.println(st);
        int idx = 2;
//        Get at any position - peek()
        while (st.size()>idx+1) {
            st2.push(st.pop());
        }
        System.out.println(st.peek());
        while (!st2.isEmpty()) {
            st.push(st2.pop());
        }
//        Insert at any position - push()
        while (st.size()>idx) {
            st2.push(st.pop());
        }
        st.push(60);
        while (!st2.isEmpty()) {
            st.push(st2.pop());
        }
        System.out.println(st);
//        Remove at any position - pop()
        while (st.size()>idx+1) {
            st2.push(st.pop());
        }
        st.pop();
        while (!st2.isEmpty()) {
            st.push(st2.pop());
        }
        System.out.println(st);
    }
}
