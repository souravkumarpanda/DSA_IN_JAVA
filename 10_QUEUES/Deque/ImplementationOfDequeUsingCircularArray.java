package Deque;

class MyArrayDeque {
    int[] arr;
    int front, rear, size, capacity;

    MyArrayDeque(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    boolean isEmpty() {
        return size == 0;
    }

    boolean isFull() {
        return size == capacity;
    }

    void addLast(int x) {
        if (isFull()) throw new RuntimeException("Deque is full");
        rear = (rear + 1) % capacity;   // wrap around
        arr[rear] = x;
        size++;
    }

    void addFirst(int x) {
        if (isFull()) throw new RuntimeException("Deque is full");
        front = (front - 1 + capacity) % capacity;  // wrap backward
        arr[front] = x;
        size++;
    }

    int removeFirst() {
        if (isEmpty()) throw new RuntimeException("Deque is empty");
        int val = arr[front];
        front = (front + 1) % capacity;
        size--;
        return val;
    }

    int removeLast() {
        if (isEmpty()) throw new RuntimeException("Deque is empty");
        int val = arr[rear];
        rear = (rear - 1 + capacity) % capacity;
        size--;
        return val;
    }

    int peekFirst() {
        if (isEmpty()) throw new RuntimeException("Deque is empty");
        return arr[front];
    }

    int peekLast() {
        if (isEmpty()) throw new RuntimeException("Deque is empty");
        return arr[rear];
    }

    void print() {
        if (isEmpty()) {
            System.out.println("(empty)");
            return;
        }
        StringBuilder sb = new StringBuilder();
        int i = front;
        for (int count=0;count<size;count++) {
            sb.append(arr[i]).append(" ");
            i = (i+1) % capacity;
        }
        System.out.println(sb.toString().trim());
    }
}

public class ImplementationOfDequeUsingCircularArray {
    public static void main(String[] args) {
        MyArrayDeque dq = new MyArrayDeque(5);
        dq.addFirst(10); dq.addFirst(20); dq.addFirst(30);
        dq.addLast(40); dq.addLast(50);
        dq.print();
        System.out.println(dq.peekFirst());
        System.out.println(dq.peekLast());
        System.out.println(dq.removeFirst());
        dq.print();
        System.out.println(dq.removeLast());
        dq.print();
    }
}
