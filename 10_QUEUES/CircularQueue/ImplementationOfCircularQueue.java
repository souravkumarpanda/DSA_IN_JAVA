package CircularQueue;

class MyCircularQueue {
    int[] arr;
    int front, rear, size, capacity;

    MyCircularQueue(int capacity) {
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

    void enqueue(int x) {
        if (isFull()) throw new RuntimeException("Queue is full");

        rear = (rear + 1) % capacity;
        arr[rear] = x;
        size++;
    }

    int dequeue() {
        if (isEmpty()) throw new RuntimeException("Queue is empty");

        int val = arr[front];
        front = (front + 1) % capacity;
        size--;
        return val;
    }

    int peek() {
        if (isEmpty()) throw new RuntimeException("Queue is empty");
        return arr[front];
    }

    void print() {
        if (isEmpty()) {
            System.out.println("(empty)");
            return;
        }
        StringBuilder sb = new StringBuilder();
        int i = front;
        for (int count = 0; count < size; count++) {
            sb.append(arr[i]).append(" ");
            i = (i + 1) % capacity;
        }
        System.out.println(sb.toString().trim());
    }
}

public class ImplementationOfCircularQueue {
    public static void main(String[] args) {
        MyCircularQueue cq = new MyCircularQueue(5);
        cq.enqueue(10); cq.enqueue(20); cq.enqueue(30);
        cq.print();
        System.out.println("dequeue(): " + cq.dequeue());
        System.out.println("dequeue(): " + cq.dequeue());
        cq.print();
        cq.enqueue(40); cq.enqueue(50); cq.enqueue(60);
        System.out.println("After enqueue(40,50,60):");
        cq.print();
        System.out.println("isFull: " + cq.isFull());
        System.out.println("peek(): " + cq.peek());
    }
}
