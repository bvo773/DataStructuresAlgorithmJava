package ds.queue;

public class Queue<T> implements IQueue<T> {

    private int maxSize;
    private T[] queueArray; // slots to maintain the data
    private int front; // index pos for element in the front
    private int rear; // index pos for element back of the line
    private int nItem;

    public Queue(int size) {
        this.maxSize = size;
        this.queueArray = (T[]) new Object[maxSize];
        front = 0; // first slot in line
        rear = -1; // no items in the array yet
        nItem = 0;
    }

    public void enqueue(T item) {
        if(isFull()) {
            rear = -1; // reset the position, Circular Queue;
            System.out.println("Queue is currently full");
        }
        else{
            rear++;
            queueArray[rear] = item;
            nItem++;
        }
    }

    public T dequeue() {
        T item = queueArray[front];
        front++;
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return null;
        }
        if (front == maxSize) {
            front = 0; // set front back to the 0th index for a new line
        }
        return item;
    }

    public T peekFront() {
        return queueArray[front];
    }

    public boolean isEmpty() {
        return (nItem == 0);
    }

    public boolean isFull() {
        return (nItem == maxSize);
    }

    public static void printQueue(Queue queue) {
        System.out.print("[");
        for(int i = 0; i < queue.nItem; i++) {
            System.out.print(queue.queueArray[i] + "|");
        }
        System.out.println("]");
    }
}
