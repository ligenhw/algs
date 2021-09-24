package cn.bestlang.algs.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortedArrayTest {

    @Test
    void merge() {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        int m = 3;
        int n = 3;

        int[] result = {1, 2, 2, 3, 5, 6};

        new MergeSortedArray().merge(nums1, m, nums2, n);
        assertArrayEquals(result, nums1);
    }
}