package problems;

public class RotateLL_12 {
    static int length(ListNode head){
        int len = 0;
        ListNode temp = head;
        while (temp!=null){
            temp = temp.next;
            len++;
        }
        return len;
    }
    static ListNode rotateRight(ListNode head, int k){
        if(head==null || head.next==null) return head;
        int n = length(head);
        k %= n;
        if (k==0) return head;
        ListNode slow = head;
        ListNode fast = head;
        for (int i=1;i<=k+1;i++){
            fast = fast.next;
        }
        while(fast!=null){
            slow = slow.next;
            fast = fast.next;
        }
        ListNode a = slow.next;
        slow.next = null;
        ListNode tail = a;
        while(tail.next != null){
            tail = tail.next;
        }
        tail.next = head;
        return a;
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
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        ListNode e = new ListNode(5);
        ListNode f = new ListNode(6);
        ListNode g = new ListNode(7);
        a.next=b; b.next=c; c.next=d;
        d.next=e; e.next=f; f.next=g;
        System.out.println("Original Linked List");
        display(a);
        a=rotateRight(a,3);
        System.out.println("After Rotation");
        display(a);
    }
}
