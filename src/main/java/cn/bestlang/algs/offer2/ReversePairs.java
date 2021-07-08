package cn.bestlang.algs.offer2;

import java.util.Arrays;

public class ReversePairs {
    public int reversePairs(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int[] copy = Arrays.copyOf(nums, nums.length);

        return reversePairs(nums, copy, 0, nums.length - 1);
    }

    private int reversePairs(int[] nums, int[] copy, int start, int end) {
        if (start >= end) {
            return 0;
        }

        int mid = (start + end) / 2;
        int left = reversePairs(nums, copy, start, mid);
        int right = reversePairs(nums, copy, mid + 1, end);

        int merge = merge(nums, copy, start, mid, end);
        return left + right + merge;
    }

    private int merge(int[] nums, int[] copy, int start, int mid, int end) {
        for (int i = start; i <= end; i++) {
            copy[i] = nums[i];
        }

        int count = 0;
        int left = start;
        int right = mid + 1;
        for (int i = start; i <=end; i++) {
            if (left > mid) {
                nums[i] = copy[right++];
            } else if (right > end) {
                nums[i] = copy[left++];
            } else if (copy[left] > copy[right]) {
                nums[i] = copy[right++];
                count += mid - left + 1;
            } else {
                nums[i] = copy[left++];
            }
        }

        return count;
    }

}
