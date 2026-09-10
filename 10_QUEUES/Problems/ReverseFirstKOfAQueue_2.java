package Problems;

// GFG

import java.util.*;

public class ReverseFirstKOfAQueue_2 {
    static Queue<Integer> reverseFirstK(Queue<Integer> q, int k) {
        int n = q.size();
        if (k > n) return q;
        Stack<Integer> st = new Stack<>();
        for (int i = 1; i <= k; i++) {
            st.push(q.remove());
        }
        while (!st.isEmpty()) {
            q.add(st.pop());
        }
        for (int i = 1; i <= n - k; i++) {
            q.add(q.remove());
        }
        return q;
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1); q.add(2); q.add(3); q.add(4); q.add(5);
        int k = 3;
        System.out.println("Original Queue: " + q);
        System.out.println("After Reversal: " + reverseFirstK(q,k));
    }
}
