package cn.bestlang.algs.leetcode;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class NextPermutationTest {

    @Test
    void nextPermutation() {
        int[] nums = {1, 1, 5};
        int[] expected = {1, 5, 1};
        new NextPermutation().nextPermutation(nums);

        assertArrayEquals(expected, nums);
    }

    @Test
    void nextPermutation2() {
        int[] nums = {1, 5, 4, 1};
        int[] expected = {4, 1, 1, 5};
        new NextPermutation().nextPermutation(nums);

        assertArrayEquals(expected, nums);
    }

    @Test
    void nextPermutation3() {
        int[] nums = {};
        int[] expected = {};
        new NextPermutation().nextPermutation(nums);

        assertArrayEquals(expected, nums);
    }

    @Test
    void nextPermutation4() {
        int[] nums = null;
        int[] expected = null;
        new NextPermutation().nextPermutation(nums);

        assertArrayEquals(expected, nums);
    }

    @Test
    void nextPermutation5() {
        int[] nums = {3, 2, 1};
        int[] expected = {1, 2, 3};
        new NextPermutation().nextPermutation(nums);

        assertArrayEquals(expected, nums);
    }

    @Test
    void nextPermutation6() {
        int[] nums = {1, 3, 2};
        int[] expected = {2, 1, 3};
        new NextPermutation().nextPermutation(nums);

        assertArrayEquals(expected, nums);
    }

    @Test
    void nextPermutation7() {
        int[] nums = {2, 3, 1};
        int[] expected = {3, 1, 2};
        new NextPermutation().nextPermutation(nums);

        assertArrayEquals(expected, nums);
    }

    @Test
    void nextPermutation8() {
        int[] nums = {5,4,7,5,3,2};
        int[] expected = {5,5,2,3,4,7};
        new NextPermutation().nextPermutation(nums);

        assertArrayEquals(expected, nums);
    }

    @Test
    void nextPermutation9() {
        int[] nums = {4,2,0,2,3,2,0};
        int[] expected = {4,2,0,3,0,2,2};
        new NextPermutation().nextPermutation(nums);

        assertArrayEquals(expected, nums);
    }
}