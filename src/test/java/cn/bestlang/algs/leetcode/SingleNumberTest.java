package cn.bestlang.algs.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SingleNumberTest {
    @Test
    void singleNumber() {
        int[] nums = {2,2,1};
        int expected = 1;

        assertEquals(expected, new SingleNumber().singleNumber(nums));
    }

    @Test
    void singleNumber2() {
        System.out.println(0 ^ 30);
    }
}
