package com.problemsolving.binary_search;

import java.util.Arrays;
import java.util.List;

public class FindClosestNumberInSortedArray {

    private static int findClosest(List<Integer> alist, double k) {
        int result = -1;
        int size = alist.size();
        int high = size, low = 0, mid;

        if(k >= alist.get(size-1)) return alist.get(size -1 );
        if(k < alist.get(0)) return alist.get(0);

        while (low <= high) {
            mid = low + (high - low) / 2;
            if (alist.get(mid) == k) {
                return alist.get(mid);
            } else if (alist.get(mid) > k) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        if (Math.abs(k - alist.get(high)) < Math.abs(alist.get(low) - k)) {
            result = alist.get(high);
        } else {
            result = alist.get(low);
        }
        return result;
    }


    public static void main(String[] args) {
        Integer arr[] = new Integer[]{1, 2, 3, 4, 5};
        double k = 6.12;
        System.out.println(findClosest(Arrays.asList(arr), k));
    }
}