package DataStructure.LinekdList.Singly;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class SLL {
    Node head;

    SLL() {
        head = null;
    }

    void insertAtHead(int val) {
        Node n = new Node(val);  // creating a new Node
        n.next = head; // connect new node to head node
        head = n; // point head towards the new node
    }

    void insertAtTail(int val) {
        Node n = new Node(val);
        if (head == null) {
            head = n;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = n;
    }

    void deleteAtHead() {
        if (head == null) {
            System.out.println("There are no elements");
        }
        Node toDelete = head;
        head = head.next;
        toDelete = null;
    }

    void deleteByVal(int val) {
        if(head==null){
            return ;
        }
        if(head.data==val){
            deleteAtHead();
            return ;
        }
        Node temp = head;
        while (temp.next.data != val){
            temp = temp.next;
        }
        if(temp.next == null){
            System.out.println("Value not found");
            return ;
        }
        Node toDelete = temp.next;
        temp.next = temp.next.next;
        toDelete = null;
    }




    void printSLL(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}

class Driver{
    public static void main(String[] args) {
        SLL sll = new SLL();
        sll. insertAtTail(500);
        sll.printSLL();

        sll.insertAtHead(10);
        sll.insertAtHead(20);
        sll.insertAtHead(30);
        sll.insertAtHead(40);
        sll.insertAtHead(50);

        System.out.println();
        sll.printSLL();

        System.out.println();
        sll.deleteAtHead();
        sll.printSLL();

        sll.deleteByVal(30);
        sll.printSLL();

    }
}