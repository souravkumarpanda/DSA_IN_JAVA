package problems;

public class RemoveDuplicatesFromSortedLL_10 {
    static ListNode removeDuplicates(ListNode head){
        ListNode i = head;
        ListNode j = head;
        while(j != null){
            if(i.val == j.val) j=j.next;
            else{
                i.next = j;
                i=j;
            }
        }
        i.next = j;
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
        ListNode b = new ListNode(1);
        ListNode c = new ListNode(1);
        ListNode d = new ListNode(2);
        ListNode e = new ListNode(2);
        ListNode f = new ListNode(3);
        ListNode g = new ListNode(4);
        ListNode h = new ListNode(4);
        ListNode i = new ListNode(4);
        ListNode j = new ListNode(4);
        a.next=b; b.next=c; c.next=d; d.next=e; e.next=f;
        f.next=g; g.next=h; h.next=i; i.next=j;
        System.out.println("Original Linked List");
        display(a);
        a=removeDuplicates(a);
        System.out.println("After Removal of Duplicates");
        display(a);
    }
}
