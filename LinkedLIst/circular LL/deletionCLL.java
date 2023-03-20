// package circular LL;

// public class deletionCLL {
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
    
//         // Method to delete a node from the circular linked list
//         public void deleteNode(int key) {
//             if (head == null) {
//                 System.out.println("List is empty");
//                 return;
//             }
    
//             Node current = head;
//             Node prev = null;
    
//             while (current.data != key) {
//                 if (current.next == head) {
//                     System.out.println("Node with data " + key + " not found in the list");
//                     return;
//                 }
    
//                 prev = current;
//                 current = current.next;
//             }
    
//             if (current == head && current.next == head) {
//                 head = null;
//                 tail = null;
//                 return;
//             }
    
//             if (current == head) {
//                 head = current.next;
//                 tail.next = head;
//             } else if (current == tail) {
//                 tail = prev;
//                 tail.next = head;
//             } else {
//                 prev.next = current.next;
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
    
//             // Delete the node with data 3
//             list.deleteNode(3);
    
//             System.out.println("List after deletion:");
//             list.displayList();
//         }
//     }
    
// }
