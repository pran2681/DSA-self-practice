package Queue.circular Q;

public class delete {
    class Node {
        int data;
        Node next;
    
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
    class CircularQueue {
        private Node front, rear;
        private int size, capacity;
    
        public CircularQueue(int capacity) {
            this.front = null;
            this.rear = null;
            this.size = 0;
            this.capacity = capacity;
        }
    
        public boolean isFull() {
            return (this.size == this.capacity);
        }
    
        public boolean isEmpty() {
            return (this.front == null);
        }
    
        public void add(int data) {
            Node newNode = new Node(data);
            if (isFull()) {
                System.out.println("Queue is full.");
                return;
            }
            if (isEmpty()) {
                this.front = newNode;
            } else {
                this.rear.next = newNode;
            }
            this.rear = newNode;
            this.rear.next = this.front;
            this.size++;
            System.out.println("Added " + data + " to the queue.");
        }
    
        public void delete() {
            if (isEmpty()) {
                System.out.println("Queue is empty.");
                return;
            }
            System.out.println("Removed " + this.front.data + " from the queue.");
            this.front = this.front.next;
            this.rear.next = this.front;
            this.size--;
        }
    
        public static void main(String[] args) {
            CircularQueue queue = new CircularQueue(5);
            queue.add(1);
            queue.add(2);
            queue.add(3);
            queue.add(4);
            queue.add(5);
            queue.add(6);
            queue.delete();
            queue.delete();
            queue.delete();
            queue.delete();
            queue.delete();
            queue.delete();
        }
    }

    
    ////////////////////////////////////////////////////////
    ////////////// USING ARRAY ///////////////////

    import java.util.ArrayList;

class CircularQueue {
    private ArrayList<Integer> data;
    private int front, rear, size, capacity;

    public CircularQueue(int capacity) {
        this.data = new ArrayList<>(capacity);
        this.front = -1;
        this.rear = -1;
        this.size = 0;
        this.capacity = capacity;
        for (int i = 0; i < capacity; i++) {
            this.data.add(0);
        }
    }

    public boolean isFull() {
        return (this.size == this.capacity);
    }

    public boolean isEmpty() {
        return (this.size == 0);
    }

    public void add(int value) {
        if (isFull()) {
            System.out.println("Queue is full.");
            return;
        }
        if (isEmpty()) {
            this.front = 0;
            this.rear = 0;
        } else {
            this.rear = (this.rear + 1) % this.capacity;
        }
        this.data.set(this.rear, value);
        this.size++;
        System.out.println("Added " + value + " to the queue.");
    }

    public void delete() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        int value = this.data.get(this.front);
        System.out.println("Removed " + value + " from the queue.");
        if (this.front == this.rear) {
            this.front = -1;
            this.rear = -1;
        } else {
            this.front = (this.front + 1) % this.capacity;
        }
        this.size--;
    }

    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue(5);
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.add(6);
        queue.delete();
        queue.delete();
        queue.delete();
        queue.delete();
        queue.delete();
        queue.delete();
    }
}

}
