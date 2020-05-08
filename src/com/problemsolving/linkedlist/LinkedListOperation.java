/*
package com.problemsolving.linkedlist;

public class LinkedListOperation {

    */
/**
     * Delete Node without Head Pointer
     *//*

    void deleteNode(Node node) {
        if (node.next != null) {
            node.data = node.next.data;
            node.next = node.next.next;
        }
    }

    public Node addOne(Node head) {
        Node node = head;
        recursiveAddOne(node, 1);
        Node revNode = reverseList(node);
        return revNode;
    }

    Node reverseList(Node head)
    {
        Node prev = null;
        Node current = head;
        Node next = null;
        while (current != null)
        {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    public void recursiveAddOne(Node node, int carry) {
        if (node == null)
            return;
        int sum = node.data + carry;
        carry = sum / 10;
        node.data = sum % 10;
        recursiveAddOne(node.next,carry);
    }

    public Node recAdd(Node node, int carry) {
        if (node.next == null) {
            int sum = node.data + 1;
            if (sum > 9) {
                node.data = sum % 10;
                carry = 1;
            } else {
                node.data = sum;
            }
            return node;
        } else {
            int sum = node.data + carry;
            if (sum > 9) {
                node.data = sum % 10;
                carry = 1;
            } else {
                node.data = sum;
                carry = 0;
            }
            recAdd(node.next, carry);
        }

        return node;
    }
}
*/
