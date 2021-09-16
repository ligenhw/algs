package cn.bestlang.algs.offer2s;

public class NumSubarrayProductLessThanK {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int result = 1;
        int left = 0;
        int count = 0;

        for (int right = 0; right < nums.length; right++) {
            result *= nums[right];
            while (left <= right && result >= k) {
                result /= nums[left];
                left++;
            }

            count += right - left + 1;
        }
        return count;
    }
}
