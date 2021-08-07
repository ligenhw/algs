package cn.bestlang.algs.leetcode;

public class UniquePaths {
    public int uniquePaths(int m, int n) {
        int[] dp = new int[n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j == 0) {
                    dp[j] = 1;
                } else {
                    int sum = 0;
                    if (j > 0) {
                        sum += dp[j - 1];
                    }
                    if (i > 0) {
                        sum += dp[j];
                    }
                    dp[j] = sum;
                }
            }
        }

        return dp[n - 1];
    }
}
