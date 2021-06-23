package cn.bestlang.algs.offer2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindNumberIn2DArrayTest {

    private FindNumberIn2DArray fa = new FindNumberIn2DArray();

    @Test
    void findNumberIn2DArray1() {
       int[][] matrix = {  {1,   4,  7, 11, 15},  {2,   5,  8, 12, 19},  {3,   6,  9, 16, 22},  {10, 13, 14, 17, 24},  {18, 21, 23, 26, 30}};
       int target = 5;
       boolean expected = true;

       assertEquals(expected, fa.findNumberIn2DArray(matrix, target));
    }

    @Test
    void findNumberIn2DArray2() {
        int[][] matrix = {
                {1,   4,  7, 11, 15},
                {2,   5,  8, 12, 19},
                {3,   6,  9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };
        int target = 20;
        boolean expected = false;

        assertEquals(expected, fa.findNumberIn2DArray(matrix, target));
    }

    @Test
    void findNumberIn2DArray3() {
        int[][] matrix = { {-1}, {-1}};
        int target = -2;
        boolean expected = false;

        assertEquals(expected, fa.findNumberIn2DArray(matrix, target));
    }

    @Test
    void findNumberIn2DArray4() {
        int[][] matrix = { {5}, {6}};
        int target = 6;
        boolean expected = true;

        assertEquals(expected, fa.findNumberIn2DArray(matrix, target));
    }

    @Test
    void findNumberIn2DArray5() {
        int[][] matrix = {{1,2,3,4,5},
                          {6,7,8,9,10},
                          {11,12,13,14,15},
                          {16,17,18,19,20},
                          {21,22,23,24,25}};
        int target = 19;
        boolean expected = true;

        assertEquals(expected, fa.findNumberIn2DArray(matrix, target));
    }

    @Test
    void findNumberIn2DArray6() {
        int[][] matrix = {{}};
        int target = 1;
        boolean expected = false;

        assertEquals(expected, fa.findNumberIn2DArray(matrix, target));
    }
}