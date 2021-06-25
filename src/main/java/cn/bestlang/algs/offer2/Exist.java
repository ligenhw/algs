package cn.bestlang.algs.offer2;

public class Exist {
    public boolean exist(char[][] board, String word) {

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == word.charAt(0)) {
                    boolean[][] visited = new boolean[board.length][board[0].length];
                    if (route(board, i, j, word, 0, visited)) {
                        return true;
                    }
                }
            }
        }

        return false;
    }

    private boolean route(char[][] board, int i, int j, String word, int wi, boolean[][] visited) {
        if (i < 0 || i > board.length - 1 || j < 0 || j > board[0].length - 1 || visited[i][j]) {
            return false;
        }

        char targetC = word.charAt(wi);
        char b = board[i][j];
        if (b != targetC) {
            return false;
        } else if (wi == word.length() - 1) {
            return true;
        } else {
            visited[i][j] = true;
            boolean result = route(board, i - 1, j, word, wi + 1, visited) ||
                    route(board, i + 1, j, word, wi + 1, visited) ||
                    route(board, i, j - 1, word, wi + 1, visited) ||
                    route(board, i, j + 1, word, wi + 1, visited);
            if (!result) {
                visited[i][j] = false;
            }
            return result;
        }
    }
}
