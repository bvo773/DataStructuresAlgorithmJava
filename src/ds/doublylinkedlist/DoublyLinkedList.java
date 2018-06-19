package ds.doublylinkedlist;

public class DoublyLinkedList {
    private Node first;
    private Node last;

    public DoublyLinkedList() {
        this.first = null;
        this.last = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void insertFirst(int data ) {
        Node newNode = new Node();
        newNode.data = data;

        if(isEmpty()) {
            last = newNode; // If empty, last will refer to the new Node being created
        } else {
            first.previous = newNode;
        }
        newNode.next = first; // the new node's next field point to the old first
        first = newNode; // reassign first node address to the newNode's address
    }

    public void insertLast(int data) {
        Node newNode = new Node();
        newNode.data = data;
        if (isEmpty()) {
            first = newNode;
        } else {
            last.next = newNode;  // assigning old last to newnode
            newNode.previous = last; // the old last will be the newnodes previous
        }
        last = newNode; // the linkedList's last field should point to the new node
    }

    // assume non-empty list, need a case if the list is empty
    public Node deleteFirst() {
        Node temp = first;
        if (first.next == null) { // there is only item in the list
            last = null;
        } else { // there is more than 1 item in the list
            first.next.previous = null; // the list's first node will point to null to break the chain
        }
        first = first.next; // Reassign first reference to the next node after the chain is broken, need to be outside of else because for the first case(if)
        return temp; // return the deleted node(old first)
    }


    public Node deleteLast() {
        Node temp = last;
        if (last.previous == null) { // there is only item in the list
            first = null;
        } else {
            last = last.previous;
        }
        last.next = null;
        return temp;
    }
    public void displayList() {
        System.out.println("Double linked list: First ---> Last");
        Node curr = first;
        while (curr != null) {
            curr.displayNode();
            curr = curr.next;
        }
        System.out.println();
    }
}
