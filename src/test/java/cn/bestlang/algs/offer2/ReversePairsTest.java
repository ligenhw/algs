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

    @Test
    void rank() {
        int[] nums = new int[]{7, 5, 6, 4};
        int rank = new ReversePairs().rank(nums, 0, nums.length - 2, nums.length - 1);
        System.out.println(rank);
        System.out.println(Arrays.toString(nums));
    }

    @Test
    void rank2() {
        int[] nums = new int[]{7, 5, 6, 4};
        int rank = new ReversePairs().rank(nums, 0, 0, 1);
        System.out.println(rank);
        System.out.println(Arrays.toString(nums));
    }
}