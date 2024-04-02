package myutils;

public class BinarySearchTree {
  NodeTree root;

  public void insert(NodeTree node) {
    root = insertHelper(root, node);
  }

  private NodeTree insertHelper(NodeTree root, NodeTree node) {
    int data = node.data;

    if(root == null) {
      root = node;
      return root;
    }
    else if(data < root.data) {
      root.left = insertHelper(root.left, node);
    }
    else {
      root.right = insertHelper(root.right, node);
    }
    return root;
  }

  public void display() {
    displayHelper(root);
  }

  private void displayHelper(NodeTree root) {
    if(root != null) {
      displayHelper(root.left);
      System.out.println(root.data);
      displayHelper(root.right);
    }
  }

  public boolean search(int data) {
    return searchHelper(root, data);
  }

  private boolean searchHelper(NodeTree root, int data) {
    if(root == null) {
      return false;
    }
    else if(root.data == data) {
      return true;
    }
    else if(root.data > data) {
      return searchHelper(root.left, data);
    } 
    else {
      return searchHelper(root.right, data);
    }
  }

  public void remove(int data) {
    if(search(data)) {
      removeHelper(root, data);
    }
    else {
      System.out.println(data + " is not found!!!");
    }
  }

  public NodeTree removeHelper(NodeTree root, int data) {
    if(root == null) {
      return root;
    }
    else if (data < root.data) {
      root.left = removeHelper(root.left, data);
    }
    else if(data > root.data) {
      root.right = removeHelper(root.right, data);
    }
    else { // node found
      if(root.left == null && root.right == null) {
        root = null;
      }
      else if(root.right != null) { // find a successor to replace this node
        root.data = successor(root);
        root.right = removeHelper(root.right, root.data);
      }
      else { // find a predecessor to replace this node
        root.data = predecessor(root);
        root.left = removeHelper(root.left, root.data);
      }
    }
    return null;
  }

  // find least value below the right child of thisroot node
  private int successor(NodeTree root) {
    root = root.right;
    while(root.left != null) {
      root = root.left;
    }
    return root.data;
  }

  // find greatest value below the right child of thisroot node
  private int predecessor(NodeTree root) {
    root = root.left;
    while(root.right != null) {
      root = root.right;
    }
    return root.data;
  }

}
