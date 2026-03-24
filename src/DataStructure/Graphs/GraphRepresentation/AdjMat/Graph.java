package DataStructure.Graphs.GraphRepresentation.AdjMat;

public class Graph {
    int[][] adjMat; // Ajacency Matrix
    int V; // Number of Vertices

    Graph(int vertices){
        this.V = vertices;
        adjMat = new int[V][V];
    }

    void addEdge(int u, int v){
        adjMat[u][v] = 1;
        adjMat[v][u] = 1;
    }

    void printAdjMat(){
        System.out.println("Adjcency Matrix: ");
        for(int i=0; i<V; i++){
            for(int j=0; j<V ;j++){
                System.out.print(adjMat[i][j] + " ");
            }
            System.out.println();
        }
    }
}

class DriverCode{
    public static void main(String[] args) {
        Graph g = new Graph(6);

        g.addEdge(0, 5);
        g.addEdge(5, 4);
        g.addEdge(0, 4);
        g.addEdge(0, 1);
        g.addEdge(4, 1);
        g.addEdge(4, 3);
        g.addEdge(1, 3);
        g.addEdge(1, 2);
        g.addEdge(3, 2);

        g.printAdjMat();
    }
}
