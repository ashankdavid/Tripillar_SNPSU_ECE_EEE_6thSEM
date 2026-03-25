package DataStructure.Graphs.Algos;

import java.util.ArrayList;
import java.util.Arrays;

class Edge{
    int node;
    int weight;

    Edge(int node, int weight){
        this.node = node;
        this.weight = weight;
    }
}

public class DijkstraAlgorithm {
    public static void main(String[] args) {
        int n = 6; // node -> 0 to 5
        ArrayList<ArrayList<Edge>> adjList = new ArrayList<>();
        for(int i=0; i<n; i++){
            adjList.add(new ArrayList<>());
        }
        // 0-1
        adjList.get(0).add(new Edge(1,4));
        adjList.get(1).add(new Edge(0, 4));

        // 0-2
        adjList.get(0).add(new Edge(2,4));
        adjList.get(2).add(new Edge(0, 4));

        // 1-2
        adjList.get(1).add(new Edge(2,2));
        adjList.get(2).add(new Edge(1, 2));

        // 2-3
        adjList.get(2).add(new Edge(3,3));
        adjList.get(3).add(new Edge(2, 3));

        // 2-4
        adjList.get(2).add(new Edge(4,1));
        adjList.get(4).add(new Edge(2, 1));

        // 2-5
        adjList.get(2).add(new Edge(5,6));
        adjList.get(5).add(new Edge(2, 6));

        // 3-5
        adjList.get(3).add(new Edge(5,2));
        adjList.get(5).add(new Edge(3, 2));

        // 4-5
        adjList.get(4).add(new Edge(5,3));
        adjList.get(5).add(new Edge(4, 3));

        int[] dist = new int[n];
        boolean[] visited = new boolean[n];

        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[0] = 0;
        for(int i=0; i<n; i++){
            int temp = -1;
            int min = Integer.MAX_VALUE;
            for(int j=0; j<n; j++){
                if(!visited[j] && dist[j] < min){
                    min = dist[j];
                    temp = j;
                }
            }
            visited[temp] = true;

            for(Edge e : adjList.get(temp)){
                int v = e.node;
                int w = e.weight;

                if(!visited[v] && dist[temp] + w < dist[v]){
                    dist[v] = dist[temp] + w;
                }
            }
        }
        System.out.println("Shortest Distance from Source: ");

        for(int i=0; i<n; i++){
            System.out.println("Node " + i + "->" + dist[i]);
        }
    }
}
