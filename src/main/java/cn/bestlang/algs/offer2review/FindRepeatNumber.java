package cn.bestlang.algs.offer2review;

public class FindRepeatNumber {
    public int findRepeatNumber(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            if (nums[i] == i) {
                i++;
            } else {
                if (nums[i] == nums[nums[i]]) {
                    return nums[i];
                } else {
                    exchange(nums, i, nums[i]);
                }
            }
        }

        return -1;
    }

    private void exchange(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
}
