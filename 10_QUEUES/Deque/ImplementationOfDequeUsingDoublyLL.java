package Deque;

class Node{
    int data;
    Node prev, next;
    Node(int data) {
        this.data = data;
    }
}
class MyDeque {
    Node front, rear;
    int size;

    MyDeque() {
        front = rear = null;
        size = 0;
    }

    boolean isEmpty() {
        return front == null;
    }

    int size() {
        return size;
    }

    void addFirst(int x) {
        Node newNode = new Node(x);

        if (isEmpty()) {
            front = rear = newNode;
        } else {
            newNode.next = front;
            front.prev = newNode;
            front = newNode;
        }
        size++;
    }

    void addLast(int x) {
        Node newNode = new Node(x);

        if (isEmpty()) {
            front = rear = newNode;
        } else {
            newNode.prev = rear;
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    int removeFirst() {
        if (isEmpty()) throw new RuntimeException("Deque is empty");

        int val = front.data;
        front = front.next;

        if (front == null) {
            rear = null; // deque became empty
        } else {
            front.prev = null;
        }
        size--;
        return val;
    }

    int removeLast() {
        if (isEmpty()) throw new RuntimeException("Deque is empty");

        int val = rear.data;
        rear = rear.prev;

        if (rear == null) {
            front = null; // deque became empty
        } else {
            rear.next = null;
        }
        size--;
        return val;
    }

    int peekFirst() {
        if (isEmpty()) throw new RuntimeException("Deque is empty");
        return front.data;
    }

    int peekLast() {
        if (isEmpty()) throw new RuntimeException("Deque is empty");
        return rear.data;
    }

    void print() {
        if (isEmpty()) {
            System.out.println("(empty)");
            return;
        }
        StringBuilder sb = new StringBuilder();
        Node curr = front;
        while (curr!=null) {
            sb.append(curr.data).append(" ");
            curr = curr.next;
        }
        System.out.println(sb.toString().trim());
    }
}

public class ImplementationOfDequeUsingDoublyLL {
    public static void main(String[] args) {
        MyDeque dq = new MyDeque();
        dq.addFirst(10); dq.addFirst(20); dq.addFirst(30);
        dq.addLast(40); dq.addLast(50);
        dq.print();
        System.out.println("Size: "+dq.size());
        System.out.println(dq.peekFirst());
        System.out.println(dq.peekLast());
        System.out.println(dq.removeFirst());
        dq.print();
        System.out.println(dq.removeLast());
        dq.print();
    }
}
