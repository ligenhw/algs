package cn.bestlang.algs.offer2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    @Test
    void twoSum() {
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] expected = {2, 7};
        assertArrayEquals(expected, new TwoSum().twoSum(nums, target));
    }
}