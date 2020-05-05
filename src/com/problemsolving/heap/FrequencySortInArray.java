package com.problemsolving.heap;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;

public class FrequencySortInArray {

    HashMap<Integer,Integer> getArrayElemFrequency(int arr[]){
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int a: arr) {
            if (!map.containsKey(a)) {
                map.put(a, 1);
            }else {
                map.put(a, map.get(a)+1);
            }
        }
        return map;
    }

    List<Integer> findSortedElementsInArray(HashMap<Integer, Integer> map) {
        PriorityQueue<Entry> minHeap = new PriorityQueue<>();
        List<Integer> list= new ArrayList<>();

        for(java.util.Map.Entry<Integer, Integer> v : map.entrySet()) {
            minHeap.add(new Entry(v.getKey(), v.getValue()));
        }

        while(minHeap.size()>0)
        {
            Entry v = minHeap.poll();
            list.add(v.getElem());
        }
        return list;
    }

    public static void main(String[] args) {
        int arr[] = {2, 5, 2, 8, 5, 6, 8, 8};

        FrequencySortInArray frq= new FrequencySortInArray();

        HashMap<Integer, Integer> map = frq.getArrayElemFrequency(arr);

        List<Integer> sortedarray = frq.findSortedElementsInArray(map);

        System.out.println(sortedarray);
    }


    class Entry implements Comparable<Entry>{
        private int elem;
        private int freq;

        public Entry(Integer elem, Integer freq) {
            this.elem = elem;
            this.freq = freq;
        }

        public String toString() {
            return this.elem + " " + this.getFreq();
        }

        public int getElem() {
            return elem;
        }
        public void setElem(int elem) {
            this.elem = elem;
        }
        public int getFreq() {
            return freq;
        }
        public void setFreq(int freq) {
            this.freq = freq;
        }

        public Comparator<Entry> freqSort = new Comparator<Entry>() {

            @Override
            public int compare(Entry arg0, Entry arg1) {
                if (arg0.getFreq() == arg1.getFreq()) {
                    return (arg0.getElem() < arg1.getElem()) ? -1 : (arg0.getElem() == arg1.getElem()) ? 0 : 1;
                }else if(arg0.getFreq() < arg1.getFreq()) {
                    return -1;
                }else {
                    return 1;
                }
            }
        };

        @Override
        public int compareTo(Entry o) {
            if (this.getFreq() == o.getFreq()) {
                return (this.getElem() < o.getElem()) ? -1 : (this.getElem() == o.getElem()) ? 0 : 1;
            }else if(this.getFreq() < o.getFreq()) {
                return -1;
            }else {
                return 1;
            }
        }


    }

}
