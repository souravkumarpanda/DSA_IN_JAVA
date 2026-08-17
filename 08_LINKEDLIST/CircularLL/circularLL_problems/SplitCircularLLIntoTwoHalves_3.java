package CircularLL.circularLL_problems;

// GFG

class Pair<N, N1> {
    N first;
    N1 second;
    Pair(N first, N1 second) {
        this.first = first;
        this.second = second;
    }
}

public class SplitCircularLLIntoTwoHalves_3 {
    static Pair<Node, Node> splitList(Node head) {
        Node temp = head;
        while (temp.next != head) temp = temp.next;
        temp.next = null;
        Node slow = head;
        Node fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node b = slow.next;
        slow.next = head;
        Node curr = b;
        while (curr.next != null) curr = curr.next;
        curr.next = b;
        Pair<Node, Node> ans = new Pair<>(head, b);
        return ans;
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
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        head.next.next.next.next.next = head;
        Pair<Node, Node> ans = splitList(head);
        System.out.print("First half: ");
        display(ans.first);
        System.out.print("Second half: ");
        display(ans.second);
    }
}
