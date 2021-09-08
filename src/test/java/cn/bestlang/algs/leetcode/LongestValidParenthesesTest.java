package cn.bestlang.algs.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestValidParenthesesTest {

    @Test
    void longestValidParentheses() {
        String s = "(()";
        int expected = 2;

        assertEquals(expected, new LongestValidParentheses().longestValidParentheses(s));
    }

    @Test
    void longestValidParentheses2() {
        String s = ")()())";
        int expected = 4;

        assertEquals(expected, new LongestValidParentheses().longestValidParentheses(s));
    }

    @Test
    void longestValidParentheses3() {
        String s = "";
        int expected = 0;

        assertEquals(expected, new LongestValidParentheses().longestValidParentheses(s));
    }

}