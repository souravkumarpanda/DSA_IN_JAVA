package problems;

public class MergeSortLL_15 {
    static ListNode mergeSort(ListNode head){
        if(head.next == null) return head;
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode head2 = slow.next;
        slow.next = null;
        head = mergeSort(head);
        head2 = mergeSort(head2);
        return merge(head,head2);
    }
    static ListNode merge(ListNode head1, ListNode head2){
        ListNode i = head1;
        ListNode j = head2;
        ListNode dummy = new ListNode(-1);
        ListNode k = dummy;
        while(i!=null && j!=null){
            if(i.val <= j.val){
                k.next = i;
                i=i.next;
            }else{
                k.next = j;
                j = j.next;
            }
            k = k.next;
        }
        if(i==null) k.next=j;
        else k.next = i;
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
        ListNode a = new ListNode(50);
        ListNode b = new ListNode(20);
        ListNode c = new ListNode(40);
        ListNode d = new ListNode(80);
        ListNode e = new ListNode(10);
        ListNode f = new ListNode(70);
        ListNode g = new ListNode(30);
        ListNode h = new ListNode(60);
        a.next = b; c.next = d; d.next = e;
        b.next = c; e.next = f; f.next = g; g.next = h;
        System.out.println("Original Linked List");
        display(a);
        a = mergeSort(a);
        System.out.println("After merge");
        display(a);
    }
}
