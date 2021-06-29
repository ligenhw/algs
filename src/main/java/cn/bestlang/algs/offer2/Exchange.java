package cn.bestlang.algs.offer2;

public class Exchange {
    public int[] exchange(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while(left < right) {
            while(left < nums.length && nums[left] % 2 == 1) {
                left++;
            }
            while(right >= 0 && nums[right] % 2 == 0) {
                right--;
            }

            if (left < right) {
                exchange(nums, left, right);
                left++;
                right--;
            }
        }

        return nums;
    }

    private void exchange(int[] nums, int left, int right) {
        int t = nums[left];
        nums[left] = nums[right];
        nums[right] = t;
    }
}
