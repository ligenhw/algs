package cn.bestlang.algs.lc;

public class TwoSum {

    public int[] twoSum(int[] price, int target) {
        for (int i = 0; i < price.length; i++) {
            int index = binarySearch(price, i + 1, price.length - 1, target - price[i]);
            if (index != -1) {
                return new int[] {price[i], price[index]};
            }
        }
        return new int[2];
    }

    public int binarySearch(int[] nums, int lo, int hi, int target) {
        if (lo > hi) {
            return -1;
        }

        int mid = (lo + hi) / 2;
        if (nums[mid] == target) {
            return mid;
        } else if (nums[mid] > target) {
            return binarySearch(nums, lo, mid - 1, target);
        } else {
            return binarySearch(nums, mid + 1, hi, target);
        }
    }
}
