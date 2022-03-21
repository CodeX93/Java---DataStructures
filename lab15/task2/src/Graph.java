import java.util.Iterator;
import java.util.LinkedList;

class Graph {
    private int Vertices;   // No. of vertices
    private LinkedList<Integer> adj_list[]; //Adjacency Lists


    Graph(int v) {
        Vertices = v;
        adj_list = new LinkedList[v];
        for (int i=0; i<v; ++i)         //create adjacency lists
            adj_list[i] = new LinkedList();
    }

    // add an edge to the graph
    void addEdge(int v,int w) {
        adj_list[v].add(w);
    }

    // BFS traversal from the root_node
    void BFS(int root_node)   {

        boolean visited[] = new boolean[Vertices];


        LinkedList<Integer> queue = new LinkedList<Integer>();


        visited[root_node]=true;
        queue.add(root_node);

        while (queue.size() != 0)  {

            root_node = queue.poll();
            System.out.print(root_node+" ");


            Iterator<Integer> i = adj_list[root_node].listIterator();
            while (i.hasNext()){
                int n = i.next();
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }
}