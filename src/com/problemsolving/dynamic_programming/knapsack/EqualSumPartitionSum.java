package com.problemsolving.dynamic_programming.knapsack;

public class EqualSumPartitionSum {
    public static boolean canPartition(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }

        if (sum % 2 == 0) {
            return findSumOfPartition(nums, nums.length, sum / 2);
        } else {
            return false;
        }
    }

    private static boolean findSumOfPartition(int nums[], int n, int sum) {
        boolean dp[][] = new boolean[n + 1][sum + 1];
        for (int i = 1; i < n + 1; i++) {
            dp[i][0] = true;
            for (int j = 1; j < sum + 1; j++) {
                if (nums[i - 1] <= j) {
                    dp[i][j] = dp[i - 1][j] || (dp[i - 1][j - nums[i - 1]]);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[n][sum];
    }

    public static void main(String[] args) {
        int arr[] = new int[]{1, 5, 5, 11};
        System.out.println(canPartition(arr));
    }
}
