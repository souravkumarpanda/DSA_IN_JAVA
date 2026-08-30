package Problems;

// Leetcode - 2487

import java.util.Stack;

class ListNode{
    ListNode next;
    int val;
    ListNode(int val) {
        this.val = val;
    }
}
public class RemoveNodesFromLL_6 {
    static ListNode removeNodes(ListNode head) {
        Stack<ListNode> st = new Stack<>();
        ListNode temp = head;
        while (temp!=null) {
            while (!st.isEmpty() && st.peek().val< temp.val) st.pop();
            st.push(temp);
            temp = temp.next;
        }
        while (!st.isEmpty()) {
            ListNode top = st.pop();
            top.next = temp;
            temp = top;
        }
        return temp;
    }
    static ListNode buildList(int[] vals) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        for (int v : vals) {
            curr.next = new ListNode(v);
            curr = curr.next;
        }
        return dummy.next;
    }
    static void printList(ListNode head) {
        StringBuilder sb = new StringBuilder();
        while (head != null) {
            sb.append(head.val);
            if (head.next != null) sb.append(" -> ");
            head = head.next;
        }
        System.out.println(sb.toString());
    }

    public static void main(String[] args) {
        ListNode head1 = buildList(new int[]{5, 2, 13, 3, 8});
        System.out.print("Original: ");
        printList(head1);
        ListNode result = removeNodes(head1);
        System.out.print("After removal: ");
        printList(result);
    }
}
