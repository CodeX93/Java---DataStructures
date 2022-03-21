import java.util.ArrayList;
import java.util.List;

public class Graph {


    public static ArrayList<List<Nodes>> adj_list = new ArrayList<>();

    //Graph Constructor
    public Graph(List<Edges> edges)
    {
        // adjacency list memory allocation
        for (int i = 0; i < edges.size(); i++)
            adj_list.add(i, new ArrayList<>());

        // add edges to the graph
        for (Edges e : edges)
        {
            // allocate new node in adjacency List from src to dest
            adj_list.get(e.src).add(new Nodes(e.dest));

        }

    }
    // print adjacency list for the graph
    public static void printGraph(Graph graph)  {
        int src_vertex = 0;
        int list_size = graph.adj_list.size();

        System.out.println("The contents of the graph:");
        while (src_vertex < list_size) {
            //traverse through the adjacency list and print the edges
            for (Nodes edge : graph.adj_list.get(src_vertex)) {
                System.out.print("Vertex:" + src_vertex + " ==> " + edge.value+"\t" );
            }

            System.out.println();
            src_vertex++;
        }
    }


    int getGraphSize(){
        return adj_list.size();
    }
}

