package cn.bestlang.algs.offer2s;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinSubArrayLenTest {

    @Test
    void minSubArrayLen() {
        int target = 7;
        int[] nums = {2,3,1,2,4,3};
        int expected = 2;

        assertEquals(expected, new MinSubArrayLen().minSubArrayLen(target, nums));
    }

    @Test
    void minSubArrayLen2() {
        int target = 4;
        int[] nums = {1, 4, 4};
        int expected = 1;

        assertEquals(expected, new MinSubArrayLen().minSubArrayLen(target, nums));
    }

    @Test
    void minSubArrayLen3() {
        int target = 11;
        int[] nums = {1,1,1,1,1,1,1,1};
        int expected = 0;

        assertEquals(expected, new MinSubArrayLen().minSubArrayLen(target, nums));
    }
}