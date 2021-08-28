package cn.bestlang.algs.leetcode;

public class RunningSum {
    public int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int res = 0;
            if (i > 0) {
                res += result[i - 1];
            }
            result[i] = res + nums[i];
        }

        return result;
    }
}
