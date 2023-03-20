package Queue.circular Q;
/////////////// USING ARRAY //////////////////
public class add {
    import java.util.ArrayList;

public class CircularQueue {

  private ArrayList<Integer> queueList;
  private int front = -1;
  private int rear = -1;

  public CircularQueue(int size) {
    this.queueList = new ArrayList<Integer>(size);
  }

  public boolean isFull() {
    if ((front == 0 && rear == queueList.size() - 1) || (rear == front - 1)) {
      return true;
    }
    return false;
  }

  public boolean isEmpty() {
    if (front == -1) {
      return true;
    }
    return false;
  }

  public void add(int element) {
    if (isFull()) {
      System.out.println("Queue is full.");
    } else {
      if (front == -1) {
        front = 0;
      }
      rear = (rear + 1) % queueList.size();
      queueList.add(rear, element);
      System.out.println("Added " + element + " to the queue.");
    }
  }

  public static void main(String[] args) {
    CircularQueue queue = new CircularQueue(5);
    queue.add(1);
    queue.add(2);
    queue.add(3);
    queue.add(4);
    queue.add(5);
    queue.add(6);
  }
}

///////////////////////////////////////////////////////
////////// USING LL /////////////

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

    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue(5);
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.add(6);
    }
}


}
