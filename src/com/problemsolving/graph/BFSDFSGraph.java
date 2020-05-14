package com.problemsolving.graph;

import java.util.LinkedList;

public class BFSDFSGraph {
    private int V;
    private LinkedList<Integer> adj[];
    boolean visitedBFS[];
    boolean visitedDFS[];

    public BFSDFSGraph(int v) {
        V = v;
        visitedBFS = new boolean[V];
        visitedDFS = new boolean[V];
        adj = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    void addEdge(int v, int w) {
        adj[v].add(w);
    }

    public static void main(String args[]) {
        BFSDFSGraph g = new BFSDFSGraph(5);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(0, 3);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 4);
        g.addEdge(3, 0);
        g.addEdge(4, 2);

        System.out.println("Following is Breadth First Traversal " + "(starting from vertex 2)");
        g.BFS(2);

        System.out.println("\n Following is Depth First Traversal " + "(starting from vertex 0)");
        g.DFS(0);
    }

    private void BFS(int s) {
        LinkedList<Integer> queue = new LinkedList<>();

        visitedBFS[s] = true;
        queue.add(s);

        while (!queue.isEmpty()) {
            s = queue.poll();
            System.out.print(" -> "+s);
            for (Integer in : adj[s]) {
                if (!visitedBFS[in]) {
                    visitedBFS[in] = true;
                    queue.add(in);
                }
            }
        }
    }

    private void DFS(int vertex) {
        visitedDFS[vertex] = true;
        System.out.print(" -> "+vertex);
        for (Integer in : adj[vertex]) {
            if (!visitedDFS[in]) {
                DFS(in);
            }
        }
    }
}
