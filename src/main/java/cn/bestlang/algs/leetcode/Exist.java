package cn.bestlang.algs.leetcode;

public class Exist {
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        boolean[][] visited = new boolean[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (recur(board, i, j, visited, word, 0)) {
                    return true;
                }
            }
        }

        return false;
    }

    private boolean recur(char[][] board, int i, int j, boolean[][] visited, String word, int index) {
        if (index == word.length()) {
            return true;
        }

        if (i < 0 || i > board.length - 1 || j < 0 || j > board[0].length - 1 || visited[i][j] || board[i][j] != word.charAt(index)) {
            return false;
        }

        visited[i][j] = true;
        boolean result = recur(board, i - 1, j, visited, word, index + 1)
                || recur(board, i + 1, j, visited, word, index + 1)
                || recur(board, i, j - 1, visited, word, index + 1)
                || recur(board, i, j + 1, visited, word, index + 1);

        visited[i][j] = false;
        return result;
    }

}
