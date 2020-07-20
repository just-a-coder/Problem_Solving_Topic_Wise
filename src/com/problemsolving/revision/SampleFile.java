package com.problemsolving.revision;

import java.util.TreeMap;

public class SampleFile {
    public int longestSubarray(int[] nums, int limit) {
        TreeMap<Integer, Integer> tmap = new TreeMap<>();
        int result = 0, start = 0;
        for(int i = 0; i< nums.length; i++){
            tmap.put(nums[i],tmap.getOrDefault(nums[i],0)+1);

            while(tmap.lastKey() - tmap.firstKey() > limit){
                int freq = tmap.get(nums[start]);
                if(freq == 1){
                    tmap.remove(nums[start]);
                }else{
                    tmap.put(nums[start], --freq);
                }
                start++;
            }

            result = Math.max(result, i-start+1);
        }
        return result;
    }



    public static void main(String[] args) {
        int arr[] = new int[]{4,2,2,2,4,4,2,2};
        int k = 0;
        SampleFile ob = new SampleFile();
        System.out.println(ob.longestSubarray(arr, k));
    }
}
