package cn.bestlang.algs.leetcode;

public class UniquePathsWithObstacles {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[] dp = new int[n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (obstacleGrid[i][j] == 1) {
                    dp[j] = 0;
                } else {
                    int count = 0;
                    if (i > 0) {
                        count += dp[j];
                    }
                    if (j > 0) {
                        count += dp[j - 1];
                    }
                    if (i == 0 && j == 0) {
                        count = 1;
                    }
                    dp[j] = count;
                }
            }
        }

        return dp[n - 1];
    }
}
