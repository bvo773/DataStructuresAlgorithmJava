package ds.circulalarlinkedlist;

public class QueueLinkedList {
    private CircularLinkedList linkedList;
    private Node front;
    private Node rear;
    private int nItem;

    public QueueLinkedList() {
        linkedList = new CircularLinkedList();
        front = linkedList.getFirst();
        rear = linkedList.getLast();
    }

    public void enqueue(int data){
        linkedList.insertLast(data);
    }

    public int dequeue() {
        if (!linkedList.isEmpty()) {
            front = linkedList.getFirst().next;
            return linkedList.deleteFirst();
        }
        return -1;
    }

    public void peekFront(){
        front = linkedList.getFirst();
        System.out.println("Front: " + front.data);
    }

    public boolean isEmpty() {
        return linkedList.isEmpty();
    }

    public void printQueue() {
        System.out.println("Queue Linked List content");
        linkedList.displayList();
    }

}




