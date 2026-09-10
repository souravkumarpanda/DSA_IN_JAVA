package Problems;

// Leetcode - 649
import java.util.*;

public class Dota2Senate_8 {
    static String predictPartyVictory(String senate) {
        Queue<Integer> q = new LinkedList<>();
        Queue<Integer> r = new LinkedList<>();
        Queue<Integer> d = new LinkedList<>();
        StringBuilder sb = new StringBuilder(senate);
        for (int i=0;i<senate.length();i++) {
            q.add(i);
            if (senate.charAt(i)=='R') r.add(i);
            else d.add(i);
        }
        while (q.size()>1) {
            if (sb.charAt(q.peek())=='X') q.remove();
            else if (sb.charAt(q.peek())=='R') {
                if (d.isEmpty()) return "Radiant";
                else {
                    int index = d.peek();
                    sb.setCharAt(index, 'X');
                    d.remove();
                    q.add(q.peek());
                    q.remove();
                    r.add(r.peek());
                    r.remove();
                }
            }else {
                if (r.isEmpty()) return "Dire";
                else {
                    int index = r.peek();
                    sb.setCharAt(index, 'X');
                    r.remove();
                    q.add(q.peek());
                    q.remove();
                    d.add(d.peek());
                    d.remove();
                }
            }
        }
        if (sb.charAt(q.peek())=='R') return "Radiant";
        else return "Dire";
    }

    public static void main(String[] args) {
        String senate = "RDD";
        System.out.println(predictPartyVictory(senate));
    }
}
