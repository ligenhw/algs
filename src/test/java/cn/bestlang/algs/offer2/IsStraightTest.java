package cn.bestlang.algs.offer2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsStraightTest {

    @Test
    void isStraight() {
        int[] nums = {1,2,3,4,5};
        boolean expected = true;

        assertEquals(expected, new IsStraight().isStraight(nums));
    }

    @Test
    void isStraight2() {
        int[] nums = {0,0,1,2,5};
        boolean expected = true;

        assertEquals(expected, new IsStraight().isStraight(nums));
    }

    @Test
    void isStraight3() {
        int[] nums = {0,0,1,2,6};
        boolean expected = false;

        assertEquals(expected, new IsStraight().isStraight(nums));
    }
}