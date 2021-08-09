package cn.bestlang.algs.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrapTest {

    @Test
    void trap() {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        int expected = 6;

        assertEquals(expected, new Trap().trap(height));
    }

    @Test
    void trap2() {
        int[] height = {4,2,0,3,2,5};
        int expected = 9;

        assertEquals(expected, new Trap().trap(height));
    }
}