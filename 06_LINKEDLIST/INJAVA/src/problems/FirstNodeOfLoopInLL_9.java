package problems;

public class FirstNodeOfLoopInLL_9 {
    static ListNode firstNodeLoop(ListNode head){
        if (head == null || head.next == null) return null;
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                slow = head;
                while(slow != fast){
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(10);
        ListNode b = new ListNode(20);
        ListNode c = new ListNode(30);
        ListNode d = new ListNode(40);
        ListNode e = new ListNode(50);
        ListNode f = new ListNode(60);
        a.next=b; b.next=c; c.next=d;
        d.next=e; e.next=f; f.next = c;
        System.out.println(firstNodeLoop(a).val);
    }
}
