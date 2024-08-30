package BinaryTree;

public class Node {
  private int value;
  private Node leftNode;
  private Node rightNode;

  public Node(int value) {
    this.value = value;
  }

  public int getValue() {
    return value;
  }

  public void setValue(int value) {
    this.value = value;
  }

  public void addNode(int value, Node root) {
    if (value < root.getValue()) {
      if (root.leftNode == null) {
        leftNode = new Node(value);
      } else {
        leftNode.addNode(value, leftNode);
      }
    } else {
      if (root.rightNode == null) {
        rightNode = new Node(value);
      } else {
        rightNode.addNode(value, rightNode);
      }
    }
  }

  public void printTree(Node root) {
    if (root.leftNode != null) {
      leftNode.printTree(leftNode);
    }
    System.out.println(root.getValue() + " ");
    if (root.rightNode != null) {
      rightNode.printTree(rightNode);
    }
  }
}