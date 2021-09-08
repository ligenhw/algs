package cn.bestlang.algs.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SearchMatrixTest {

    @Test
    void searchMatrix() {
        int[][] matrix = {  {1,   4,  7, 11, 15},  {2,   5,  8, 12, 19},  {3,   6,  9, 16, 22},  {10, 13, 14, 17, 24},  {18, 21, 23, 26, 30}};
        int target = 5;
        boolean expected = true;

        assertEquals(expected, new SearchMatrix().searchMatrix(matrix, target));
    }
}