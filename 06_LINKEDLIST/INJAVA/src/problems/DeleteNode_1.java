package problems;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x){
        val = x;
    }
}

public class DeleteNode_1 {
    static void deleteNode(ListNode target){
        target.val = target.next.val;
        target.next = target.next.next;
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(40);
        ListNode b = new ListNode(50);
        ListNode c = new ListNode(60);
        ListNode d = new ListNode(70);
        ListNode e = new ListNode(80);
        a.next = b; b.next = c;
        c.next = d; d.next = e;
        deleteNode(c);
//        Display the linked list
        ListNode temp = a;
        while(temp!=null){
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
    }
}
