package com.problemsolving.recursion.codingbat;

public class ArrayOperation {
    public static boolean array6(int[] nums, int index) {
        if(index == nums.length){
            return false;
        }else{
            if(nums[index] == 6){
                return true;
            }else{
                return array6(nums,++index);
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = new int[]{2,6,4};
        System.out.println(array6(arr, 0));
    }
}
