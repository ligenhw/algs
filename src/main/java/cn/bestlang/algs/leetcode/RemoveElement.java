package cn.bestlang.algs.leetcode;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        if (nums.length == 0) {
            return 0;
        }

        int len = nums.length;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            while (start < len && nums[start] != val) {
                start++;
            }
            while (end > 0 && nums[end] == val) {
                end--;
            }

            if (start < end) {
                exchange(nums, start, end);
                start++;
                end--;
            }
            if (start >= len || end <= 0) break;
        }

        return start;
    }

    private void exchange(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
}
