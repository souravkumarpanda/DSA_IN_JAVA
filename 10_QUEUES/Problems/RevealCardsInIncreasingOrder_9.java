package Problems;

// Leetcode - 950
import java.util.*;

public class RevealCardsInIncreasingOrder_9 {
    static int[] deckRevealedIncreasing(int[] deck) {
        int n = deck.length;
        Arrays.sort(deck);
        Queue<Integer> q = new LinkedList<>();
        for (int i=0;i<n;i++) q.add(i);
        int[] ans = new int[n];
        for (int i=0;i<n;i++) {
            int idx = q.peek();
            q.remove();
            q.add(q.peek());
            q.remove();
            ans[idx] = deck[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] deck = {17,13,11,2,3,5,7};
        System.out.println(Arrays.toString(deckRevealedIncreasing(deck)));
    }
}
