package cn.bestlang.algs.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExistTest {
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

    @Test
    void exist2() {
        char[][] board = {
                {'a','a','b','a','a','b'},
                {'a','a','b','b','b','a'},
                {'a','a','a','a','b','a'},
                {'b','a','b','b','a','b'},
                {'a','b','b','a','b','a'},
                {'b','a','a','a','a','b'}};
        boolean expected = false;
        assertEquals(expected, new Exist().exist(board, "bbbaabbbbbab"));
    }

    @Test
    void exist3() {
        char[][] board = {
                {'a'}
        };
        boolean expected = true;
        assertEquals(expected, new Exist().exist(board, "a"));
    }
}
