package cn.bestlang.algs.leetcode;

public class SortColors {
    public void sortColors(int[] nums) {
        int p1 = partition(nums, 0, nums.length - 1, 0);
        if (p1 < nums.length - 1) {
            partition(nums, p1, nums.length - 1, 1);
        }
    }

    private int partition(int[] nums, int start, int end, int key) {
        int left = start;
        int right = end;

        while (left < right) {
            while (left <= end && nums[left] == key) {
                left++;
            }
            while (right >= start && nums[right] != key) {
                right--;
            }
            if (left >= right) {
                return left;
            }
            change(nums, left, right);
            left++;
            end--;
        }
        return left;
    }

    private void change(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
}
