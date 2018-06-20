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

    public void insertFirst(int data) {
        Node newNode = new Node();
        newNode.data = data;

        if (isEmpty()) {
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

    // assume non-empty list: insert a node with its after the given key
    public boolean insertAfter(int key, int data) {
        Node curr = first; // we start from the beginning of the list
        while (curr.data != key) { // as long as we have not found the key in a particular node
            curr = curr.next; // keep advancing
            if (curr == null) { // reach the end of the list if curr is null
                return false; // no node matches the key
            }
        }

        Node newNode = new Node();
        newNode.data = data;

        if (curr == last) { // if current is the last node
            curr.next = null;
            last = newNode;
        } else {
            newNode.next = curr.next; //new node's next field should point to the node ahead of the current
            curr.next.previous = newNode; // the node ahead of current, its previous field should point to the new node
        }
        newNode.previous = curr;
        curr.next = newNode;
        return true;
    }

    public Node deleteKey(int key) {
        Node curr = first;
        Node deletedKey = new Node();
        while (curr.data != key) {
            curr = curr.next;
            if (curr == null) { // No matching key
                return null;
            }
        }
        /* If key is matched, 3 cases */
        if (curr == first) { // 1) curr is the first node
            deletedKey = first;
            first = curr.next;
            first.previous = null;
        } else if (curr == last) { // 2) if current is the last node
            deletedKey = curr;
            last = curr.previous;
            last.next = null;
        } else {
            deletedKey = curr;
            curr.previous.next = curr.next;
            curr.next.previous = curr.previous;
        }
        return deletedKey;
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
