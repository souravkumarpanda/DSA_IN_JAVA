package CircularLL.circularLL_problems;

// GFG

public class DeletionAndReverseInCircularLL_4 {
    static void reverse(Node head) {
        Node curr = head;
        Node prev = null;
        Node fwd = null;
        while (curr!=null) {
            fwd = curr.next;
            curr.next = prev;
            prev = curr;
            curr = fwd;
        }
    }
    static Node reverseCircular(Node head) {
        Node tail = head;
        while (tail.next!=head) tail = tail.next;
        tail.next = null;
        reverse(head);
        head.next = tail;
        return tail;
    }
    static Node deleteNode(Node head, int key) {
        if (head == null) return null;
        if (head.next == head) {
            if (head.data == key)
                return null;
            return head;
        }
        if (head.data == key) {
            Node tail = head;
            while (tail.next != head) tail = tail.next;
            head = head.next;
            tail.next = head;
            return head;
        }
        Node temp = head;
        while (temp.next != head) {
            if (temp.next.data == key) {
                temp.next = temp.next.next;
                return head;
            }
            temp = temp.next;
        }
        return head;
    }
    static void display(Node head) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        head.next.next.next.next.next = head;
        System.out.println("Original Circular Linked List:");
        display(head);
        int key = 30;
        head = deleteNode(head, key);
        System.out.println("After deleting " + key + ":");
        display(head);
        head = reverseCircular(head);
        System.out.println("After reversing:");
        display(head);
    }
}
