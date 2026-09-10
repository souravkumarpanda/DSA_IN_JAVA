package Basics;

import java.util.LinkedList;
import java.util.Queue;

public class AddRemovePeekAtAnyPosition {
    static void addAtIndex(Queue<Integer> q, int idx, int val) {
        int n = q.size();
        if (idx<0 || idx>n) {
            System.out.println("Invalid Index");
            return;
        }
        if (idx<n) {
            for (int i=1;i<=idx;i++) {
                q.add(q.remove());
            }
        }
        q.add(val);
        for (int i=1;i<=n-idx;i++) {
            q.add(q.remove());
        }
    }

    static int peekAtIndex(Queue<Integer> q, int idx) {
        int n = q.size();
        if (idx<0 || idx>n) {
            System.out.println("Invalid Index");
            return -1;
        }
        for (int i=1;i<=idx;i++) {
            q.add(q.remove());
        }
        int res = q.peek();
        for (int i=1;i<=n-idx;i++) {
            q.add(q.remove());
        }
        return res;
    }

    static int removeAtIndex(Queue<Integer> q, int idx) {
        int n = q.size();
        if (idx<0 || idx>n) {
            System.out.println("Invalid Index");
            return -1;
        }
        for (int i=1;i<=idx;i++) {
            q.add(q.remove());
        }
        int ans = q.remove();
        int m = q.size();
        for (int i=1;i<=m-idx;i++) {
            q.add(q.remove());
        }
        return ans;
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10); q.add(20); q.add(30); q.add(40); q.add(50);
        System.out.println(q);
        addAtIndex(q,3,60);
        System.out.println(q);
        System.out.println(peekAtIndex(q,3));
        System.out.println(removeAtIndex(q,3));
        System.out.println(q);
    }
}
