package cn.bestlang.algs.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CanJumpTest {

    @Test
    void canJump() {
        int[] nums = {2,3,1,1,4};
        boolean expected = true;
        assertEquals(expected, new CanJump().canJump(nums));
    }

    @Test
    void canJump2() {
        int[] nums = {3,2,1,0,4};
        boolean expected = false;
        assertEquals(expected, new CanJump().canJump(nums));
    }

    @Test
    void canJump3() {
        int[] nums = {0, 1};
        boolean expected = false;
        assertEquals(expected, new CanJump().canJump(nums));
    }

    @Test
    void canJump4() {
        int[] nums = {0};
        boolean expected = true;
        assertEquals(expected, new CanJump().canJump(nums));
    }
}