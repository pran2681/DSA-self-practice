public class InsertAtFisrt{
    class Node{
        String data;
        Node next;
        public Node(String data){
            this.data=data;
            this.next=null;
        }
    }
    public Node head=null;
    public Node tail= null;

    public void addNodeAtFirst(String data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
            tail= newNode;

        }
        else{
            Node temp = head;
            head = newNode;
            head.next=temp;
        }
    }
    public void display(){
        Node current = head;
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        System.out.println(" List is here: ");
        while(current != null){
            System.out.println(current.data);
            current=current.next;
        }
        System.out.println();
    }
    public static void main(String args[]){
        InsertAtFisrt slist=new InsertAtFisrt();
        slist.addNodeAtFirst("My name is pran");
        slist.addNodeAtFirst("I live in jajori");

        slist.display();
    }
}