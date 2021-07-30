package cn.bestlang.algs.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TitleToNumberTest {

    @Test
    void titleToNumber() {
        String columnTitle = "A";
        int expected = 1;

        assertEquals(expected, new TitleToNumber().titleToNumber(columnTitle));
    }

    @Test
    void titleToNumber1() {
        String columnTitle = "AB";
        int expected = 28;

        assertEquals(expected, new TitleToNumber().titleToNumber(columnTitle));
    }

    @Test
    void titleToNumber2() {
        String columnTitle = "ZY";
        int expected = 701;

        assertEquals(expected, new TitleToNumber().titleToNumber(columnTitle));
    }
}