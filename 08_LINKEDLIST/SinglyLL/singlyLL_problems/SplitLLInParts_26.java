package SinglyLL.singlyLL_problems;

// Leetcode - 725

public class SplitLLInParts_26 {
    static ListNode[] splitListToParts(ListNode head, int k) {
        // Step 1: Find length of a linked list
        int n = 0;
        ListNode temp = head;
        while (temp != null) {
            n++;
            temp = temp.next;
        }

        // Step 2: Find the size of each part and extra nodes
        int size = n / k;
        int extra = n % k;
        ListNode[] result = new ListNode[k];

        // Step 3: Split the linked list
        temp = head;

        for (int i = 0; i < k; i++) {
            result[i] = temp;

            // The Current part gets one extra node
            // if i < extra
            int currentSize = size + (i < extra ? 1 : 0);

            // Move to the last node of the current part
            for (int j = 1; j < currentSize; j++) {
                temp = temp.next;
            }

            // Disconnect current part from a remaining list
            if (temp != null) {
                ListNode nextPart = temp.next;
                temp.next = null;
                temp = nextPart;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        ListNode e = new ListNode(5);
        ListNode f = new ListNode(6);
        ListNode g = new ListNode(7);
        ListNode h = new ListNode(8);
        ListNode l = new ListNode(9);
        ListNode j = new ListNode(10);
        a.next = b; b.next = c; c.next = d; d.next = e;
        e.next = f; f.next = g; g.next = h; h.next = l; l.next = j;
        int k = 3;
        ListNode[] result = splitListToParts(a,k);
        System.out.print("Output: [");
        for (int i = 0; i < result.length; i++) {
            System.out.print("[");
            ListNode temp = result[i];
            while (temp != null) {
                System.out.print(temp.val);
                if (temp.next != null) {
                    System.out.print(",");
                }
                temp = temp.next;
            }
            System.out.print("]");
            if (i != result.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println("]");
    }
}
