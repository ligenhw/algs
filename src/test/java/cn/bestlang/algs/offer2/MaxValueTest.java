package cn.bestlang.algs.offer2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxValueTest {

    @Test
    void maxValue() {
        int[][] grid = {  {1,3,1},  {1,5,1},  {4,2,1}};
        int expected = 12;

        assertEquals(expected, new MaxValue().maxValue(grid));
    }
}