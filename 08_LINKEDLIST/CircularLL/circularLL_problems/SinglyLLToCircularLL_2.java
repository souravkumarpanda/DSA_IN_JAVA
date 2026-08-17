package CircularLL.circularLL_problems;

// GFG

public class SinglyLLToCircularLL_2 {
    static Node singlyToCircular(Node head) {
        if (head == null) {
            return null;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = head;
        return head;
    }
    static void display(Node head) {
        Node temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }
    public static void main(String[] args) {
        Node head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);
        Node fifth = new Node(50);
        Node sixth = new Node(60);
        head.next = second; second.next = third; third.next = fourth;
        fourth.next = fifth; fifth.next = sixth;
        Node head1 = singlyToCircular(head);
        display(head1);
    }
}
