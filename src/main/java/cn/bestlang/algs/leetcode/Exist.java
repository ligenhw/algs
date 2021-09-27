package cn.bestlang.algs.leetcode;

public class Exist {
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        boolean[][] visited = new boolean[m][n];
        StringBuilder path = new StringBuilder();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (recur(board, i, j, visited, path)) {
                    return true;
                }
            }
        }

        return false;
    }

    private boolean recur(char[][] board, int i, int j, boolean[][] visited, StringBuilder path) {
        if (i < 0 || i > board.length || j < 0 || j > board[0].length || visited[i][j]) {
            return false;
        }

        visited[i][j] = true;
        path.append(board[i][j]);

        boolean result = recur(board, i - 1, j, visited, path)
                || recur(board, i + 1, j, visited, path)
                || recur(board, i, j - 1, visited, path)
                || recur(board, i, j + 1, visited, path);

        visited[i][j] = false;
        path.deleteCharAt(path.length() - 1);
        return result;
    }


}
