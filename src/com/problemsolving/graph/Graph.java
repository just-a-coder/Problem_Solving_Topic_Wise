package com.problemsolving.graph;

public class Graph {
    // Total Number Of Vertices In Graph
    int vertices;

    ////An array of linked lists to store adjacent vertices.
    DoublyLinkedList<Integer> adjacencyList[];

    public Graph(int vertices) {
        this.vertices = vertices;
        adjacencyList = new DoublyLinkedList[vertices];

        for (int i = 0; i < vertices; i++) {
            adjacencyList[i] = new DoublyLinkedList();
        }
    }

    //Adds an Edge from source vertex to destination vertex
    void addEdge(int source,int destination){
        if (source < vertices && destination < vertices) {
            this.adjacencyList[source].insertAtEnd(destination);

            //for undirected graph uncomment the line below
            //this.adjacencyList[destination].insertAtEnd(source);
        }
    }

    public void printGraph()
    {
        System.out.println(">>Adjacency List of Directed Graph<<");
        for (int i = 0; i < vertices; i++)
        {
            if(adjacencyList[i]!=null){
                System.out.print("|" + i + "| => ");

                DoublyLinkedList<Integer>.Node temp = adjacencyList[i].getHeadNode();
                while (temp != null)
                {
                    System.out.print("[" + temp.data + "] -> ");
                    temp = temp.nextNode;
                }
                System.out.println("null");
            }
            else{
                System.out.println("|" + i + "| => "+ "null");
            }
        }
    }
}