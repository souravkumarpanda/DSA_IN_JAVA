package problems;

public class RemoveDuplicatesFromLLII_11 {
    static ListNode deleteDuplicates(ListNode head){
        ListNode dummy = new ListNode(-1);
        ListNode t = dummy;
        ListNode i = head;
        while(i!=null){
            if (i.next==null || i.val!=i.next.val){
                t.next = i;
                t = i;
                i = i.next;
            }else{
                ListNode j = i.next;
                while (j!=null && j.val==i.val){
                    j = j.next;
                }
                i=j;
            }
        }
        t.next = i;
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
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(2);
        ListNode d = new ListNode(3);
        ListNode e = new ListNode(4);
        ListNode f = new ListNode(4);
        ListNode g = new ListNode(4);
        ListNode h = new ListNode(4);
        a.next=b; b.next=c; c.next=d; d.next=e;
        e.next=f; f.next=g; g.next=h;
        System.out.println("Original Linked List");
        display(a);
        a=deleteDuplicates(a);
        System.out.println("After Removal of Duplicates");
        display(a);
    }
}
