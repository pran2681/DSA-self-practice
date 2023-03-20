package Queue;

public class add {
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
        }
    }
     
}


// //////////////////////////////////////////////////////////////
// ////////////////USING ARRAY ////////////////////////

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
    }
}


import java.util.ArrayList;
public class Queue{
    private ArrayList<Integer> list;

    public Queu4() {
        list=new ArrayList<Integer>();
    }

    public void enqueue(int data){
        list.add(data);
        System.out.println(data +" is enqueued to the queue");
    }

    public void display(){
        if(list.isEmpty()){
            System.out.println("Queue is empty");
            return;
        }
        sysout("Element of the queue are: ");
        for(i=0;i<list.size;i++){
            sysout(list.get(i)+" ");
        }
        sysout();
    }
    public static void main(String args[]){
        Queue queue=new Queue;
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        queue.display()
    }
}