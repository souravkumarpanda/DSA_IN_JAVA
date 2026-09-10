package Problems;

// GFG

import java.util.*;

public class ReverseQueue_1 {
    static void reverseQueue(Queue<Integer> q) {
        Stack<Integer> st = new Stack<>();
        while (!q.isEmpty()) st.push(q.remove());
        while (!st.isEmpty()) q.add(st.pop());
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(5); q.add(10); q.add(15); q.add(20); q.add(25);
        System.out.println("Original Queue: " + q);
        reverseQueue(q);
        System.out.println("After Reversal: " + q);
    }
}
