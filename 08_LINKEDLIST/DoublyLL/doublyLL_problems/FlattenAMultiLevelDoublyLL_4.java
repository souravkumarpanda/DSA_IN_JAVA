package DoublyLL.doublyLL_problems;

// Leetcode - 430

class Node {
    int val;
    Node prev;
    Node next;
    Node child;
    Node(int val) {
        this.val = val;
        this.prev = null;
        this.next = null;
        this.child = null;
    }
}

public class FlattenAMultiLevelDoublyLL_4 {
    static Node flatten(Node head) {
        if (head == null) return head;
        Node curr = head;
        while (curr != null) {
            // No child → move forward
            if (curr.child == null) curr = curr.next;
            else {
                // Save the original next node
                Node fwd = curr.next;
                // Flatten the child list
                Node c = flatten(curr.child);
                // Remove a child pointer
                curr.child = null;
                // Connect curr with a child list
                curr.next = c;
                c.prev = curr;
                // Find the last node of a child list
                Node temp = c;
                while (temp.next != null) temp = temp.next;
                // Connect a child list with original next
                temp.next = fwd;
                if (fwd != null) fwd.prev = temp;
                // Continue from original next
                curr = fwd;
            }
        }
        return head;
    }
    static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val);
            if (temp.next != null) System.out.print(" <-> ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node n6 = new Node(6);
        n1.next = n2; n2.prev = n1; n2.next = n3; n3.prev = n2;
        n3.next = n4; n4.prev = n3; n4.next = n5; n5.prev = n4;
        n5.next = n6; n6.prev = n5;
        Node n7 = new Node(7);
        Node n8 = new Node(8);
        Node n9 = new Node(9);
        Node n10 = new Node(10);
        n7.next = n8; n8.prev = n7; n8.next = n9;
        n9.prev = n8; n9.next = n10; n10.prev = n9;
        Node n11 = new Node(11);
        Node n12 = new Node(12);
        n11.next = n12; n12.prev = n11; n3.child = n7; n8.child = n11;
        Node head = flatten(n1);
        System.out.println("Flattened List:");
        display(head);
    }
}
