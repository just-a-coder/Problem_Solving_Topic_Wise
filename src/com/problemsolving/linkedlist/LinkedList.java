package com.problemsolving.linkedlist;

public class LinkedList {
    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    Node headNode;
    public int size;

    public LinkedList() {
        headNode = null;
        size = 0;
    }

    // Print Singly Linked List
    void printSL() {
        if (headNode == null)
            return;
        Node node = headNode;
        while (node != null) {
            System.out.print(node.data + " -> ");
            node = node.next;
        }
        System.out.println("NULL");
    }

    //Append Node in Singly Linked List
    int insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (headNode == null) {
            headNode = newNode;
            return headNode.data;
        } else {
            Node node = headNode;
            while (node.next != null) {
                node = node.next;
            }
            node.next = newNode;
        }
        return newNode.data;
    }

    int insertAtHead(int data){
        Node newNode = new Node(data);
        if (headNode == null) {
            headNode = newNode;
            return headNode.data;
        } else {
            newNode.next = headNode;
            headNode = newNode;
        }
        return newNode.data;
    }

    void search(int data){
        int index = 1;
        Node node = headNode;
        while (node != null) {
            if (node.data == data) {
                System.out.println("Found Data: "+data+" at Index: "+index);
            }
            node = node.next;
            index++;
        }
    }

    boolean isEmpty() {
        if (headNode == null) {
            return true;
        } else {
            return false;
        }
    }

    int deleteAtHead(){
        int deletedData = 0;
        if (headNode == null) {
            return deletedData;
        } else {
            deletedData = headNode.data;
            headNode = headNode.next;
        }
        return deletedData;
    }

    int deleteAtEnd(){
        int deletedData = 0;
        Node currNode = headNode;
        Node prevNode = headNode;
        if (headNode == null) {
            return deletedData;
        } else {
            while (currNode.next != null) {
                prevNode = currNode;
                currNode = currNode.next;
            }
            deletedData = currNode.data;
            prevNode.next = null;
        }
        return deletedData;
    }

    void reverseASL() {
        Node previous = null;
        Node currNode = headNode;
        Node nxtNode = null;
        if(currNode == null) return;

        while (currNode != null) {
            nxtNode = currNode.next;
            currNode.next = previous;
            previous = currNode;
            currNode = nxtNode;
        }
        headNode = previous;
    }

    boolean detectCycleinSL() {
        Node fastPtr = headNode;
        Node slowPtr = headNode;
        while (fastPtr!= null && fastPtr.next != null) {
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;

            if(fastPtr == slowPtr) return true;
        }
        return false;
    }

    int middleNode() {
        Node fastPtr = headNode;
        Node slowPtr = headNode;
        while (fastPtr != null && fastPtr.next !=null) {
            fastPtr = fastPtr.next.next;
            if(fastPtr != null){
                //then mid jumps 1 node
                //mid is always halfway behind current
                slowPtr = slowPtr.next;
            }
        }
        return slowPtr.data;
    }

    Node removeParticularValue(int data) {
        Node node = headNode;
        while (node != null && node.data == data) {
            headNode = node.next;
            node = node.next;
        }
        if (headNode == null) {
            return headNode;
        }
        while (node.next != null) {
            if (node.next.data == data) {
                node.next = node.next.next;
            } else {
                node = node.next;
            }
        }
        return headNode;
    }
}
