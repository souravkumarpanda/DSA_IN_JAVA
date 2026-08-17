package DoublyLL.doublyLL_problems;

// GFG

public class RotateDoublyLL_2 {
    static ListNode rotateDLL(ListNode head, int k) {
        if (head==null || head.next==null || k==0) return head;
        ListNode curr = head;
        for (int i=1;i<k;i++) {
            curr = curr.next;
        }
        ListNode newHead = curr.next;
        if (newHead==null) return head;
        ListNode tail = newHead;
        while (tail.next != null) tail = tail.next;
        tail.next = head;
        head.prev = tail;
        curr.next = null;
        newHead.prev = null;
        return newHead;
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
        System.out.print("After Rotate ");
        ListNode head = rotateDLL(a,3);
        display(head);
    }
}
