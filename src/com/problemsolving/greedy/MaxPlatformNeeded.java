package com.problemsolving.greedy;

import java.util.Arrays;

public class MaxPlatformNeeded {
    public static int minPlatformRequired(int arrival[], int departure[]){
        int platform = 0, i = 0, j = 0, count = 0;
        Arrays.sort(arrival);
        Arrays.sort(departure);
        int len = arrival.length;
        while(i < len){
            // When arrival Time is going to come next
            if(arrival[i] < departure[j]){
                platform = Math.max(platform, ++count);
                i++;
                // When Departure is going to come next.
                // In case of tie, make the departure first then do the arrival.
            }else{
                count--;
                j++;
            }
        }
        return platform;
    }

    public static void main(String[] args) {
        //Example 1
        int arrival[] = {900, 940, 950, 1100, 1500, 1800};
        int departure[] = {910, 1200, 1120, 1130, 1900, 2000};
        int answer  = MaxPlatformNeeded.minPlatformRequired(arrival, departure);
        System.out.println("Minimum Number of Platforms Required for Plan1 = " + answer);
    }
}
