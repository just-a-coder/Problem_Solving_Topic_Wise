package com.problemsolving.greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ChangeMachine {
    private static List findChangesIfPossible(int amount, int arr[]) {
        List<Integer> change = new ArrayList<>();
        for(int i = arr.length - 1; i >= 0; i--){
            int coin = arr[i];
            while((amount / coin) > 0){
                amount = amount - coin;
                change.add(coin);
            }
        }
        return change;
    }


    public static void main(String[] args) {
        int n = 41;
        int arr[] = new int[]{1,5,10,25};
        System.out.println(findChangesIfPossible(n, arr));
    }
}
