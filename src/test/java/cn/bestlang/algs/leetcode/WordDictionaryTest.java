package cn.bestlang.algs.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordDictionaryTest {

    @Test
    void addWord() {
        WordDictionary wd = new WordDictionary();
        wd.addWord("a");
        wd.addWord("a");
        boolean result = wd.search(".a");
        System.out.println(result);
    }

    @Test
    void addWord2() {
        WordDictionary wd = new WordDictionary();
        wd.addWord("a");
        wd.addWord("ab");
        boolean result = wd.search("a");
        System.out.println(result);
    }
}