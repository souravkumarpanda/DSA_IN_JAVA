package DoublyLL.doublyLL_problems;

// GFG

public class RemoveDuplicatesFromASortedDoublyLL_3 {
    static ListNode removeDuplicates(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode curr = head;
        while (curr != null && curr.next != null) {
            if (curr.val == curr.next.val) {
                ListNode duplicate = curr.next;
                curr.next = duplicate.next;
                if (duplicate.next != null) duplicate.next.prev = curr;
            } else curr = curr.next;
        }
        return head;
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
        ListNode b = new ListNode(30);
        ListNode c = new ListNode(30);
        ListNode d = new ListNode(40);
        ListNode e = new ListNode(50);
        ListNode f = new ListNode(50);
        a.next = b; b.prev = a; b.next = c; c.prev = b;
        c.next = d; d.prev = c; d.next = e; e.prev = d;
        e.next = f; f.prev = e;
        System.out.print("Original DLL ");
        display(a);
        System.out.print("After Removal of Duplicates ");
        ListNode head = removeDuplicates(a);
        display(head);
    }
}
