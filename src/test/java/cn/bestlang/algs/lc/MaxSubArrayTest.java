package cn.bestlang.algs.lc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxSubArrayTest {

    @Test
    void maxSubArray() {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int expected = 6;
        assertEquals(expected, new MaxSubArray().maxSubArray(nums));
    }

    @Test
    void maxSubArray2() {
        int[] nums = {1};
        int expected = 1;
        assertEquals(expected, new MaxSubArray().maxSubArray(nums));
    }

    @Test
    void maxSubArray3() {
        int[] nums = {-2, 1};
        int expected = 1;
        assertEquals(expected, new MaxSubArray().maxSubArray(nums));
    }

}