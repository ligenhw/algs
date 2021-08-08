package cn.bestlang.algs.leetcode;

public class Rotate {
    public void rotate(int[][] matrix) {
        rotate(matrix, 0, matrix.length - 1, 0);
    }

    private void rotate(int[][] matrix, int start, int end, int row) {
        if (start >= end) {
            return;
        }

        int width = end - start + 1;
        int bottom = row + width - 1;
        for (int i = start; i < end; i++) {
            int t = matrix[row][i];

            matrix[row][i] = matrix[bottom - i + start][start];
            matrix[bottom - i + start][start] = matrix[bottom][end - i + start];
            matrix[bottom][end - i + start] = matrix[row + i - start][end];
            matrix[row + i - start][end] = t;
        }

        rotate(matrix, start + 1, end - 1, row + 1);
    }
}
