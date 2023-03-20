package Queue;

public class delete {
    public class Node {
        int data;
        Node next;
    
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
    public class Queue {
        Node front;
        Node rear;
    
        public Queue() {
            front = null;
            rear = null;
        }
    
        // Method to add a new node to the queue
        public void enqueue(int data) {
            Node newNode = new Node(data);
    
            if (rear == null) {
                front = newNode;
                rear = newNode;
            } else {
                rear.next = newNode;
                rear = newNode;
            }
    
            System.out.println(data + " enqueued to queue");
        }
    
        // Method to remove a node from the queue
        public void dequeue() {
            if (front == null) {
                System.out.println("Queue is empty");
                return;
            }
    
            Node temp = front;
            front = front.next;
    
            if (front == null) {
                rear = null;
            }
    
            System.out.println(temp.data + " dequeued from queue");
        }
    
        // Method to display the contents of the queue
        public void displayQueue() {
            Node current = front;
    
            if (front == null) {
                System.out.println("Queue is empty");
                return;
            }
    
            System.out.println("Nodes of the queue: ");
    
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
    
            System.out.println();
        }
    
        public static void main(String[] args) {
            Queue queue = new Queue();
    
            queue.enqueue(10);
            queue.enqueue(20);
            queue.enqueue(30);
    
            queue.displayQueue();
    
            queue.dequeue();
    
            queue.displayQueue();
        }
    }
     
}


////////////////////////////////////////////////////////////
////////USING ARRAY////////////////

import java.util.ArrayList;

public class Queue {
    private ArrayList<Integer> list;

    public Queue() {
        list = new ArrayList<Integer>();
    }

    // Method to add a new element to the queue
    public void enqueue(int data) {
        list.add(data);
        System.out.println(data + " enqueued to queue");
    }

    // Method to remove the first element from the queue
    public void dequeue() {
        if (list.isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }

        int data = list.get(0);
        list.remove(0);

        System.out.println(data + " dequeued from queue");
    }

    // Method to display the contents of the queue
    public void displayQueue() {
        if (list.isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }

        System.out.println("Elements of the queue: ");

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {
        Queue queue = new Queue();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        queue.displayQueue();

        queue.dequeue();

        queue.displayQueue();
    }
}

