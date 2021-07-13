package cn.bestlang.algs.offer2;

import java.util.Arrays;

public class IsStraight {
    public boolean isStraight(int[] nums) {
        Arrays.sort(nums);

        int zero = 0;
        int pre = -1;
        int deltaSum = 0;
        for (int num : nums) {
            if (num == 0) {
                zero++;
            } else {
                if (pre != -1) {
                    int delta = num - pre;
                    if (delta == 0) {
                        return false;
                    } else {
                        deltaSum += delta - 1;
                    }
                }
                pre = num;
            }
        }

        return deltaSum <= zero;
    }
}
