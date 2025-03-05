package cn.bestlang.algs.lc;

public class MaxSubArray2 {

    // 超出时间限制
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int len = nums.length;
        int[] dp = new int[len];
        for (int i = 0; i < len; i++) {
            dp[i] = nums[i];
            if (nums[i] > maxSum) {
                maxSum = nums[i];
            }
        }

        for (int l = 2; l <= len; l++) {
            for (int i = 0; i <= len - l; i++) {
                int val = nums[i] + dp[i + 1];
                dp[i] = val;
                if (val > maxSum) {
                    maxSum = val;
                }
            }
        }

        return maxSum;
    }

}
