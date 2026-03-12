package problems;

public class MiddleNode_2 {
    static int getMiddle(ListNode head){
//        This is not an ONE PASS solution, but it's a better approach with time complexity of O(n).
//        int length = 0;
//        ListNode temp = head;
//        while(temp != null){
//            temp = temp.next;
//            length++;
//        }
//        temp = head;
//        for(int i=1;i<=length/2;i++){
//            temp = temp.next;
//        }
//        return temp.val;
//        Slow-Fast Approach and better than the previous one
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.val;
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        ListNode e = new ListNode(5);
        ListNode f = new ListNode(6);
        a.next = b; b.next = c;
        c.next = d; d.next = e; e.next = f;
        System.out.println(getMiddle(a));
    }
}
