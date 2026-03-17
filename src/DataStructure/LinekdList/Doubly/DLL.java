package DataStructure.LinekdList.Doubly;

class Node{
    int data;
    Node next;
    Node prev;

    Node(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class DLL {
    Node head;

    DLL(){
        head = null;
    }

    void insertAtHead(int val){
        Node n = new Node(val);
        if(head!=null){
            n.next = head;
            head.prev = n;
        }
        head = n;
    }

    void insertAtTail(int val){
        Node n = new Node(val);
        if(head == null){
            head = n;
            return ;
        }
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = n;
        n.prev = temp;
    }

    void deleteAtHead(){
        if(head==null){
            return ;
        }
        Node toDelete = head;
        head = head.next;

        if(head!=null){
            head.prev = null;
        }

        toDelete = null;
    }

    void deleteByVal(int val){
        if(head==null){
            return ;
        }
        if(head.data == val){
            deleteAtHead();
            return;
        }
        Node temp = head;
        while(temp.data!=val){
            temp = temp.next;
        }
        if(temp == null){
            System.out.println("Value not found");
            return ;
        }
        if(temp.prev!=null){
            temp.prev.next = temp.next;
        }
        if(temp.next!=null){
            temp.next.prev = temp.prev;
        }
        temp = null;
    }
}
