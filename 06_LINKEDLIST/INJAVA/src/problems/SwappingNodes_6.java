package problems;

public class SwappingNodes_6 {
    static ListNode swapNodes(ListNode head, int k){
//        Kth node from end
        ListNode slow = head;
        ListNode fast = head;
        for(int i=1;i<=k;i++){
            fast = fast.next;
        }
        while(fast!=null){
            slow = slow.next;
            fast = fast.next;
        }
//        Kth node from start
        fast = head;
        for(int i=1;i<=k-1;i++){
            fast = fast.next;
        }
//        Swap the two nodes
        int temp = fast.val;
        fast.val = slow.val;
        slow.val = temp;
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
        ListNode a = new ListNode(10);
        ListNode b = new ListNode(20);
        ListNode c = new ListNode(30);
        ListNode d = new ListNode(40);
        ListNode e = new ListNode(50);
        ListNode f = new ListNode(60);
        ListNode g = new ListNode(70);
        a.next=b; b.next=c; c.next=d;
        d.next=e; e.next=f; f.next=g;
        System.out.println("Original LinkedList");
        display(a);
        System.out.println("After Swapping");
        a = swapNodes(a,3);
        display(a);
    }
}
