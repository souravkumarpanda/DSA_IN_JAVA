package Problems.ReverseStack_2;

import java.util.Stack;

public class ByUsingExtraArray {
    // TC = O(n) and AS = O(n)
    static void reverse(Stack<Integer> st) {
        int n = st.size();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = st.pop();
        }
        for (int i = 0; i < n; i++) {
            st.push(arr[i]);
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
