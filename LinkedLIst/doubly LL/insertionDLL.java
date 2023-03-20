public class insertionDLL{
    class Node{
        int data;
        Node prev;
        Node next;
        public Node(int data){
            this.data=data;
            this.prev=null;
            this.next=null;
        }
    }
    public Node head=null;
    public Node tail=null;

    public void insertAtPos(int pos,int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            tail=newNode;
            return;
        }
        if(pos == 1){
            newNode.next=head;
            head.prev=newNode;
            head=newNode;
            return;
        }

        Node currNode=head;
        int count=1;
        while(currNode!=null && count <pos){
            currNode=currNode.next;
            count++;
        }
        if (currNode == null) {
            // The position is greater than the length of the list
            currNode = head;
            while (currNode.next != null) {
                currNode = currNode.next;
            }
            currNode.next = newNode;
            newNode.prev = currNode;
        } else {
            newNode.prev = currNode.prev;
            newNode.next = currNode;
            currNode.prev.next = newNode;
            currNode.prev = newNode;}
        }
    }

    public void display(){
        Node currNode=head;
        if(head==null){
            System.out.println("LIst is empty");
            return;
        }
        while(currNode!=null){
            System.out.println(currNode.data);
            currNode=currNode.next;
        }
        System.out.println();
    }

    public static void main(String args[]){
        insertionDLL slist=new insertionDLL();

        slist.insertAtPos(1, 1);
        slist.insertAtPos(2, 2);
        slist.insertAtPos(3, 3);

        slist.display();
    }
}