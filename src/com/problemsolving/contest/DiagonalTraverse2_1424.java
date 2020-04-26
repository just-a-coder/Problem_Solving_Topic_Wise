package com.problemsolving.contest;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// TODO Not Correct Some Edge Cases are not working

public class DiagonalTraverse2_1424 {
    public static int[] findDiagonalOrder(List<List<Integer>> nums) {
        int len = nums.size();
        int jlen = nums.get(len-1).size();
        int res[] = new int[len];
        List<Integer> alist = new ArrayList<>();

        for (int i = 0; i < len; i++) {
            for (int j = 0, k = i; j <= i; k--, j++) {
                List<Integer> innerlist = nums.get(k);
                jlen = Math.max(len,innerlist.size());
                if (innerlist.size() > j) {
                    int num = innerlist.get(j);
                    alist.add(num);
                }
            }
        }
        jlen = Math.max(nums.get(len-1).size(), jlen);
        for (int j = 1; j < jlen; j++) {
            for (int i = len-1, k=j; k <= jlen-1 && i>=0;i--,k++) {
                List<Integer> innerlist = nums.get(i);
                if (innerlist.size() > k) {
                    int num = innerlist.get(k);
                    alist.add(num);
                }
            }
        }

        return alist.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }

    public static void main(String[] args) {
        int arr[][] = new int[][]{{1, 2, 3, 4, 5, 6}};
        List<List<Integer>> lists = new ArrayList<>();
        for (int[] ints : arr) {
            List<Integer> list = new ArrayList<>();
            for (int i : ints) {
                list.add(i);
            }
            lists.add(list);
        }
        System.out.println(Arrays.toString(findDiagonalOrder(lists)));
    }
}

//[1,6,2,8,7,3,9,4,12,10,5,13     11,14,15,16]