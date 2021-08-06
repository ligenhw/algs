package cn.bestlang.algs.leetcode;

import java.util.Arrays;

public class NextPermutation {
    public void nextPermutation(int[] nums) {
        if (nums == null || nums.length < 2) {
            return;
        }

        int max = nums[nums.length - 1];
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] >= max) {
                max = nums[i];
            } else {
                Arrays.sort(nums, i + 1, nums.length);
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] < nums[j]) {
                        exchange(nums, i, j);
                        return;
                    }
                }
            }
        }
        Arrays.sort(nums);
    }

    private void exchange(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
}
