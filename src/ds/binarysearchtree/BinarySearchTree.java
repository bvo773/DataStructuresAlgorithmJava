package ds.binarysearchtree;

public class BinarySearchTree {
    private Node root;

    public void insert(int key, String value) {
        Node newNode = new Node(key, value);
        if(root == null) {
            root = newNode;
        }
        else {
            Node current = root;
            Node parent;
            while(true) {
                parent = current;
                if(key < current.key) {
                    current = current.leftChild;
                    if(current == null) { parent.leftChild = newNode; }
                    return;
                }
                else {
                    current = current.rightChild;
                    if (current == null) { parent.rightChild = newNode; }
                }
                return;
            }
        }
    }

    public Node findMinumum() {
        Node current = root;
        while(current.leftChild != null) { current = current.leftChild;}
        return current;
    }

    public Node findMaximum() {
        Node current = root;
        while(current.rightChild != null) {current = current.rightChild;}
        return current;
    }





}
