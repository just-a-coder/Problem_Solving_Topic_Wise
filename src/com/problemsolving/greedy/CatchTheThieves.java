package com.problemsolving.greedy;

import java.util.ArrayList;
import java.util.List;

public class CatchTheThieves {
    public static int caughtThieves(char arr[], int k){
        int caught = 0;
        List<Integer> police = new ArrayList<>();
        List<Integer> thief = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 'P'){
                police.add(i);
            }else{
                thief.add(i);
            }
        }
        int trackThief = 0, trackPolice = 0;
        while(trackThief < thief.size() && trackPolice < police.size()){
            if(Math.abs(thief.get(trackThief) - police.get(trackPolice)) <= k){
                caught++;
                trackThief++;
                trackPolice++;
            } else if (thief.get(trackThief) < police.get(trackPolice)) {
                trackThief++;
            } else {
                trackPolice++;
            }
        }
        return caught;
    }

    public static void main(String[] args) {
        char arr[] = new char[]{'P','T','T','P','T'};
        int k = 1;
        System.out.println(caughtThieves(arr, k));
    }
}
