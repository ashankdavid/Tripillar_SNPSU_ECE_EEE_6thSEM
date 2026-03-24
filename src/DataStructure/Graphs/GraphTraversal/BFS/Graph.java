package DataStructure.Graphs.GraphTraversal.BFS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Graph {
    int V;
    Graph(int v){
        this.V = v;
    }

    ArrayList<Integer> bfsTraversal(ArrayList<ArrayList<Integer>> adjList){
        boolean[] visited = new boolean[V];
        ArrayList<Integer> ans = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();

        q.add(0);
        visited[0] = true;

        while(!q.isEmpty()){
            int front = q.poll();
            ans.add(front);

            for(int i : adjList.get(front)){
                if(!visited[i]){
                    visited[i] = true;
                    q.add(i);
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Vertices and Edges: ");
        int v = sc.nextInt();
        int e = sc.nextInt();

        // creating AdjList
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        for(int i=0; i<v; i++){
            adjList.add(new ArrayList<>());
        }

        // Entering Edges in AdjList
        for(int i=0; i<e; i++){
            System.out.print("Enter Edge " + i + ": ");
            int u = sc.nextInt();
            int vertex = sc.nextInt();
            adjList.get(u).add(vertex);
        }
    }
}
