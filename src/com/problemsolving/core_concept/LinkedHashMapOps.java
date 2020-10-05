package com.problemsolving.core_concept;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedHashMapOps {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> lmap = new LinkedHashMap<>(3);
        lmap.put("a",1);
        lmap.put("b",2);
        lmap.put("c",3);
        lmap.remove("b");
        lmap.put("d",4);
        lmap.put("e",5);
        lmap.put("a",1);
        lmap.put("b",22);

        System.out.println(lmap.get("abc"));

        for(String str: lmap.keySet()){
            System.out.println("Key: "+ str+ " Value: "+lmap.get(str));
        }
    }
}
