package problems;

public class KthNodeFromEnd_4 {
    static int getKthFromLast(ListNode head, int k){
        ListNode slow = head;
        ListNode fast = head;
        for(int i=1;i<=k;i++){
            if(fast==null) return -1;
            fast = fast.next;
        }
        while(fast!=null){
            slow = slow.next;
            fast = fast.next;
        }
        return slow.val;
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
        System.out.println(getKthFromLast(a,4));
    }
}
