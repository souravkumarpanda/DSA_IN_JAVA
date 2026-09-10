package Problems;

// Leetcode - 1823

import java.util.*;

public class FindTheWinnerOfTheCircularGame_3 {
    static int findTheWinner(int n, int k) {
        Queue<Integer> q = new LinkedList<>();
        for (int i=1;i<=n;i++) q.add(i);
        while (q.size()>1) {
            for (int i=1;i<=k-1;i++) {
                q.add(q.remove());
            }
            q.remove();
        }
        return q.peek();
    }

    public static void main(String[] args) {
        int n = 5, k = 2;
        System.out.println("Winner of the Game: " + findTheWinner(n,k));
    }
}
