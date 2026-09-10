package Basics;

import java.util.LinkedList;
import java.util.Queue;

public class BasicOPInQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10); q.add(20); q.add(30); q.add(40);
        System.out.println(q+" "+q.size());
        System.out.println(q.peek());
        q.remove();
        System.out.println(q+" "+q.size());
    }
}
