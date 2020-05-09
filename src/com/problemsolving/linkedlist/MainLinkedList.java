package com.problemsolving.linkedlist;


public class MainLinkedList {
    public static void main(String[] args) {
        LinkedList llist = new LinkedList();
        System.out.println("LinkedList isEmpty():"+llist.isEmpty());
        llist.insertAtEnd(7);
        llist.insertAtEnd(3);
        llist.insertAtEnd(1);
        llist.insertAtEnd(1);
        llist.insertAtHead(1);
        llist.insertAtHead(1);
        System.out.println("LinkedList isEmpty():"+llist.isEmpty());
        llist.printSL();
        System.out.println("Current LinkedList");
        llist.search(9);
        System.out.println("Deleting From Head. Deleted Data: "+llist.deleteAtHead());
        System.out.println("Deleting From End. Deleted Data: "+llist.deleteAtEnd());
        System.out.println("After Deleting Printing Linked List");
        llist.printSL();
        System.out.println(" Reversing linkedList");
        llist.reverseASL();
//        llist.insertAtHead(19);
        llist.printSL();
        System.out.println("Detect Cycle: "+llist.detectCycleinSL());
        System.out.println("MiddleNode: "+llist.middleNode());
        llist.removeParticularValue(1);
        llist.printSL();
    }
}
