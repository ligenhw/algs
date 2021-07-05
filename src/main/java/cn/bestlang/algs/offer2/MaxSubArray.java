package cn.bestlang.algs.offer2;

public class MaxSubArray {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int num : nums) {
            if (sum < 0) {
                sum = num;
                maxSum = Math.max(num, maxSum);
            } else {
                sum += num;
                maxSum = Math.max(sum, maxSum);
            }
        }

        return maxSum;
    }
}
