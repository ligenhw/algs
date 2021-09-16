package cn.bestlang.algs.offer2s;

public class MinSubArrayLen {
    public int minSubArrayLen(int target, int[] nums) {
        int lo = 0;
        int hi = 0;
        int minLen = 0;

        int sum = nums[0];
        int len = nums.length;
        while (hi < len) {
            if (sum >= target) {
                minLen = minLen == 0 ? hi - lo + 1 : Math.min(minLen, hi - lo + 1);
                if (lo < hi) {
                    sum -= nums[lo];
                    lo++;
                } else {
                    break;
                }
            } else {
                hi++;
                if (hi < len) {
                    sum += nums[hi];
                }
            }
        }

        return minLen;
    }
}
