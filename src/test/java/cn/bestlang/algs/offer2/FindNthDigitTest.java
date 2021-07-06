package cn.bestlang.algs.offer2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindNthDigitTest {

    @Test
    void findNthDigit() {
        int n = 3;
        int expected = 3;
        assertEquals(expected, new FindNthDigit().findNthDigit(n));
    }

    @Test
    void findNthDigit2() {
        int n = 11;
        int expected = 0;
        assertEquals(expected, new FindNthDigit().findNthDigit(n));
    }

    @Test
    void findNthDigit3() {
        int n = 10000;
        int expected = 7;
        assertEquals(expected, new FindNthDigit().findNthDigit(n));
    }
}