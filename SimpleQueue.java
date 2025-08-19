public class SimpleQueue {
    int size = 5;
    int[] queue = new int[size];
    int front = 0;
    int rear = -1;
    void enqueue(int item) {
        if (rear == size - 1) {
            System.out.println("Queue is full");
        } else {
            rear++;
            queue[rear] = item;
            System.out.println("Inserted: " + item);
        }
    }
    void dequeue() {
        if (front > rear) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("Deleted: " + queue[front]);
            front++;
        }
    }
    void display() {
        if (front > rear) {
            System.out.println("Queue is empty");
        } else {
            System.out.print("Queue: ");
            for (int i = front; i <= rear; i++) {
                System.out.print(queue[i] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        SimpleQueue q = new SimpleQueue();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.display();
        q.dequeue();
        q.display();
        q.enqueue(40);
        q.display();
    }
}
