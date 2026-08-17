package DoublyLL.doublyLL_problems;

// GFG

class ListNode{
    int val;
    ListNode next;
    ListNode prev;
    ListNode(int val) {
        this.val = val;
    }
}

public class ReverseDoublyLL_1 {
    static ListNode reverseDLL(ListNode head) {
        ListNode pre = null;
        ListNode curr = head;
        ListNode fwd = null;
        while (curr != null) {
            fwd = curr.next;
            curr.next = pre;
            curr.prev = fwd;
            pre = curr;
            curr = fwd;
        }
        return pre;
    }
    static void display(ListNode head) {
        ListNode temp = head;
        while (temp!=null) {
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(10);
        ListNode b = new ListNode(20);
        ListNode c = new ListNode(30);
        ListNode d = new ListNode(40);
        ListNode e = new ListNode(50);
        ListNode f = new ListNode(60);
        a.next = b; b.prev = a; b.next = c; c.prev = b;
        c.next = d; d.prev = c; d.next = e; e.prev = d;
        e.next = f; f.prev = e;
        System.out.print("Original DLL ");
        display(a);
        System.out.print("After Reverse ");
        ListNode head = reverseDLL(a);
        display(head);
    }
}
