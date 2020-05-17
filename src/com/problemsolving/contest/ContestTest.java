package com.problemsolving.contest;

import com.problemsolving.heap.FrequencySort;

import java.util.*;

public class ContestTest {

    public static List<Integer> peopleIndexes(List<List<String>> favoriteCompanies) {
        List<Integer> li = new ArrayList<>();
        Set<Integer> hset = new HashSet<>();
        int outerlen = favoriteCompanies.size();
        for (int i = 0; i < outerlen-1; i++) {
            for (int j = i+1; j<outerlen;j++){
                int ilen = favoriteCompanies.get(i).size();
                int jlen = favoriteCompanies.get(j).size();
                if(ilen == jlen){
                    if (favoriteCompanies.get(i).containsAll(favoriteCompanies.get(j)) && !hset.contains(j)) {
                        hset.add(j);
                    } else if (favoriteCompanies.get(j).containsAll(favoriteCompanies.get(i))&& !hset.contains(i)) {
                        hset.add(i);
                    }
                } else if (ilen > jlen) {
                    if (favoriteCompanies.get(i).containsAll(favoriteCompanies.get(j)) && !hset.contains(j)) {
                        hset.add(j);
                    }
                } else {
                    if (favoriteCompanies.get(j).containsAll(favoriteCompanies.get(i))&& !hset.contains(i)) {
                        hset.add(i);
                    }
                }
            }
        }
        for (int i = 0; i < outerlen; i++) {
            if (!hset.contains(i)) {
                li.add(i);
            }
        }
        return li;
    }

    public static void main(String[] args) {
        // [["leetcode","google","facebook"],["leetcode","amazon"],["facebook","google"]]
        List<String> list1 = new ArrayList<>();
        list1.add("leetcode");
        list1.add("google");
        list1.add("facebook");
        List<String> list2 = new ArrayList<>();
        list2.add("leetcode");
        list2.add("amazon");
        List<String> list3 = new ArrayList<>();
        list3.add("facebook");
        list3.add("google");

        List<List<String>> favourites = new ArrayList<>();
        favourites.add(list1);
        favourites.add(list2);
        favourites.add(list3);

        System.out.println(Arrays.toString(peopleIndexes(favourites).toArray()));
    }
}