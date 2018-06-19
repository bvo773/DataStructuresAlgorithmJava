package ds.singlyLinkedList;

public class App {
    public static void main(String[] args) {
        SinglyLinkedList linkedList = new SinglyLinkedList();
//        linkedList.insertFirst(1);
//        linkedList.insertFirst(2);
//        linkedList.insertFirst(4);
//        linkedList.insertFirst(5);
//        linkedList.displayList();
//        linkedList.insertLast(999);
        linkedList.insertFirst(10);
//        linkedList.insertLast(1000);
        linkedList.insertFirst(20);
        System.out.println("Inserted last node");
        linkedList.displayList();
    }
}
