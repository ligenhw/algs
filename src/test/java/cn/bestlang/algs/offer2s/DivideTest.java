package cn.bestlang.algs.offer2s;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivideTest {

    @Test
    void divide() {
        int a = 15;
        int b = 2;
        int expected = a / b;

        assertEquals(expected, new Divide().divide(a, b));
    }

    @Test
    void divide2() {
        int a = 7;
        int b = -3;
        int expected = a / b;

        assertEquals(expected, new Divide().divide(a, b));
    }

    @Test
    void divide3() {
        int a = 0;
        int b = 1;
        int expected = a / b;

        assertEquals(expected, new Divide().divide(a, b));
    }

    @Test
    void divide4() {
        int a = 1;
        int b = 1;
        int expected = a / b;

        assertEquals(expected, new Divide().divide(a, b));
    }

    @Test
    void divide5() {
        int a = -2147483648;
        int b = -1;
        int expected = 2147483647;

        assertEquals(expected, new Divide().divide(a, b));
    }

    @Test
    void divide6() {
        int a = 2147483647;
        int b = 1;
        int expected = 2147483647;

        assertEquals(expected, new Divide().divide(a, b));
    }

    @Test
    void divide7() {
        int a = -2147483648;
        int b = 1;
        int expected = -2147483648;

        assertEquals(expected, new Divide().divide(a, b));
    }

    @Test
    void divide8() {
        int a = -1;
        int b = 1;
        int expected = -1;

        assertEquals(expected, new Divide().divide(a, b));
    }
}