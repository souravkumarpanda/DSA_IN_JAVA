package SinglyLL.singlyLL_problems;

// Leetcode - 2130

public class MaximumTwinSumOfALL_21 {
    static int pairSum(ListNode head) {
        // Step 1: Find middle
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Reverse second half
        ListNode prev = null;
        ListNode curr = slow;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        // prev is a head of reversed second half
        ListNode first = head;
        ListNode second = prev;

        int max = 0;

        // Step 3: Calculate twin sums
        while (second != null) {
            max = Math.max(max, first.val + second.val);
            first = first.next;
            second = second.next;
        }
        return max;
    }
    static void display(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        ListNode a = new ListNode(2);
        ListNode b = new ListNode(4);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(0);
        ListNode e = new ListNode(5);
        ListNode f = new ListNode(1);
        a.next = b; b.next = c; c.next = d;
        d.next = e; e.next = f;
        System.out.println("Original Linked List");
        display(a);
        System.out.println(pairSum(a));
    }
}
