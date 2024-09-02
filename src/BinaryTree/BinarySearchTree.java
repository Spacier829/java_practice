package BinaryTree;

public class BinarySearchTree {
  private Node root;

  public Node getRoot() {
    return root;
  }

  public BinarySearchTree(Node root) {
    this.root = root;
  }

  public void insertNode(int value, Node node) {
    if (root == null) {
      root = new Node(value);
    }
    if (value < node.getValue()) {
      if (node.getLeft() == null) {
        node.setLeft(new Node(value));
      } else {
        insertNode(value, node.getLeft());
      }
    } else {
      if (node.getRight() == null) {
        node.setRight(new Node(value));
      } else {
        insertNode(value, node.getRight());
      }
    }
  }

  public void printTree(Node node) {
    if (node.getLeft() != null) {
      printTree(node.getLeft());
    }
    System.out.println(node.getValue() + " ");
    if (node.getRight() != null) {
      printTree(node.getRight());
    }
  }
}
