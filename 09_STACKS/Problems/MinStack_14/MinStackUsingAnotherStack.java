package Problems.MinStack_14;

// Leetcode - 155

import java.util.Stack;

public class MinStackUsingAnotherStack {
    static Stack<Integer> st;
    static Stack<Integer> minSt;
    static void minStack() {
        st = new Stack<>();
        minSt = new Stack<>();
    }
    static void push(int val) {
        st.push(val);
        if (minSt.isEmpty() || val<minSt.peek()) minSt.push(val);
        else minSt.push(minSt.peek());
    }
    static void pop() {
        st.pop();
        minSt.pop();
    }
    static int top() {
        return st.peek();
    }
    static int getMin() {
        return minSt.peek();
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
