package Queue;

class CircularQueue {
    static final int MAX = 5; 
    int front = 0, rear = -1;
    int arr[] = new int[MAX]; 
  
    void insert(int item) {
        if ((rear + 1) % MAX == front) {
            System.out.println("Queue Overflow");
        }
        else {
            rear = (rear + 1) % MAX;
            arr[rear] = item;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue();
        queue.insert(1);
        queue.insert(2);
        queue.insert(3);
    }
}
