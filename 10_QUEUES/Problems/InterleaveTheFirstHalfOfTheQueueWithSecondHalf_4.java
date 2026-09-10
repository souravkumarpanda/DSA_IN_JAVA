package Problems;

// GFG
import java.util.*;

public class InterleaveTheFirstHalfOfTheQueueWithSecondHalf_4 {
    static void rearrangeQueue(Queue<Integer> q) {
        Queue<Integer> q2 = new LinkedList<>();
        int n = q.size();
        for (int i=1;i<=n/2;i++) {
            q2.add(q.remove());
        }
        while(!q2.isEmpty()) {
            q.add(q2.remove());
            q.add(q.remove());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1); q.add(2); q.add(3); q.add(4); q.add(5);
        q.add(6); q.add(7); q.add(8);
        System.out.println("Original Queue: "+q);
        rearrangeQueue(q);
        System.out.println("After Interleaving: "+q);
    }
}
