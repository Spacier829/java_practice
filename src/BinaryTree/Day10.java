package BinaryTree;

public class Day10 {
  public static void main(String[] args) {
    BinarySearchTree bst = new BinarySearchTree(new Node(20));
    bst.insertNode(14, bst.getRoot());
    bst.insertNode(11, bst.getRoot());
    bst.insertNode(23, bst.getRoot());
    bst.insertNode(5, bst.getRoot());
    bst.insertNode(8, bst.getRoot());
    bst.insertNode(16, bst.getRoot());
    bst.insertNode(22, bst.getRoot());
    bst.insertNode(27, bst.getRoot());
    bst.insertNode(150, bst.getRoot());
    bst.insertNode(15, bst.getRoot());
    bst.insertNode(18, bst.getRoot());
    bst.insertNode(24, bst.getRoot());
    bst.printTree(bst.getRoot());
    int a = 123;
  }
}
