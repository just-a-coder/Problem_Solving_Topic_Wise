package com.problemsolving.system_design;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/*
// Using LinkedHashMap... Probably Won't Be Used...
public class LRUCache extends LinkedHashMap<Integer, Integer> {
    private int capacity;

    public LRUCache(int capacity) {
        super(capacity, 0.75f, true);
        this.capacity = capacity;
    }

    public int get(int key) {
        return super.getOrDefault(key, -1);
    }

    public void put(int key, int value) {
        super.put(key, value);
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
        return size() > capacity;
    }
}*/

class Node{
    int key;
    int value;
    Node prev;
    Node next;

    public Node(int key, int value){
        this.key = key;
        this.value = value;
    }
}


class LRUCache {

    int capacity;
    Node head = null;
    Node tail = null;
    Map<Integer, Node> map = new HashMap<>();

    public LRUCache(int capacity) {
        this.capacity = capacity;
    }

    public int get(int key) {
        if (map.containsKey(key)) {
            Node nd = map.get(key);
            delete(nd);
            setHead(nd);
            return nd.value;
        }
        return -1;
    }

    // Delete Node
    public void delete(Node node){
        if (node.prev == null) {
            head = node.next;
        } else {
            node.prev.next = node.next;
        }

        if (node.next == null) {
            tail = node.prev;
        } else {
            node.next.prev = node.prev;
        }
    }

    public void setHead(Node node){
        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node;
        }
        head = node;
        if(tail == null){
            tail = head;
        }
    }

    public void put(int key, int value) {
        if (map.containsKey(key)) {
            Node old = map.get(key);
            old.value = value;
            delete(old);
            setHead(old);
        } else {
            Node temp = new Node(key,value);
            if (map.size() >= capacity) {
                map.remove(tail.key);
                delete(tail);
            }
            setHead(temp);
            map.put(key,temp);
        }
    }
}