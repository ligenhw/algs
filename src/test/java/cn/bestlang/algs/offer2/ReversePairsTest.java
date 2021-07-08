package cn.bestlang.algs.offer2;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ReversePairsTest {

    @Test
    void reversePairs() {
        int[] nums = new int[]{7, 5, 6, 4};
        int expected = 5;
        assertEquals(expected, new ReversePairs().reversePairs(nums));
    }
}