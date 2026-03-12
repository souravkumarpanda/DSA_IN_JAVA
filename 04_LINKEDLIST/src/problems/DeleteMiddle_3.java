package problems;

public class DeleteMiddle_3 {
    ListNode deleteMiddle(ListNode head){
        if(head==null || head.next==null){
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;

        while (fast != null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = slow.next;
        return head;
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
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        ListNode e = new ListNode(5);
        a.next = b; b.next = c;
        c.next = d; d.next = e;
        System.out.println("Original Linked List");
        display(a);
        DeleteMiddle_3 obj = new DeleteMiddle_3();
        a = obj.deleteMiddle(a);
        System.out.println("After Deleting");
        display(a);
    }
}
