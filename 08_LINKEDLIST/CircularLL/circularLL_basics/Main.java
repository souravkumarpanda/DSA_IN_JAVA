package CircularLL.circularLL_basics;

class Node{
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Main {
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
        head.next = second; second.next = third; third.next = head;
        System.out.print("Circular LL ");
        display(head);
    }
}
