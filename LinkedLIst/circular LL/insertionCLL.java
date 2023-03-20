// package circular LL;

// public class insertionCLL {
//     public class Node {
//         int data;
//         Node next;
    
//         public Node(int data) {
//             this.data = data;
//             this.next = null;
//         }
//     }
    
//     public class CircularLinkedList {
//         private Node head;
//         private Node tail;
    
//         public CircularLinkedList() {
//             head = null;
//             tail = null;
//         }
    
//         // Method to add a new node to the circular linked list
//         public void addNode(int data) {
//             Node newNode = new Node(data);
    
//             if (head == null) {
//                 head = newNode;
//                 tail = newNode;
//                 newNode.next = head;
//             } else {
//                 tail.next = newNode;
//                 tail = newNode;
//                 tail.next = head;
//             }
//         }
    
//         // Method to display the contents of the circular linked list
//         public void displayList() {
//             Node current = head;
    
//             if (head == null) {
//                 System.out.println("List is empty");
//             } else {
//                 System.out.println("Nodes of the circular linked list: ");
    
//                 do {
//                     System.out.print(" " + current.data);
//                     current = current.next;
//                 } while (current != head);
//             }
//         }
    
//         // Method to insert a node at a specific position in the circular linked list
//         public void insertNode(int data, int position) {
//             Node newNode = new Node(data);
    
//             if (head == null) {
//                 head = newNode;
//                 tail = newNode;
//                 newNode.next = head;
//             } else {
//                 Node current = head;
//                 int count = 1;
    
//                 while (count < position - 1) {
//                     current = current.next;
//                     count++;
//                 }
    
//                 newNode.next = current.next;
//                 current.next = newNode;
//             }
//         }
    
//         public static void main(String[] args) {
//             CircularLinkedList list = new CircularLinkedList();
    
//             list.addNode(1);
//             list.addNode(2);
//             list.addNode(3);
//             list.addNode(4);
    
//             System.out.println("Original list:");
//             list.displayList();
    
//             // Insert a node at position 3
//             list.insertNode(5, 3);
    
//             System.out.println("List after insertion:");
//             list.displayList();
//         }
//     }
    
// }
