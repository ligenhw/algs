package cn.bestlang.algs.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxProductTest {

    @Test
    void maxProduct() {
        int[] nums = {-3,0,1,-2};
        int expected = 1;
        assertEquals(expected, new MaxProduct().maxProduct(nums));
    }
}
