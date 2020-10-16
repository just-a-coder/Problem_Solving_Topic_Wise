package com.problemsolving.greedy;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class GraphColoringProblem {
}

class Coloring {
    public static void greedyColoring(Graph g) {
        int noOfVertices = g.getVertices();
        int result[] = new int[noOfVertices];
        Arrays.fill(result,-1);
        result[0] = 0;

        boolean available[] = new boolean[noOfVertices];
        Arrays.fill(available, true);
        LinkedList<Integer> lList[] = g.getAdj();
        for(int i = 1; i < noOfVertices; i++ ){

            for(int temp: lList[i]){
                if(result[temp] != -1){
                    available[result[temp]] = false;
                }
            }

            int j;
            for(j = 0; j < noOfVertices; j++){
                if(available[j]){
                    break;
                }
            }

            result[i] = j;
            Arrays.fill(available, true);
        }

        for(int i = 0; i< noOfVertices; i++){
            System.out.println(" Vertices: "+ i+ " Color: "+ result[i]);
        }
    }
}

class Main {
    public static void main(String[] args) {
        Graph g1 = new Graph(5);
        g1.addEdge(0, 1);
        g1.addEdge(0, 2);
        g1.addEdge(1, 2);
        g1.addEdge(1, 3);
        g1.addEdge(2, 3);
        g1.addEdge(3, 4);

        Coloring.greedyColoring(g1);
        System.out.println();

        Graph g2 = new Graph(5);
        g2.addEdge(0, 1);
        g2.addEdge(0, 2);
        g2.addEdge(1, 2);
        g2.addEdge(1, 4);
        g2.addEdge(2, 4);
        g2.addEdge(4, 3);
        Coloring.greedyColoring(g2);
    }
}
