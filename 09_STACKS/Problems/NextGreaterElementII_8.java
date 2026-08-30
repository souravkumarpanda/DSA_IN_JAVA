package Problems;

// Leetcode - 503

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElementII_8 {
    static int[] nextGreaterElements(int[] arr) {
        int n = arr.length;
        int[] nge = new int[n];
        Stack<Integer> st = new Stack<>();
        for (int i=n-1;i>=0;i--) {
            st.push(arr[i]);
        }
        for (int i=n-1;i>=0;i--) {
            while (!st.isEmpty() && arr[i]>=st.peek()) st.pop();
            if (st.isEmpty()) nge[i] = -1;
            else nge[i] = st.peek();
            st.push(arr[i]);
        }
        return nge;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,3};
        System.out.println(Arrays.toString(nextGreaterElements(arr)));
    }
}
