package Deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class CoreOP {
    public static void main(String[] args) {
        Deque<Integer> dq = new ArrayDeque<>();
        dq.addFirst(10);     // insert front
        dq.addFirst(20);
        dq.addFirst(30);
        dq.addLast(40);       // insert rear
        dq.addLast(50);
        dq.addLast(60);
        System.out.println(dq);
        System.out.println(dq.removeFirst());    // remove + return front (throws if empty)
        System.out.println(dq.removeLast());     // remove + return rear (throws if empty)
        System.out.println(dq.peekFirst());      // view front (returns null if empty, doesn't throw)
        System.out.println(dq.peekLast());       // view rear (returns null if empty, doesn't throw)
        System.out.println(dq.isEmpty());
        System.out.println(dq.size());
    }
}
