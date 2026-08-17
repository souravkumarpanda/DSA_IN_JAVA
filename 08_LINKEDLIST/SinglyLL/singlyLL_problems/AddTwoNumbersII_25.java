package SinglyLL.singlyLL_problems;

// Leetcode - 445

public class AddTwoNumbersII_25 {
    static ListNode reverse(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        ListNode fwd = null;
        while (curr!=null) {
            fwd = curr.next;
            curr.next = prev;
            prev = curr;
            curr = fwd;
        }
        return prev;
    }
    static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // Step 1: Reverse both lists
        l1 = reverse(l1);
        l2 = reverse(l2);
        ListNode p1 = l1;
        ListNode p2 = l2;
        int carry = 0;
        ListNode result = null;
        // Step 2: Add the two reversed lists
        while (p1 != null || p2 != null || carry != 0) {
            int sum = carry;
            if (p1 != null) {
                sum += p1.val;
                p1 = p1.next;
            }
            if (p2 != null) {
                sum += p2.val;
                p2 = p2.next;
            }
            int digit = sum % 10;
            carry = sum / 10;
            // Add node at the front
            ListNode node = new ListNode(digit);
            node.next = result;
            result = node;
        }
        // Step 3: Restore the input lists
        reverse(l1);
        reverse(l2);
        // The Result is already in forward order
        return result;
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
        ListNode a = new ListNode(7);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(4);
        ListNode d = new ListNode(3);
        ListNode e = new ListNode(5);
        ListNode f = new ListNode(6);
        ListNode g = new ListNode(4);
        a.next = b; b.next = c; c.next = d;
        e.next = f; f.next = g;
        System.out.println("Linked List1 ");
        display(a);
        System.out.println("Linked List2 ");
        display(e);
        a = addTwoNumbers(a,e);
        System.out.println("After addition ");
        display(a);
    }
}
