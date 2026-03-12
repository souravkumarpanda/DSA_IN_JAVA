package problems;

import java.util.ArrayList;

public class PalindromeLL_20 {
    static ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr =head;
        ListNode fwd = null;
        while(curr!=null){
            fwd = curr.next;
            curr.next = prev;
            prev = curr;
            curr = fwd;
        }
        return prev;
    }
    static boolean isPalindrome(ListNode head){
//        Brute Force Approach - ArrayList way
//        ListNode temp = head;
//        ArrayList<Integer> arr = new ArrayList<>();
//        while (temp!=null){
//            arr.add(temp.val);
//            temp = temp.next;
//        }
//        int i = 0, j = arr.size()-1;
//        while (i<=j){
//            int a = arr.get(i), b = arr.get(j);
//            if(a!=b) return false;
//            i++;
//            j--;
//        }
//        return true;

//        Better Approach
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode head2 = slow.next;
        slow.next = null;
        head2 = reverse(head2);

        ListNode i = head;
        ListNode j = head2;
        while(j!=null){
            if(i.val != j.val) return false;
            i = i.next;
            j = j.next;
        }
        return true;
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(3);
        ListNode c = new ListNode(1);
        ListNode d = new ListNode(1);
        ListNode e = new ListNode(3);
        ListNode f = new ListNode(1);
        a.next = b; b.next = c; c.next = d;
        d.next = e; e.next = f;
        System.out.println(isPalindrome(a));
    }
}
