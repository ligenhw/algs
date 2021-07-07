package cn.bestlang.algs.offer2;

public class ReversePairs {
    public int reversePairs(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            count += rank(nums, 0, i - 1, i);
        }
        return count;
    }

    public int rank(int[] nums, int start, int end, int k) {
        int l = start;
        int r = end;
        int num = nums[k];

        while (l <= r) {
            while (l <= end && nums[l] <= num) {
                l++;
            }
            while (r >= start && nums[r] > num) {
                r--;
            }

            if (l < r) {
                exchange(nums, l, r);
            }
            if (l <= r) {
                l++;
                r--;
            }
        }

        exchange(nums, r + 1, k);

        return end - r;
    }

    private void exchange(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
}
