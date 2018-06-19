package ds.queue;

public interface IQueue<T> {
    void enqueue(T item);
    T dequeue();
    T peekFront();
    boolean isEmpty();
    boolean isFull();
}
