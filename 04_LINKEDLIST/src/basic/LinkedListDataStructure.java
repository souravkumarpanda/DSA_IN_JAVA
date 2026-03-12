package basic;

class Linkedlist{ // User defined data structure
    Node head;
    Node tail;
    int size;
    int search(int val){      // Search the node if it exists or not
        if(head == null) return -1;
        Node temp = head;
        int idx = 0;
        while(temp != null){
            if(temp.val == val) return idx;
            temp = temp.next;
            idx++;
        }
        return -1;
    }
    void addAtHead(int val) {    // Insert a new node at head
        Node temp = new Node(val);
        if(head == null) head=tail=temp;
        else {
            temp.next = head;
            head = temp;
        }
        size++;
    }
    void addAtTail(int val){     // Insert a new node at tail
        Node temp = new Node(val);
        if (tail == null) head = tail = temp;
        else{
            tail.next = temp;
            tail = temp;
        }
        size++;
    }
    void deleteAtHead(){   // Delete the head node
        if(head == null){
            System.out.println("List Is Empty!");
            return;
        }
        head = head.next;
        if (head == null) tail = null;
        size--;
    }
    void display() {    // Display the linked list
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    int get(int idx) {   // Get the value present at a particular index
        Node temp = head;
        for(int i=1;i<=idx;i++){
            temp = temp.next;
        }
        return temp.val;
    }
    void insert(int val, int idx) {    // Insert a new value at any index of the linked list
        if(idx>size || idx<0) System.out.println("Invalid Index!");
        else if(idx==0) addAtHead(val);
        else if(idx==size) addAtTail(val);
        else {
            Node temp = head;
            for(int i=1;i<=idx-1;i++){
                temp = temp.next;
            }
            Node t = new Node(val);
            t.next = temp.next;
            temp.next = t;
            size++;
        }
    }
    void delete(int idx){
        if(idx<0 || idx>=size) {
            System.out.println("Invalid Index!");
            return;
        }
        if(idx==0){
            deleteAtHead();
            return;
        }
        Node temp = head;
        for(int i=1;i<=idx;i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        if(idx==size-1) tail=temp;
        size--;
    }
}
public class LinkedListDataStructure {
    public static void main(String[] args) {
        Linkedlist ll = new Linkedlist();
        ll.deleteAtHead();
        ll.addAtTail(10);
        ll.addAtTail(20);
        ll.addAtTail(30);
        ll.addAtTail(40);
        ll.display();
        ll.addAtHead(60); ll.display();
        ll.deleteAtHead(); ll.display();
        System.out.println(ll.size);
        System.out.println(ll.search(30));
        System.out.println(ll.get(4));
        ll.insert(80,3); ll.display();
        ll.delete(5); ll.display();
    }
}
