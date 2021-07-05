package cn.bestlang.algs.offer2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountDigitOneTest {

    @Test
    void countDigitOne() {
        int n = 12;
        int expected = 5;
        assertEquals(expected, new CountDigitOne().countDigitOne(n));
    }
}