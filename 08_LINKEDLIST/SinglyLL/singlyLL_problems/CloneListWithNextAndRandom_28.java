package SinglyLL.singlyLL_problems;

// Leetcode - 138 or GFG

class Node {
    int data;
    Node next;
    Node random;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.random = null;
    }
}

public class CloneListWithNextAndRandom_28 {
    static Node cloneLinkedList(Node head) {
        if (head == null) return null;
        // Step 1: Insert cloned nodes
        Node curr = head;
        while (curr != null) {
            Node clone = new Node(curr.data);
            clone.next = curr.next;
            curr.next = clone;
            curr = clone.next;
        }
        // Step 2: Set random pointers
        curr = head;
        while (curr != null) {
            if (curr.random != null) {
                curr.next.random = curr.random.next;
            }
            curr = curr.next.next;
        }
        // Step 3: Separate original and cloned lists
        curr = head;
        Node cloneHead = head.next;
        while (curr != null) {
            Node clone = curr.next;
            curr.next = clone.next;
            if (clone.next != null) {
                clone.next = clone.next.next;
            }
            curr = curr.next;
        }
        return cloneHead;
    }

    public static void main(String[] args) {
        // Create nodes
        Node head = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        // Set next pointers
        head.next = node2; node2.next = node3;
        node3.next = node4; node4.next = node5;
        // Set random pointers
        head.random = node3;
        node2.random = head;
        node3.random = node5;
        node4.random = node3;
        node5.random = node2;
        // Clone the list
        Node cloneHead = cloneLinkedList(head);
        // Print cloned list
        Node curr = cloneHead;
        while (curr != null) {
            System.out.print("[" + curr.data + ", ");
            if (curr.random != null) {
                System.out.print(curr.random.data);
            } else {
                System.out.print("null");
            }
            System.out.print("]");
            if (curr.next != null) {
                System.out.print(" -> ");
            }
            curr = curr.next;
        }
        System.out.println();
    }
}
