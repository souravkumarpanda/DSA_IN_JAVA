package BasicsOfStack;

import java.util.Stack;

public class BasicOperationsOfStacks {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        System.out.println(st.isEmpty());
        System.out.println(st.size()==0);
//        System.out.println(st.peek()); // Error: EmptyStackException
//        st.pop(); // Underflow
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println(st.size());
        System.out.println(st); // Auxiliary Space: O(n)
        System.out.println(st.peek());
        st.pop();
        System.out.println(st+" "+st.size());
        System.out.println(st.peek());
        System.out.println(st.pop());
        int s = st.pop();
        System.out.println(s);
    }
}
