package cn.bestlang.algs.lc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthOfLongestSubstringTest {

    @Test
    void lengthOfLongestSubstring() {
        String s = "abcabcbb";
        int len = new LengthOfLongestSubstring().lengthOfLongestSubstring(s);
        System.out.println(len);
    }

    @Test
    void lengthOfLongestSubstring1() {
        String s = "bbbbb";
        int len = new LengthOfLongestSubstring().lengthOfLongestSubstring(s);
        System.out.println(len);
    }

    @Test
    void lengthOfLongestSubstring2() {
        String s = "pwwkew";
        int len = new LengthOfLongestSubstring().lengthOfLongestSubstring(s);
        System.out.println(len);
    }
}