package cn.bestlang.algs.offer2s;

public class TwoSum {
    public int[] twoSum(int[] numbers, int target) {
        int lo = 0;
        int hi = numbers.length - 1;
        while (lo < hi) {
            int sum = numbers[lo] + numbers[hi];
            if (sum == target) {
                return new int[]{lo, hi};
            } else if (sum > target) {
                hi--;
            } else {
                lo++;
            }
        }

        return new int[]{};
    }
}
