// Adjacency List = array/arrayList of linkedList

import myutils.GraphAdj;
import myutils.Node;

// Runtime complexity: O(v)
// Space complexity: O(v + e)
public class TestAdjList {
  public static void main(String[] args) {
    GraphAdj graph = new GraphAdj();

    graph.addNode(new Node('A'));
    graph.addNode(new Node('B'));
    graph.addNode(new Node('C'));
    graph.addNode(new Node('D'));
    graph.addNode(new Node('E'));

    graph.addEdge(0, 1);
    graph.addEdge(1, 2);
    graph.addEdge(2, 3);
    graph.addEdge(2, 4);
    graph.addEdge(4, 0);
    graph.addEdge(4, 2);

    graph.print();

  }
}
