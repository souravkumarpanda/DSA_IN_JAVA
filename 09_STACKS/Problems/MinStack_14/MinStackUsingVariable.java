package Problems.MinStack_14;

import java.util.Stack;

public class MinStackUsingVariable {
    static Stack<Long> st;
    static long min;
    static void minStack() {
        st = new Stack<>();
        min = Long.MAX_VALUE;
    }
    static void push(int val) {
        if (st.isEmpty()) min = (long)val;
        if ((long)val>=min) st.push((long)val);
        else {
            st.push((long)val + ((long)val-min));
            min = (long)val;
        }
    }
    static void pop() {
        if (st.peek()<min) {
            min = min + (min-st.peek());
        }
        st.pop();
    }
    static int top() {
        long q = st.peek();
        if (q<min) return (int)min;
        else return (int)q;
    }
    static int getMin() {
        return (int)min;
    }

    public static void main(String[] args) {
        minStack();
        push(5); push(3); push(7); push(2);
        System.out.println("Minimum: "+ getMin());
        System.out.println("Top: "+ top());
        pop();
        System.out.println("After POP Minimum: "+ getMin());
        System.out.println("After POP Top: "+ top());
    }
}
