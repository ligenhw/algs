package cn.bestlang.algs.leetcode;

public class MaxProduct {
    public int maxProduct(int[] nums) {
        int len = nums.length;
        int max = nums[0];
        for (int i = 0; i < len; i++) {
            int subResult = 1;
            for (int j = i; j < len; j++) {
                subResult *= nums[j];
                max = Math.max(max, subResult);
            }
        }

        return max;
    }
}
