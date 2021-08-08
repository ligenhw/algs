package cn.bestlang.algs.leetcode;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WordBreakTest {

    @Test
    void wordBreak() {
        String s = "leetcode";
        List<String> wordDict = Arrays.asList("leet", "code");

        boolean expected = true;
        assertEquals(expected, new WordBreak().wordBreak(s, wordDict));
    }

    @Test
    void wordBreak2() {
        String s = "a";
        List<String> wordDict = Arrays.asList("b");

        boolean expected = false;
        assertEquals(expected, new WordBreak().wordBreak(s, wordDict));
    }
}