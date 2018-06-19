package ds.doublylinkedlist;

public class App {
    public static void main(String[] args) {
        DoublyLinkedList doubleDList = new DoublyLinkedList();
        doubleDList.insertFirst(1);
        doubleDList.insertFirst(2);
        doubleDList.insertLast(3);
        doubleDList.insertLast(4);
        doubleDList.deleteLast().displayNode();
        doubleDList.displayList();




    }
}
