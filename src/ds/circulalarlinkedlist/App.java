package ds.circulalarlinkedlist;

public class App {

    public static void main(String[] args) {
        CircularLinkedList myList = new CircularLinkedList();
        myList.insertFirst(1);
        myList.insertFirst(2);
        myList.insertFirst(3);
        myList.insertLast(8);
        myList.insertLast(9);
        myList.insertLast(10);
        myList.insertLast(12222);
        myList.displayList(); System.out.println();

        StackLinkedList stackLinkedList = new StackLinkedList();
        stackLinkedList.push(1);
        stackLinkedList.push(2);
        stackLinkedList.push(5);
        stackLinkedList.printStack();
        System.out.println("Popped: " + stackLinkedList.pop());
        stackLinkedList.printStack(); System.out.println();

        QueueLinkedList queueLinkedList = new QueueLinkedList();
        queueLinkedList.enqueue(10);
        queueLinkedList.enqueue(11);
        queueLinkedList.enqueue(12);
        queueLinkedList.printQueue();
        System.out.println("Dequeue: " + queueLinkedList.dequeue());
        queueLinkedList.printQueue();
    }
}
