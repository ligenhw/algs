package cn.bestlang.algs.offer2;

public class SpiralOrder {
    public int[] spiralOrder(int[][] matrix) {
        int row = matrix.length;
        if (row == 0) {
            return new int[]{};
        }
        int col = matrix[0].length;
        int[] result = new int[row * col];
        IndexArray ia = new IndexArray(result);
        int startRow = 0;
        int startCol = 0;
        int endRow = row - 1;
        int endCol = col - 1;

        while(endRow >= startRow && endCol >= startCol) {
            around(matrix, startRow, startCol, endRow, endCol, ia);
            startRow++;
            endRow--;
            startCol++;
            endCol--;
        }

        return ia.getData();
    }

    private void around(int[][] matrix, int startRow, int startCol, int endRow, int endCol, IndexArray ia) {
        top(matrix, startRow, startCol, endRow, endCol, ia);
        right(matrix, startRow, startCol, endRow, endCol, ia);
        bottom(matrix, startRow, startCol, endRow, endCol, ia);
        left(matrix, startRow, startCol, endRow, endCol, ia);
    }

    private void top(int[][] matrix, int startRow, int startCol, int endRow, int endCol, IndexArray ia) {
        int col = startCol;
        while(col <= endCol) {
            ia.append(matrix[startRow][col]);
            col++;
        }
    }

    private void right(int[][] matrix, int startRow, int startCol, int endRow, int endCol, IndexArray ia) {
        int row = startRow + 1;
        while(row < endRow) {
            ia.append(matrix[row][endCol]);
            row++;
        }
    }

    private void bottom(int[][] matrix, int startRow, int startCol, int endRow, int endCol, IndexArray ia) {
        int col = endCol;
        while(endRow > startRow && col >= startCol) {
            ia.append(matrix[endRow][col]);
            col--;
        }
    }

    private void left(int[][] matrix, int startRow, int startCol, int endRow, int endCol, IndexArray ia) {
        int row = endRow - 1;
        while(startCol < endCol && row > startRow) {
            ia.append(matrix[row][startCol]);
            row--;
        }
    }

    private static class IndexArray {
        int i;
        int[] data;

        IndexArray(int[] d) {
            data = d;
        }

        void append(int d) {
            data[i++] = d;
        }

        int[] getData() {
            return data;
        }
    }
}
