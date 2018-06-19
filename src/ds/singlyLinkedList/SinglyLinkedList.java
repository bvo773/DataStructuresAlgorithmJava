package ds.singlyLinkedList;

public class SinglyLinkedList {
    public Node first; // The head of the train
    public Node last;

    public SinglyLinkedList() {}

    public boolean isEmpty() {
        return (first == null);
    }

    // Insert node in the beginning of the list
    public void insertFirst(int data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = first;
        first = newNode;
        if (first.next == null)
            last = first;


    }
    /* Efficient algorithm, don't have to traverse through the list*/
    public void insertLast(int data) {
        Node newNode = new Node();
        newNode.data = data;
        if (last == null) {
            last = newNode;
        }
        else if (last.next == null) {
            last.next = newNode;
            last = newNode;
        }
        if (first == null) {
            first = last;
        }
    }



    public Node deleteFirst() {
        Node temp = first;
        first = temp.next;
        return first;
    }

    public void displayList() {
        System.out.println("List (first --> last)");
        Node current = first;
        while (current != null ) {
            current.displayNode();
            current = current.next;
        }
    }
}
