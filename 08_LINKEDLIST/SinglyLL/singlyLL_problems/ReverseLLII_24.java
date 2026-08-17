package SinglyLL.singlyLL_problems;

// Leetcode 92 or GFG

public class ReverseLLII_24 {
    static ListNode reverse(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        ListNode fwd = null;
        while (curr!=null) {
            fwd = curr.next;
            curr.next = prev;
            prev = curr;
            curr = fwd;
        }
        return prev;
    }
    static ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode temp = dummy;

        for (int i=1;i<=left-1;i++) {
            temp = temp.next;
        }
        ListNode tail1 = temp;
        ListNode head2 = temp.next;

        for (int i=1;i<=right-left+1;i++) {
            temp = temp.next;
        }
        ListNode tail2 = temp;
        ListNode head3 = temp.next;

        tail1.next = null;
        tail2.next = null;

        reverse(head2);

        tail1.next = tail2;
        head2.next = head3;
        return dummy.next;
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
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        ListNode e = new ListNode(5);
        a.next = b; b.next = c; c.next = d; d.next = e;
        System.out.println("Original Linked List");
        display(a);
        a = reverseBetween(a,2,4);
        System.out.println("After reverse of sublist ");
        display(a);
    }
}
