package ds.binarysearchtree;

public class Application {
    public static void main(String[] args) {
        BinarySearchTree bsTree = new BinarySearchTree();
        bsTree.insert(30, "Nate");
        bsTree.insert(21, "Binh");
        bsTree.insert(22, "Esther");
        System.out.println(bsTree.findMinumum().toString());
    }
}
