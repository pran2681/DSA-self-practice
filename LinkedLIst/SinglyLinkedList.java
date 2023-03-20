// import javax.swing.plaf.SliderUI;

// public class SinglyLinkedList{
//     //Represent a node of the singly linked list
//     class Node{
//         int data;
//         Node next;

//         public Node(int data){
//             this.data=data;
//             this.next=null;
//         }
//     }
//     //Represent the heda and tail of the singlu linked list
//     public Node head = null;
//     public Node tail= null;

//     //addNode() will add a new node to the list
//     public void addNode(int data){
//         //Creat a new node
//         Node newNode = new Node(data);

//         //Checks if the list is empty
//         if(head == null){
//             //If list is empty,both head and tail will point to a new node
//             head = newNode;
//             tail = newNode;
//         }
//         else{
//             //newNode will be add after tail such that tail's next will be point to a newNode
//             tail.next = newNode;
//             //newNode will become new tail of the list
//             tail= newNode;
//         }
//     }

//     //display() will display all the nodes present in the list
//     public void display(){
//         //Node current will be point to head
//         Node current = head;
        
//         if(head == null){
//             System.out.println("List is empty");
//             return;
//         }
//         System.out.println("Nodes of singly linked list: ");
//         while(current != null){
//             //print each node by incrementing pointer
//             System.out.println(current.data);
//             current=current.next;
//         }
//         System.out.println();
//     }
//     public static void main(String args[]){
        
//         SinglyLinkedList sList = new SinglyLinkedList();

//         //add nodes to the list
//         sList.addNode(0);
//         sList.addNode(1);
//         sList.addNode(2);
//         sList.addNode(3);
//         sList.addNode(5);

//         //display the nodes present in the list
//         sList.display();
//     }
// }


public class SinglyLinkedList{
    class Node{
        int data;
        Node next;
        public Node(int data{
            this.data=data;
            this.next=null;
        }
    }
    public Node head=null;
    public Node tail=null;

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
    }

    public void display(){
        Node current =head;

        if(head==null){
            System.out.println("list is empty");
            return;
        }
        System.out.println("List is: ");
        while(current!=null){
            
        }
    }
}