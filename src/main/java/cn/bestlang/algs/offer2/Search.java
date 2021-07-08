package cn.bestlang.algs.offer2;

public class Search {
    public int search(int[] nums, int target) {
        int l = lBinarySearch(nums, target, 0, nums.length - 1, true);
        int r = lBinarySearch(nums, target, 0, nums.length - 1, false);

        return l == -1 ? 0 : r - l + 1;
    }

    private int lBinarySearch(int[] nums, int target, int left, int right, boolean min) {
        if (left > right) {
            return -1;
        }

        int mid = (left + right) / 2;
        if (nums[mid] < target) {
            return lBinarySearch(nums, target, mid + 1, right, min);
        } else if (nums[mid] > target) {
            return lBinarySearch(nums, target, left, mid - 1, min);
        } else {
            int i;
            if (min) {
                i = lBinarySearch(nums, target, left, mid - 1, min);
            } else {
                i = lBinarySearch(nums, target, mid + 1, right, min);
            }
            return i == -1 ? mid : i;
        }
    }
}
