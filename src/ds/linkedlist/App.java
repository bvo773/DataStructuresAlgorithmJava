package ds.linkedlist;

public class App {

    public static void main(String[] args) {
        // Assigning value to each Node
        Node nodeA = new Node();
        nodeA.value = 4;

        Node nodeB = new Node();
        nodeB.value = 3;

        Node nodeC = new Node();
        nodeC.value = 7;

        Node nodeD = new Node();
        nodeD.value = 8;

        // Linking a train of nodes together
        nodeA.next = nodeB;
        nodeB.next = nodeC;
        nodeC.next = nodeD;
        System.out.println("Length: " + listLength(nodeA));

    }

    public static int listLength(Node aNode) {
        int length = 0;

        Node currentNode = aNode; // Current node in the list to iterate through, assign to the list in the beginning
        while (currentNode != null) {
            length++;
            currentNode = currentNode.next;
        }

        return length;
    }
}
