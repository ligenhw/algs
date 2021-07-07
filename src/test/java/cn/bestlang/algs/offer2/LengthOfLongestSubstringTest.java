package cn.bestlang.algs.offer2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthOfLongestSubstringTest {

    @Test
    void lengthOfLongestSubstring() {
        String s = "abcabcbb";
        int expected = 3;

        assertEquals(expected, new LengthOfLongestSubstring().lengthOfLongestSubstring(s));
    }

    @Test
    void lengthOfLongestSubstring1() {
        String s = "";
        int expected = 0;

        assertEquals(expected, new LengthOfLongestSubstring().lengthOfLongestSubstring(s));
    }

    @Test
    void lengthOfLongestSubstring2() {
        String s = "bbbbb";
        int expected = 1;

        assertEquals(expected, new LengthOfLongestSubstring().lengthOfLongestSubstring(s));
    }

    @Test
    void lengthOfLongestSubstring3() {
        String s = "dvdf";
        int expected = 3;

        assertEquals(expected, new LengthOfLongestSubstring().lengthOfLongestSubstring(s));
    }
}