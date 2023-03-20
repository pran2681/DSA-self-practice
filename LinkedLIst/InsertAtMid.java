import javax.crypto.Cipher;

public class InsertAtMid {
    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public int size;
    public Node head=null;
    public Node tail = null;

    public void addNode(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            tail=newNode;
        }
        else{
            tail.next=newNode;
            tail=newNode;

        }
        size++;
    }
    // public void addMidNode(int data){
    //     Node newNode=new Node(data);
    //     if(head==null){
    //         head=newNode;
    //         tail=newNode;
    //     }
    //     else{
    //         Node temp,current;
    //         int count=(size%2==0)?(size/2):((size+1)/2);
    //         temp=head;
    //         current=null;
    //         for(int i=0;i<count;i++){
    //             current=temp;
    //             temp=temp.next;
    //         }
    //         current.next=newNode;
    //         newNode.next=temp;
    //     }
    //     size++;
    // }
    public void addMidNode(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
            tail=newNode;
        }
        else{
            Node temp,current;
            int count = (size%2==0)?(size/2):((size+1)/2);
            temp=head;
            current=null;
            for(int i=0;i<count;i++){
                current=temp;
                temp=temp.next;
            }
            current.next=newNode;
            newNode.next=temp;
            
        }
        size++;
    }
    
    public void display(){
        Node current = head;  
        if(head == null) {  
            System.out.println("List is empty");  
            return;  
        }  
  
        while(current != null) {  
            //Prints each node by incrementing pointer  
            System.out.print(current.data + " ");  
            current = current.next;  
        }  
        System.out.println();  
    }
    public static void main(String[] args) {  
  
        InsertAtMid sList = new InsertAtMid();  
  
        //Adds data to the list  
        sList.addNode(1);  
        sList.addNode(2);  
  
        System.out.println("Original list: ");  
        sList.display();  
  
        //Inserting node '3' in the middle  
        sList.addMidNode(3);  
        System.out.println( "Updated List: ");  
        sList.display();  
  
        //Inserting node '4' in the middle  
        sList.addMidNode(4);  
        System.out.println("Updated List: ");  
        sList.display();  
    }  
}
