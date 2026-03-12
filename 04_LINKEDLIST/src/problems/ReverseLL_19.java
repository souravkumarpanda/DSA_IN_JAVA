package problems;

//import java.util.ArrayList;

public class ReverseLL_19 {
    static ListNode reverseList(ListNode head){
//        Brute Force Approach - ArrayList way
//        ListNode temp = head;
//        ArrayList<ListNode> arr = new ArrayList<>();
//        while (temp!=null){
//            arr.add(temp);
//            temp = temp.next;
//        }
//        int n = arr.size();
//        for (int i=n-1;i>=1;i--){
//            arr.get(i).next = arr.get(i-1);
//        }
//        arr.get(0).next = null;
//        return arr.get(n-1);

//        Brute Force Approach - Recursion way
//        if (head == null || head.next == null) return head;
//        ListNode a = head.next;
//        head.next = null;
//        ListNode b = reverseList(a);
//        a.next = head;
//        return b;

//        Better Approach - Three pointer way
        ListNode prev = null;
        ListNode curr =head;
        ListNode fwd = null;
        while(curr!=null){
            fwd = curr.next;
            curr.next = prev;
            prev = curr;
            curr = fwd;
        }
        return prev;
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
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        ListNode e = new ListNode(5);
        a.next = b; b.next = c; c.next = d; d.next = e;
        System.out.println("Original Linked List");
        display(a);
        a = reverseList(a);
        System.out.println("After reverse ");
        display(a);
    }
}
