package cn.bestlang.algs.offer2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MissingNumberTest {

    @Test
    void missingNumber() {
        int[] nums = {0,1,2,3,4,5,6,7,9};
        int expected = 8;
        assertEquals(expected, new MissingNumber().missingNumber(nums));
    }

    @Test
    void missingNumber1() {
        int[] nums = {0};
        int expected = 1;
        assertEquals(expected, new MissingNumber().missingNumber(nums));
    }
}