package cn.bestlang.algs.offer2;

public class MissingNumber {
    public int missingNumber(int[] nums) {
        return missingNumber(nums, 0, nums.length - 1);
    }

    private int missingNumber(int[] nums, int left, int right) {
        if (left > right) {
            return -1;
        }

        int mid = (left + right) / 2;
        if (nums[mid] == mid) {
            int i = missingNumber(nums, mid + 1, right);
            return i == -1 ? mid + 1 : i;
        } else {
            int i = missingNumber(nums, left, mid - 1);
            return i == -1 ? mid : i;
        }
    }
}
