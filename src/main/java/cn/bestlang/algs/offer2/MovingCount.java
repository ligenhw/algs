package cn.bestlang.algs.offer2;

public class MovingCount {
    public int movingCount(int m, int n, int k) {
        boolean[][] visited = new boolean[m][n];
        dfs(0, 0, m, n, k, visited);

        return countVisited(visited);
    }

    private void dfs(int i, int j, int m, int n, int k, boolean[][] visited) {
        if (i < 0 || i >= m || j < 0 || j >= n || visited[i][j] || beyondK(i, j, k)) {
            return;
        }

        visited[i][j] = true;

        dfs(i - 1, j, m, n, k, visited);
        dfs(i + 1, j, m, n, k, visited);
        dfs(i, j - 1, m, n, k, visited);
        dfs(i, j + 1, m, n, k, visited);
    }

    private int countVisited(boolean[][] visited) {
        int count = 0;
        for (int i = 0; i < visited.length; i++) {
            for (int j = 0; j < visited[0].length; j++) {
                if (visited[i][j]) {
                    count++;
                }
            }
        }

        return count;
    }

    boolean beyondK(int i, int j, int k) {
        return numSum(i) + numSum(j) > k;
    }

    int numSum(int n) {
        int remain = n;
        int sum = 0;
        while (remain != 0) {
            sum += remain % 10;
            remain /= 10;
        }

        return sum;
    }
}
