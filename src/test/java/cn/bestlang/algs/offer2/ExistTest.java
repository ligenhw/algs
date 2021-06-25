package cn.bestlang.algs.offer2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ExistTest {

    @Test
    void exist() {
        char[][] board2 = new char[3][4];
        char[][] board = {
                {'A','B','C','E'},
                {'S','F','C','S'},
                {'A','D','E','E'}};
        boolean expected = true;
        assertEquals(expected, new Exist().exist(board, "ABCCED"));
    }
}