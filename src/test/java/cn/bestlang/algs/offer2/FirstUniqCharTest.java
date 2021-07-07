package cn.bestlang.algs.offer2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstUniqCharTest {

    @Test
    void firstUniqChar() {
        String s = "abaccdeff";
        char expected = 'b';
        assertEquals(expected, new FirstUniqChar().firstUniqChar(s));
    }
}