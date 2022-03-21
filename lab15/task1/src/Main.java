import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here


        List<Edges> edges = Arrays.asList(
                new Edges(0, 1),
                new Edges(0, 2),
                new Edges(1, 2),
                new Edges(2, 0),
                new Edges(2, 1),
                new Edges(3, 2),
                new Edges(4, 5),
                new Edges(5, 4)
                );

        // call graph class Constructor to construct a graph
        Graph graph = new Graph(edges);

        // print the graph as an adjacency list
        System.out.println("Size of Graph is:\t"+graph.getGraphSize());
        Graph.printGraph(graph);


    }
}
