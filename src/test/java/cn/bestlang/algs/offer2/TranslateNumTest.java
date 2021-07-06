package cn.bestlang.algs.offer2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TranslateNumTest {

    @Test
    void translateNum() {
        int num = 12258;
        int expected = 5;

        assertEquals(expected, new TranslateNum().translateNum(num));
    }

    @Test
    void translateNum1() {
        int num = 0;
        int expected = 1;

        assertEquals(expected, new TranslateNum().translateNum(num));
    }

    @Test
    void translateNum2() {
        int num = 506;
        int expected = 1;

        assertEquals(expected, new TranslateNum().translateNum(num));
    }
}