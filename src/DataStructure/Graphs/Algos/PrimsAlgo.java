package DataStructure.Graphs.Algos;

import java.util.*;

class Pair {
    int weight;
    int node;
    int parent;

    Pair(int weight, int node, int parent) {
        this.weight = weight;
        this.node = node;
        this.parent = parent;
    }
}

public class PrimsAlgo {

    public static void prims(int V, ArrayList<ArrayList<int[]>> adj) {

        // Min Heap (Priority Queue) based on weight
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> a.weight - b.weight);

        boolean[] visited = new boolean[V];

        // (weight, node, parent)
        pq.add(new Pair(0, 0, -1));

        int sum = 0;
        ArrayList<String> mstEdges = new ArrayList<>();

        while (!pq.isEmpty()) {

            Pair current = pq.poll();

            int wt = current.weight;
            int node = current.node;
            int parent = current.parent;

            // Skip if already visited (VERY IMPORTANT)
            if (visited[node]) continue;

            // Mark visited
            visited[node] = true;

            // Add weight
            sum += wt;

            // Store edge (skip for starting node)
            if (parent != -1) {
                mstEdges.add("(" + node + "," + parent + ")");
            }

            // Traverse neighbors
            for (int[] neighbor : adj.get(node)) {
                int adjNode = neighbor[0];
                int edgeWeight = neighbor[1];

                // Only push if not visited
                if (!visited[adjNode]) {
                    pq.add(new Pair(edgeWeight, adjNode, node));
                }
            }
        }

        // Print MST edges
        System.out.println("MST Edges:");
        for (String edge : mstEdges) {
            System.out.println(edge);
        }

        // Print total weight
        System.out.println("Total Weight = " + sum);
    }

    public static void main(String[] args) {

        int V = 5;

        // Adjacency List: (neighbor, weight)
        ArrayList<ArrayList<int[]>> adj = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        // Adding edges (UNDIRECTED GRAPH)

        adj.get(0).add(new int[]{1, 2});
        adj.get(1).add(new int[]{0, 2});

        adj.get(0).add(new int[]{2, 1});
        adj.get(2).add(new int[]{0, 1});

        adj.get(1).add(new int[]{2, 1});
        adj.get(2).add(new int[]{1, 1});

        adj.get(2).add(new int[]{3, 2});
        adj.get(3).add(new int[]{2, 2});

        adj.get(3).add(new int[]{4, 1});
        adj.get(4).add(new int[]{3, 1});

        adj.get(2).add(new int[]{4, 2});
        adj.get(4).add(new int[]{2, 2});

        prims(V, adj);
    }
}
