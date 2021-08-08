package cn.bestlang.algs.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class RotateTest {

    @Test
    void rotate() {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] expected = {{7,4,1},{8,5,2},{9,6,3}};

        new Rotate().rotate(matrix);
        assertArrayEquals(expected, matrix);
    }

    @Test
    void rotate2() {
        int[][] matrix = {{1}};
        int[][] expected = {{1}};

        new Rotate().rotate(matrix);
        assertArrayEquals(expected, matrix);
    }

    @Test
    void rotate3() {
        int[][] matrix = {{1, 2}, {3, 4}};
        int[][] expected = {{3, 1}, {4, 2}};

        new Rotate().rotate(matrix);
        assertArrayEquals(expected, matrix);
    }

    @Test
    void rotate4() {
        int[][] matrix = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
        int[][] expected = {{15,13,2,5},{14,3,4,1},{12,6,8,9},{16,7,10,11}};

        new Rotate().rotate(matrix);
        assertArrayEquals(expected, matrix);
    }
}