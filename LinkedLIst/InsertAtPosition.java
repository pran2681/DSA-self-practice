public class InsertAtPosition {
    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public Node head = null;
    public Node tail = null;

    public void addFirst(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            tail=newNode;
        }
        else{
            tail.next=newNode;
            tail=newNode;

        }
    }
    public void addAtpos(int data, int posi){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        if(posi==0){
            newNode.next=head;
            head=newNode;
            return;
        }
        Node prev =head;
        for(int i=0;i< posi-1 && prev.next!=null;i++){
            prev=prev.next;
        }
        newNode.next=prev.next;
        prev.next=newNode;
    }
    public void display(){
        Node current =head;
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        while(current!=null){
            System.out.println(current.data);
            current=current.next;
        }
        System.out.println();

    }
    public static void main(String args[]){
        InsertAtPosition slist=new InsertAtPosition();

        slist.addFirst(5);
        slist.addFirst(6);
        slist.addFirst(7);
        slist.addFirst(8);

        slist.display();

        slist.addAtpos(6, 1);
        slist.display();
    }
    public void delete(int i) {
    }
}
