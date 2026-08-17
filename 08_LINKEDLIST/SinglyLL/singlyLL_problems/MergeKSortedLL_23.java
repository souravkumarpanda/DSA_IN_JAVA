package SinglyLL.singlyLL_problems;

// Leetcode - 23 or GFG

import java.util.ArrayList;
//import java.util.List;

public class MergeKSortedLL_23 {
//    static ListNode mergeKLists(List<Node> arr) {
//        while (arr.size()>1) {
//            ListNode a = (ListNode) arr.get(arr.size()-1);
//            arr.remove(arr.size()-1);
//            ListNode b = (ListNode) arr.get(arr.size()-1);
//            arr.remove(arr.size()-1);
//            ListNode c = merge(a,b);
//            arr.add((Node) c);
//        }
//        return (ListNode) arr.get(0);
//    }
    static ListNode mergeKLists (ListNode[] lists) {
        if (lists.length==0) return null;
        ArrayList<ListNode> arr = new ArrayList<>();
        for (ListNode n:lists) arr.add(n);
        while (arr.size()>1) {
            ListNode a = arr.get(arr.size()-1);
            arr.remove(arr.size()-1);
            ListNode b = arr.get(arr.size()-1);
            arr.remove(arr.size()-1);
            ListNode c = merge(a,b);
            arr.add(c);
        }
        return arr.get(0);
    }
    static ListNode merge(ListNode head1, ListNode head2){
        ListNode dummy = new ListNode(-1);
        ListNode i = head1;
        ListNode j = head2;
        ListNode k = dummy;
        while(i!=null && j!=null){
            if(i.val <= j.val){
                k.next = i;
                i=i.next;
            }else{
                k.next = j;
                j = j.next;
            }
            k = k.next;
        }
        if(i==null) k.next=j;
        else k.next = i;
        return dummy.next;
    }
    static void print(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode a1 = new ListNode(1);
        a1.next = new ListNode(4);
        a1.next.next = new ListNode(5);
        ListNode a2 = new ListNode(1);
        a2.next = new ListNode(3);
        a2.next.next = new ListNode(4);
        ListNode a3 = new ListNode(2);
        a3.next = new ListNode(6);
        ListNode[] lists = {a1, a2, a3};
        ListNode ans = mergeKLists(lists);
        print(ans);
    }
}
