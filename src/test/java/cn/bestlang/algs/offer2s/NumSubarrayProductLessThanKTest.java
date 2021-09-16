package cn.bestlang.algs.offer2s;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumSubarrayProductLessThanKTest {

    @Test
    void numSubarrayProductLessThanK() {
        int[] nums = {10,5,2,6};
        int k = 100;
        int expected = 8;

        assertEquals(expected, new NumSubarrayProductLessThanK().numSubarrayProductLessThanK(nums, k));
    }
}