package cn.bestlang.algs.leetcode;

public class CanJump {
    public boolean canJump(int[] nums) {
        int canJump = 1;

        for (int i = 0; i < nums.length - 1; i++) {
            canJump = Math.max(canJump - 1, nums[i]);
            if (canJump == 0) {
                return false;
            }
        }

        return true;
    }
}
