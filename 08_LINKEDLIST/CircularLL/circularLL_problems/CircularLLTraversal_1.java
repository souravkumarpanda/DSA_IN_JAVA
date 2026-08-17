package CircularLL.circularLL_problems;

// GFG

class Node{
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class CircularLLTraversal_1 {
    static void printList(Node head) {
        Node temp = head;
        while (temp.next!=head) {
            System.out.print(temp.data+ " ");
            temp = temp.next;
        }
        System.out.print(temp.data);
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        Node a = new Node(20);
        Node b = new Node(30);
        Node c = new Node(40);
        Node d = new Node(50);
        head.next = a; a.next = b; b.next = c;
        c.next = d; d.next = head;
        printList(head);
    }
}
