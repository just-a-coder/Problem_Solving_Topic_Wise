package com.problemsolving.graph;

import java.util.ArrayList;
import java.util.LinkedList;

public class Graph {
    private int vertices;
    private LinkedList<Integer> adjList;

    static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    static void printGraph(ArrayList<ArrayList<Integer>> adj) {
        for (int i = 0; i < adj.size(); i++) {
            System.out.print(" Adjacency List of Vertex i: "+i);
            for (int j = 0; j < adj.get(i).size(); j++) {
                System.out.print(" -> "+adj.get(i).get(j));
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int V = 4;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();

        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        // Adding Edges
        addEdge(adj, 0, 1);
        addEdge(adj, 0, 2);
        addEdge(adj, 0, 3);
        addEdge(adj, 1, 2);

        printGraph(adj);
    }
}
