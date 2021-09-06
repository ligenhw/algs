package cn.bestlang.algs.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindKthLargestTest {

    @Test
    void findKthLargest() {
        int[] nums = {3,2,1,5,6,4};
        int k = 2;
        int expected = 5;

//        assertEquals(expected, new FindKthLargest().findKthLargest(nums, k));
    }

    @Test
    void findKthLargest2() {
        int[] nums = {3,2,3,1,2,4,5,5,6};
        int k = 4;
        int expected = 4;

//        assertEquals(expected, new FindKthLargest().findKthLargest(nums, k));
    }
}