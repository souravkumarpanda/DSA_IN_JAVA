package problems;

public class InterSectionOfTwoLinkedLists_7 {
    static ListNode getInterSectionNode(ListNode head1, ListNode head2){
//        Find out the length two linked-lists
        int len1 = 0;
        ListNode temp1 = head1;
        while(temp1 != null){
            temp1 = temp1.next;
            len1++;
        }
        int len2 = 0;
        ListNode temp2 = head2;
        while(temp2 != null){
            temp2 = temp2.next;
            len2++;
        }
//        if len1 > len2 increase temp1 else increase temp2
        temp1 = head1;
        temp2 = head2;
        if(len1 > len2){
            for (int i=1;i<=len1-len2;i++){
                temp1 = temp1.next;
            }
        }else{
            for (int i=1;i<=len2-len1;i++){
                temp2 = temp2.next;
            }
        }
//        Run the loop whenever the two linked lists not get a common node
        while(temp1 != temp2){
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return temp1;
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(10);
        ListNode b = new ListNode(20);
        ListNode c = new ListNode(30);
        ListNode d = new ListNode(40);
        ListNode e = new ListNode(50);
        ListNode f = new ListNode(60);
        ListNode g = new ListNode(70);
        ListNode h = new ListNode(80);
        a.next=b; b.next=c; c.next=f;
        d.next=e; e.next=f;
        f.next=g; g.next=h;
        System.out.println(getInterSectionNode(a,d).val);
    }
}
