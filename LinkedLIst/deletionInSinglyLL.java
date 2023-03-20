// public class deletionInSinglyLL {
//     class Node{
//         int data;
//         Node next;
//         public Node(int data){
//             this.data=data;
//             this.next=null;
//         }
//     }
//     public Node head = null;
//     public Node tail = null;

//     public void addFirst(int data){
//         Node newNode=new Node(data);
//         if(head==null){
//             head=newNode;
//             tail=newNode;
//         }
//         else{
//             tail.next=newNode;
//             tail=newNode;

//         }
//     }
    
//     // // Function to delete a node from the linked list
//     // public void deleteNode(int key) {
//     //     Node temp = head;
//     //     Node prev = null;

//     //     // If head node itself holds the key to be deleted
//     //     if (temp != null && temp.data == key) {
//     //         head = temp.next; // Changed head
//     //         return;
//     //     }

//     //     // Search for the key to be deleted, keep track of the
//     //     // previous node as we need to change temp.next
//     //     while (temp != null && temp.data != key) {
//     //         prev = temp;
//     //         temp = temp.next;
//     //     }

//     //     // If key was not present in linked list
//     //     if (temp == null)
//     //         return;

//     //     // Unlink the node from linked list
//     //     prev.next = temp.next;
//     // }
//     public void deleteNode(int key){
//         Node temp=head;
//         Node prev=null;

//         if(temp!=null&& temp.data==key){
//             head=temp.next;
//             return;
//         }
//         while(temp!=null && temp.data !=key){
//             prev=temp;
//             temp=temp.next;
//         }
//         if(temp==null){
//             return;
//         }
//         prev.next=temp.next;
//     }

    
//     public void display(){
//         Node current =head;
//         if(head==null){
//             System.out.println("list is empty");
//             return;
//         }
//         while(current!=null){
//             System.out.println(current.data);
//             current=current.next;
//         }
//         System.out.println();

//     }
//     public static void main(String args[]){
//         deletionInSinglyLL slist=new deletionInSinglyLL();

//         slist.addFirst(5);
//         slist.addFirst(6);
//         slist.addFirst(7);
//         slist.addFirst(8);

//         // slist.display();

//         slist.deleteNode(2);
//         slist.display();
//         slist.addFirst(3);
//         slist.display();

//         slist.deleteNode(3);
//         slist.display();

//     }
// }