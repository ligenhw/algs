package cn.bestlang.algs.offer2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LastRemainingTest {

    @Test
    void lastRemaining() {
        int n = 5;
        int m = 3;

        int expected = 3;

        assertEquals(expected, new LastRemaining().lastRemaining(n, m));
    }

    @Test
    void lastRemaining2() {
        int n = 10;
        int m = 17;

        int expected = 2;

        assertEquals(expected, new LastRemaining().lastRemaining(n, m));
    }

    @Test
    void lastRemaining3() {
        int n = 9;
        int m = 13;

        int expected = 1;

        assertEquals(expected, new LastRemaining().lastRemaining(n, m));
    }
}