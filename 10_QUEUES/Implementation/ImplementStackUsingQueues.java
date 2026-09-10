package Implementation;

// Leetcode - 225
import java.util.*;

class MyStack {
    Queue<Integer> q = new LinkedList<>();
    public MyStack() {

    }
    //    Add efficient approach
//    public void push(int x) {
//        q.add(x);
//    }
//
//    public int pop() {
//        int n = q.size();
//        for(int i=1;i<=n-1;i++) {
//            q.add(q.remove());
//        }
//        return q.remove();
//    }
//
//    public int top() {
//        int n = q.size();
//        for(int i=1;i<=n-1;i++) {
//            q.add(q.remove());
//        }
//        int p = q.peek();
//        q.add(q.remove());
//        return p;
//    }
//
//    public boolean empty() {
//        return(q.isEmpty());
//    }

//    Remove and Peek efficient approach
    public void push(int x) {
        q.add(x);
        int n = q.size();
        for(int i=1;i<=n-1;i++) {
            q.add(q.remove());
        }
    }

    public int pop() {
        return q.remove();
    }

    public int top() {
        return q.peek();
    }

    public boolean empty() {
        return(q.isEmpty());
    }

    public void display() {
        if (q.isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.print("Stack: ");
        for (int x : q) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}

public class ImplementStackUsingQueues {
    public static void main(String[] args) {
        MyStack st = new MyStack();
        st.push(10); st.push(20); st.push(30); st.push(40);
        st.display();
        System.out.println("Top element: " + st.top());
        System.out.println("Popped: " + st.pop());
        System.out.println("Is stack empty? " + st.empty());
        st.display();
    }
}
