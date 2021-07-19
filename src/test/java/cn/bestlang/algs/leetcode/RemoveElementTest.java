package cn.bestlang.algs.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveElementTest {

    @Test
    void removeElement() {
        int[] nums = {3,2,2,3};
        int val = 3;

        int expected = 2;
        assertEquals(expected, new RemoveElement().removeElement(nums, val));
    }

    @Test
    void removeElement2() {
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;

        int expected = 5;
        assertEquals(expected, new RemoveElement().removeElement(nums, val));
    }

    @Test
    void removeElement3() {
        int[] nums = {1};
        int val = 1;

        int expected = 0;
        assertEquals(expected, new RemoveElement().removeElement(nums, val));
    }
}