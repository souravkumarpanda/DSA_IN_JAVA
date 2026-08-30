package Problems;

// Leetcode - 84

import java.util.Stack;

public class LargestRectangleInHistogram_12 {
    static int largestRectangleArea(int[] arr) {
        int n = arr.length;
        int[] nse = new int[n];
        nse[n-1] = n;
        Stack<Integer> st = new Stack<>();
        st.push(n-1);
        for (int i=n-2;i>=0;i--) {
            while (!st.isEmpty() && arr[st.peek()]>=arr[i]) st.pop();
            if (st.isEmpty()) nse[i] = n;
            else nse[i] = st.peek();
            st.push(i);
        }
        while (!st.isEmpty()) st.pop();
        int[] pse = new int[n];
        pse[0] = -1;
        st.push(0);
        for (int i=1;i<n;i++) {
            while (!st.isEmpty() && arr[st.peek()]>=arr[i]) st.pop();
            if (st.isEmpty()) pse[i] = -1;
            else pse[i] = st.peek();
            st.push(i);
        }
        int maxArea = 0;
        for (int i=0;i<n;i++) {
            int area = arr[i]*(nse[i]-pse[i]-1);
            maxArea = Math.max(maxArea,area);
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int[] arr = {5,3,6,2,5,4,1};
        System.out.println(largestRectangleArea(arr));
    }
}
