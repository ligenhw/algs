package cn.bestlang.algs.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchRangeTest {

    @Test
    void searchRange() {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;

        int[] expected = {3, 4};

        assertArrayEquals(expected, new SearchRange().searchRange(nums, target));
    }

    @Test
    void searchRange2() {
        int[] nums = {5,7,7,8,8,10};
        int target = 6;

        int[] expected = {-1, -1};

        assertArrayEquals(expected, new SearchRange().searchRange(nums, target));
    }

    @Test
    void searchRange3() {
        int[] nums = {};
        int target = 0;

        int[] expected = {-1, -1};

        assertArrayEquals(expected, new SearchRange().searchRange(nums, target));
    }
}