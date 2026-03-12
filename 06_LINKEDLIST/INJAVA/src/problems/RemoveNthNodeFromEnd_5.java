package problems;

public class RemoveNthNodeFromEnd_5 {
    static ListNode removeNthFromEnd(ListNode head, int n){
        ListNode temp = new ListNode(0);
        temp.next = head;
        ListNode slow = temp;
        ListNode fast = temp;
        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return temp.next;
    }
    static void display(ListNode head){
        ListNode temp = head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(10);
        ListNode b = new ListNode(20);
        ListNode c = new ListNode(30);
        ListNode d = new ListNode(60);
        ListNode e = new ListNode(40);
        ListNode f = new ListNode(-5);
        ListNode g = new ListNode(4);
        ListNode h = new ListNode(16);
        ListNode i = new ListNode(21);
        a.next = b; b.next = c; c.next = d; d.next = e;
        e.next = f; f.next = g; g.next = h; h.next = i;
        System.out.println("Original Linked List");
        display(a);
        a = removeNthFromEnd(a,4);
        System.out.println("After Deleting");
        display(a);
    }
}
