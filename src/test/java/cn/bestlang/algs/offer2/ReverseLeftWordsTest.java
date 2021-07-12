package cn.bestlang.algs.offer2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseLeftWordsTest {

    @Test
    void reverseLeftWords() {
        String s = "abcdefg";
        int n = 2;
        String expected = "cdefgab";

        assertEquals(expected, new ReverseLeftWords().reverseLeftWords(s, n));
    }
}