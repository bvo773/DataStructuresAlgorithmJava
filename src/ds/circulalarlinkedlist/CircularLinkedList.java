package ds.circulalarlinkedlist;

public class CircularLinkedList {
    private Node first;
    private Node last;


    public CircularLinkedList() {
        first = null;
        last = null;
    }

    public boolean isEmpty() {
        return (first == null);
    }

    public void insertFirst(int i) {
        Node newNode = new Node();
        newNode.data = i;

        if (isEmpty()) {
            last = newNode; // last will be first since it the first one.
        }
        newNode.next = first; // newNode --> old first
        first = newNode; // update first to the new first
    }

    public void insertLast(int i) {
        Node newNode = new Node();
        newNode.data = i;
        if (isEmpty()) {
            first = newNode;
        } else{
            last.next = newNode; }// the next value of the last node will point to the new node//
        last = newNode; // we make the new node we created be the last one in the list
    }

    // Delete the first node and return its data
    public int deleteFirst() {
        int data = first.data; // Get the current first data
        if (first == null) { // Empty list case
            return -1;
        }
        if (first.next == null) { // Only node in the list
            last = null;
        }
        first = first.next; // first will point to old's next value
        return data;
    }


    public Node getFirst(){
        return first;
    }

    public Node getLast() {
        return last;
    }
    public void displayList() {
        System.out.println("List (first --> last)");
        Node current = first;
        while (current != null ) {
            current.displayNode();
            current = current.next;
        }
        System.out.println();
    }


}
