package ds.binarysearchtreeRecursion;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree bsTree = new BinarySearchTree();
        bsTree.insert(21, "binh");
        bsTree.insert(22, "esther");
        bsTree.insert(30, "nate");
        bsTree.findMinimum();
        System.out.println(bsTree.findMinimum().toString());
    }

}
