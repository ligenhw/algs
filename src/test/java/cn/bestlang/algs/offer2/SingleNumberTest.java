package cn.bestlang.algs.offer2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingleNumberTest {

    @Test
    void singleNumber() {
        int[] nums = {9,1,7,9,7,9,7};
        int expected = 1;

        assertEquals(expected, new SingleNumber().singleNumber(nums));
    }
}