package cn.bestlang.algs.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinPathSumTest {

    @Test
    void minPathSum() {
        int[][] grid = {{1,2,3},{4,5,6}};
        int expected = 12;

        assertEquals(expected, new MinPathSum().minPathSum(grid));
    }

    @Test
    void minPathSum2() {
        int[][] grid = {{1, 2},{1, 1}};
        int expected = 3;

        assertEquals(expected, new MinPathSum().minPathSum(grid));
    }
}