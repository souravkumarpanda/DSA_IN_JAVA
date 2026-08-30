package Problems;

// GFG

import java.util.ArrayList;
import java.util.Stack;

public class NextGreaterElement_7 {
    static ArrayList<Integer> nextLargerElement(int[] arr) {
        int n = arr.length;
        int[] nge = new int[n];
        nge[n-1] = -1;
        Stack<Integer> st = new Stack<>();
        st.push(arr[n-1]);
        for (int i=n-2;i>=0;i--) {
            while (!st.isEmpty() && arr[i]>=st.peek()) st.pop();
            if (st.isEmpty()) nge[i] = -1;
            else nge[i] = st.peek();
            st.push(arr[i]);
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i=0;i<n;i++) {
            ans.add(nge[i]);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {6,8,0,1,3};
        ArrayList<Integer> ans = nextLargerElement(arr);
        System.out.println(ans);
    }
}
