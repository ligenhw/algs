package cn.bestlang.algs.leetcode;

public class MinPathSum {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int[] dp = new int[n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int min = -1;
                if (i > 0) {
                    min = dp[j];
                }
                if (j > 0) {
                    if (min == -1) {
                        min = dp[j - 1];
                    } else {
                        min = Math.min(min, dp[j - 1]);
                    }
                }
                dp[j] = Math.max(0, min) + grid[i][j];
            }
        }

        return dp[n - 1];
    }
}
