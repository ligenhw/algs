package cn.bestlang.algs.offer2;

public class MaxValue {
    public int maxValue(int[][] grid) {
        int[][] cache = new int[grid.length][grid[0].length];

        return maxValue(grid, 0, 0, cache);
    }

    private int maxValue(int[][] grid, int i, int j, int[][] cache) {
        if (i >= grid.length || j >= grid[0].length) {
            return 0;
        }
        if (i == grid.length && j == grid[0].length) {
            return grid[i][j];
        }

        if (cache[i][j] > 0) {
            return cache[i][j];
        }

        int down = maxValue(grid, i + 1, j, cache);
        int right = maxValue(grid, i, j + 1, cache);

        int value = grid[i][j] + Math.max(down, right);
        cache[i][j] = value;
        return value;
    }
}
