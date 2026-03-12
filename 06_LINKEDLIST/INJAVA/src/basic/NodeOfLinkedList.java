package basic;

class Node{ // User defined datatype
    int val; // By default, the value of val is 0
    Node next; // By default, the value of next is null
    Node(int val){
        this.val = val;
    }
}

public class NodeOfLinkedList {
    public static void main(String[] args) {
//    Creating node and given its value
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
//      Print the value
        System.out.println(a.val); //10
        System.out.println(b.val); //20
        System.out.println(c.val); //30
        System.out.println(d.val); //40
        System.out.println(e.val); //50
//      Before connect all the nodes
        System.out.println(a.next); //null
        System.out.println(b.next); //null
        System.out.println(c.next); //null
        System.out.println(d.next); //null
        System.out.println(e.next); //null
//    Connect all the nodes
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
//     Print the reference of all the nodes
        System.out.println(a); // basic.Node@6acbcfc0
        System.out.println(b); // basic.Node@5f184fc6
        System.out.println(a.next); // basic.Node@5f184fc6
        System.out.println(c); // basic.Node@3feba861
        System.out.println(b.next); // basic.Node@3feba861
        System.out.println(d); // basic.Node@5b480cf9
        System.out.println(c.next); // basic.Node@5b480cf9
        System.out.println(e); // basic.Node@6f496d9f
        System.out.println(d.next); // basic.Node@6f496d9f
        System.out.println(e.next); // null
//      Tricky concept
        System.out.println(c);
        System.out.println(b.next);
        System.out.println(a.next.next); // These three are the same
        System.out.println(a.next.next.next.val); // 40 which is equal to d.val

    }
}
