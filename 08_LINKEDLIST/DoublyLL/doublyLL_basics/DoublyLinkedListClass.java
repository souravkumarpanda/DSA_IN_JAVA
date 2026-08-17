package DoublyLL.doublyLL_basics;

class ListNode{
    int val;
    ListNode next;
    ListNode prev;
    ListNode(int val) {
        this.val = val;
    }
}

class DLL {
    ListNode head;
    ListNode tail;
    int size;

    void insertAtHead(int val) {
        ListNode temp = new ListNode(val);
        if (head==null) head = tail = temp;
        else {
            temp.next = head;
            head.prev = temp;
            head = temp;
        }
        size++;
    }

    void insertAtTail(int val) {
        ListNode temp = new ListNode(val);
        if (tail==null) head = tail = temp;
        else {
            tail.next = temp;
            temp.prev = tail;
            tail = temp;
        }
        size++;
    }

    void display() {
        ListNode temp = head;
        while (temp!=null) {
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    void displayReverse() {
        ListNode temp = tail;
        while (temp!=null) {
            System.out.print(temp.val+" ");
            temp = temp.prev;
        }
        System.out.println();
    }

    void deleteAtHead() {
        if (size==0) {
            System.out.println("List is empty!");
            return;
        }
        if (size==1) head = tail = null;
        else {
            head = head.next;
            head.prev = null;
        }
        size--;
    }

    void deleteAtTail() {
        if (size==0) {
            System.out.println("List is empty!");
            return;
        }
        if (size==1) head = tail = null;
        else {
            tail = tail.prev;
            tail.next = null;
        }
        size--;
    }

    void insert(int idx, int val) {
        if (idx<0 || idx>size) {
            System.out.println("Invalid index!");
        }
        if (idx==0) {
            insertAtHead(val);
            return;
        }
        if (idx==size) {
            insertAtTail(val);
            return;
        }
        ListNode a = new ListNode(val);
        ListNode temp = head;
        for (int i=1;i<=idx-1;i++) {
            temp = temp.next;
        }
        a.prev = temp;
        a.next = temp.next;
        temp.next = a;
        a.next.prev = a;
        size++;
    }

    void delete(int idx) {
        if (idx<0 || idx>=size) {
            System.out.println("Invalid index!");
            return;
        }
        if (idx==0) {
            deleteAtHead();
            return;
        }
        if (idx==size-1) {
            deleteAtTail();
            return;
        }
        ListNode temp = head;
        for (int i=1;i<=idx;i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        temp.next.next.prev = temp;
        size--;
    }
}

public class DoublyLinkedListClass {
    public static void main(String[] args) {
        DLL list = new DLL();
        list.insertAtHead(10);
        list.insertAtHead(1);
        list.insertAtTail(20);
        list.insertAtTail(30);
        list.insertAtTail(40);
        list.insertAtTail(50);
        list.insertAtTail(60);
        list.insertAtTail(3);
        list.display();
        list.displayReverse();
        list.deleteAtHead();
        list.deleteAtTail();
        list.display();
        list.insert(6,80);
        list.display();
        list.delete(6);
        list.display();
    }
}
