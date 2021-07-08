package cn.bestlang.algs.offer2;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            int b = binarySearch(nums, target - nums[i], i + 1, nums.length - 1);
            if (b != -1) {
                return new int[] {nums[i], nums[b]};
            }
        }

        return new int[]{};
    }

    private int binarySearch(int[] nums, int target, int l, int r) {
        if (l > r) {
            return -1;
        }

        int mid = (l + r) >> 1;
        if (nums[mid] > target) {
            return binarySearch(nums, target, l, mid - 1);
        } else if (nums[mid] < target) {
            return binarySearch(nums, target, mid + 1, r);
        } else {
            return mid;
        }
    }
}
