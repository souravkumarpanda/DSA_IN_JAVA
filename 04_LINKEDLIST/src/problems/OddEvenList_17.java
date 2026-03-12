package problems;

public class OddEvenList_17 {
    static ListNode oddEvenList(ListNode head) {
        if(head==null) return null;
        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = even;
        while(even!=null&&even.next!=null){
            odd.next = even.next;
            odd = odd.next;
            even.next=odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;
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
        a = oddEvenList(a);
        System.out.println("After odd and even ");
        display(a);
    }
}
