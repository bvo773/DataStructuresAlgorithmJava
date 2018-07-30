package ds.binarysearchtreeRecursion;

public class BinarySearchTree {
    private Node root;

    public void insert(int key, String value) {
        Node newNode = new Node(key,value);
        insert(newNode, this.root);
    }
    private void insert(Node newNode, Node root) {
        if (root == null) {
            this.root = newNode;
            return;
        }
        else if(newNode.getKey() < root.getKey()) {
            if(root.getLeftChild() == null) {
                root.setLeftChild(newNode);
                newNode.setParent(root);
            }
            else {
                this.insert(newNode, root.getLeftChild());
            }
        }
        else {
            if(root.getRightChild() == null) {
                root.setRightChild(newNode);
                newNode.setParent(root);
            }
            else {
                this.insert(newNode, root.getRightChild());
            }
        }
    }

    public Node findMinimum() {
        return findMinimum(this.root);
    }

    private Node findMinimum(Node root) {
        if (root.getLeftChild() == null) return root; // returns the leaf node
        else {
            System.out.println(root.toString());
            return this.findMinimum(root.getLeftChild());
        }
    }
}
