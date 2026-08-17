package SinglyLL.singlyLL_problems;

// Leetcode - 2058

public class MaxAndMinNumberOfNodesBetweenCP_27 {
    static int[] nodesBetweenCriticalPoints(ListNode head) {
        int min = Integer.MAX_VALUE;
        int max = -1;
        int first = -1;
        int previous = -1;
        int position = 1;
        ListNode prev = head;
        ListNode curr = head.next;
        while (curr.next != null) {
            // Check whether curr is a critical point
            if ((curr.val > prev.val && curr.val > curr.next.val) ||
                    (curr.val < prev.val && curr.val < curr.next.val)) {
                // First critical point
                if (first == -1) {
                    first = position;
                }
                // We already have a previous critical point
                if (previous != -1) {
                    int distance = position - previous;
                    min = Math.min(min, distance);
                }
                previous = position;
            }
            prev = curr;
            curr = curr.next;
            position++;
        }
        // Fewer than 2 critical points
        if (first == previous) {
            return new int[]{-1, -1};
        }
        // Distance between first and last critical point
        max = previous - first;
        return new int[]{min, max};
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        ListNode e = new ListNode(5);
        ListNode f = new ListNode(6);
        ListNode g = new ListNode(7);
        a.next = b; b.next = c; c.next = d;
        d.next = e; e.next = f; f.next = g;
        int[] result = nodesBetweenCriticalPoints(a);
        System.out.println("Output: [" + result[0] + ", " + result[1] + "]");
    }
}
