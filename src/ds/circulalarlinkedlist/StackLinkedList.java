package ds.circulalarlinkedlist;

public class StackLinkedList {
    private int length;
    private CircularLinkedList linkedList;
    private Node top;

    public StackLinkedList() {
        linkedList = new CircularLinkedList();
        top = linkedList.getFirst();
        length = 0;
    }

    public void push(int data) {
        linkedList.insertFirst(data);
        top = linkedList.getFirst();
        length++;
    }

    public int pop() {
        top = linkedList.getFirst();
        if (top == null) {
            return -1;
        }
        linkedList.deleteFirst();
        length--;
        return top.data;
    }


    public void printStack() {
        System.out.println("Stack Linked List content");
        linkedList.displayList();
    }
}
