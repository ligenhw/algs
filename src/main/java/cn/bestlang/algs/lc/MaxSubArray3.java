package cn.bestlang.algs.lc;

public class MaxSubArray3 {

    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        for (int num : nums) {
            if (sum < 0) {
                sum = 0;
            }
            sum += num;
            if (sum > maxSum) {
                maxSum = sum;
            }
        }
        return maxSum;
    }

}
