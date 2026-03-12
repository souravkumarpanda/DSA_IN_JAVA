package problems;

public class MergeTwoSortedLL_14 {
    static ListNode sortedMerge(ListNode head1, ListNode head2){
        ListNode dummy = new ListNode(-1);
        ListNode i = head1;
        ListNode j = head2;
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
        ListNode d = new ListNode(40);
        ListNode e = new ListNode(50);
        ListNode f = new ListNode(60);
        ListNode g = new ListNode(70);
        ListNode h = new ListNode(80);
        ListNode i = new ListNode(90);
        a.next = c; c.next = d; d.next = f;
        b.next = e; e.next = g; g.next = h; h.next = i;
        System.out.println("Original Linked List1");
        display(a);
        System.out.println("Original Linked List2");
        display(b);
        a = sortedMerge(a,b);
        System.out.println("After sorting and merging of two linked list");
        display(a);
    }
}
