
// DFS = a search algorithm for traversing a tree or graph data structure
import myutils.GraphDFS;
import myutils.Node;

public class TestDepthFirstSearch {
    
  public static void main(String[] args) {
    GraphDFS graph = new GraphDFS(5);
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

    System.out.println();

    graph.depthFirstSearch(2);

  }

}
