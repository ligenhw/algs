package cn.bestlang.algs.lc;

public class MaxSubArray {

    // 超出内存限制 dp[][]
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int len = nums.length;
        int[][] dp = new int[len][len];
        for (int i = 0; i < len; i++) {
            dp[i][i] = nums[i];
            if (nums[i] > maxSum) {
                maxSum = nums[i];
            }
        }

        for (int l = 2; l <= len; l++) {
            for (int i = 0; i <= len - l; i++) {
                int val = nums[i] + dp[i + 1][i + l - 1];
                dp[i][i + l - 1] = val;
                if (val > maxSum) {
                    maxSum = val;
                }
            }
        }

        return maxSum;
    }

}
