package Implementation;

// Leetcode - 232
import java.util.*;

class MyQueue1 {
    Stack<Integer> st = new Stack<>();
    Stack<Integer> helper = new Stack<>();

    public MyQueue1() {

    }
//   push efficient approach i.e. TC for push O(1) and for pop, peek O(n).
//    public void push(int x) {
//        st.push(x);
//    }
//
//    public int pop() {
//        while(st.size()>1) helper.push(st.pop());
//        int front = st.pop();
//        while(!helper.isEmpty()) st.push(helper.pop());
//        return front;
//    }
//
//    public int peek() {
//        while(st.size()>1) helper.push(st.pop());
//        int front = st.peek();
//        while(!helper.isEmpty()) st.push(helper.pop());
//        return front;
//    }
//
//    public boolean empty() {
//        return(st.isEmpty());
//    }

//    pop and peek efficient approach i.e. TC for push O(n) and for pop, peek O(1).
    public void push(int x) {
        while (!st.isEmpty()) helper.push(st.pop());
        st.push(x);
        while (!helper.isEmpty()) st.push(helper.pop());
    }

    public int pop() {
        return st.pop();
    }

    public int peek() {
        return st.peek();
    }

    public boolean empty() {
        return(st.isEmpty());
    }

    public void display() {
        if (st.isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        Stack<Integer> temp = new Stack<>();
        while (!st.isEmpty()) {
            temp.push(st.pop());
        }
        System.out.print("Queue: ");
        while (!temp.isEmpty()) {
            int x = temp.pop();
            System.out.print(x + " ");
            st.push(x);
        }
        System.out.println();
    }
}

public class ImplementQueueUsingStacks {
    public static void main(String[] args) {
        MyQueue1 q = new MyQueue1();
        q.push(10); q.push(20); q.push(30); q.push(40);
        q.display();
        System.out.println("Front element: " + q.peek());
        System.out.println("Popped: " + q.pop());
        System.out.println("Is queue empty? " + q.empty());
        q.display();
    }
}
