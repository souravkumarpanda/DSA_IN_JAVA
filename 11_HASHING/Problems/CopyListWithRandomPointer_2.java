package Problems;

// Leetcode - 138

import java.util.HashMap;

class Node {
    int val;
    Node next;
    Node random;
    Node(int val) {
        this.val = val;
    }
}

public class CopyListWithRandomPointer_2 {
    static Node deepCopy(Node head1) {
        Node temp1 = head1;
        Node head2 = new Node(-1);
        Node temp2 = head2;
        while (temp1!=null) {
            Node t = new Node(temp1.val);
            temp2.next = t;
            temp2 = temp2.next;
            temp1 = temp1.next;
        }
        return head2.next;
    }

    static Node copyRandomList(Node a) {
        Node b = deepCopy(a);
        HashMap<Node,Node> map = new HashMap<>();
        Node tempA = a;
        Node tempB = b;
        map.put(null,null);
        while (tempA!=null) {
            map.put(tempA,tempB);
            tempA = tempA.next;
            tempB = tempB.next;
        }
        tempA = a;
        while (tempA!=null) {
            tempB = map.get(tempA);
            tempB.random = map.get(tempA.random);
            tempA = tempA.next;
        }
        return b;
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(4);
        Node d = new Node(7);
        Node e = new Node(0);
        a.next = b; b.next = c; c.next = d; d.next = e;
        a.random = c; b.random = e; c.random = a; d.random = null; e.random = c;
        Node clone = copyRandomList(a);
        Node curr = clone;
        while (curr != null) {
            System.out.print("[" + curr.val + ", ");
            if (curr.random != null) {
                System.out.print(curr.random.val);
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
