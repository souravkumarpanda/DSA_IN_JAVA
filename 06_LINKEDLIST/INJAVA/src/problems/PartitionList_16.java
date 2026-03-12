package problems;

public class PartitionList_16 {
    static ListNode partition(ListNode head, int x){
        ListNode d1 = new ListNode(-1);
        ListNode d2 = new ListNode(-1);
        ListNode t = head;
        ListNode t1 = d1;
        ListNode t2 = d2;
        while(t!=null){
            if (t.val < x){
                t1.next = t;
                t1 = t1.next;
            }else {
                t2.next = t;
                t2 = t2.next;
            }
            t = t.next;
        }
        t1.next = d2.next;
        t2.next = null;
        return d1.next;
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
        a = partition(a,3);
        System.out.println("After partition ");
        display(a);
    }
}
