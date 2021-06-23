package cn.bestlang.algs.offer2;

public class FindNumberIn2DArray {

    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        int r = matrix.length;
        if (r == 0) {
            return false;
        }
        int[] firstRow = matrix[0];
        int k = bianrySearch(firstRow, target, 0, firstRow.length - 1);
        if (k < 0) {
            return false;
        }
        if (firstRow[k] == target) {
            return true;
        }

        for (int i = 0; i <= k; i++) {
            if (bianrySearchCol(matrix, i, target, 1, matrix.length - 1) > 0) {
                return true;
            }
        }
        return false;
    }

    private int bianrySearch(int[] row, int target, int lo, int hi) {
        if (lo > hi) {
            return hi;
        }

        int mid = (lo + hi) / 2;
        if (row[mid] > target) {
            return bianrySearch(row, target, lo, mid - 1);
        } else if (row[mid] < target) {
            return bianrySearch(row, target, mid + 1, hi);
        } else {
            return mid;
        }
    }

    private int bianrySearchCol(int[][] matrix, int col, int target, int lo, int hi) {
        if (lo > hi) {
            return -1;
        }

        int mid = (lo + hi) / 2;
        if (matrix[mid][col] > target) {
            return bianrySearchCol(matrix, col, target, lo, mid - 1);
        } else if (matrix[mid][col] < target) {
            return bianrySearchCol(matrix, col, target, mid + 1, hi);
        } else {
            return mid;
        }
    }
}
