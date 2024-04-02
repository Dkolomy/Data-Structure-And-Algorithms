/*
 * tree = a non-linear data structure where nodes are
 * organized in a hierarhy
 * Binary Search Tree;
 *    Time complexity: best O(log n) - worst O(n)
 *    Space complexity: O(n)
 */

import myutils.BinarySearchTree;
import myutils.NodeTree;

public class TestBinaryTree {
  public static void main(String[] args) {
    BinarySearchTree tree = new BinarySearchTree();
    tree.insert(new NodeTree(5));
    tree.insert(new NodeTree(1));
    tree.insert(new NodeTree(9));
    tree.insert(new NodeTree(7));
    tree.insert(new NodeTree(3));
    tree.insert(new NodeTree(6));
    tree.insert(new NodeTree(4));
    tree.insert(new NodeTree(8));

    tree.remove(5);
    tree.display();
    System.out.println();

    System.out.println(tree.search(10));
    

  }
}
