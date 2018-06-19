package ds.queue;

public class App {

    public static void main(String[] args) {
        Queue queue = new Queue(5);
        queue.enqueue("Binh");
        queue.enqueue("Ismail");
        queue.enqueue("Esther");
        queue.enqueue("League");

        Queue.printQueue(queue);
    }
}
