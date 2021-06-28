package cn.bestlang.algs.offer2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyPowTest {

    @Test
    void myPow() {
        double x = 2.0;
        int n = 10;
        double expected = 1024.0;

        assertEquals(expected, new MyPow().myPow(x, n));
    }

    @Test
    void myPow2() {
        double x = 1.0;
        int n = 2147483647;
        double expected = 1.0;

        assertEquals(expected, new MyPow().myPow(x, n));
    }

    @Test
    void myPow3() {
        double x = 0.44528;
        int n = 0;
        double expected = 1.0;

        assertEquals(expected, new MyPow().myPow(x, n));
    }

    @Test
    void myPow4() {
        double x = 1.0;
        int n = -2147483648;
        double expected = 1.0;

        assertEquals(expected, new MyPow().myPow(x, n));
    }

    @Test
    void myPow5() {
        double x = 1.0;
        int n = -2;
        double expected = 1.0;

        assertEquals(expected, new MyPow().myPow(x, n));
    }

    @Test
    void myPow6() {
        double x = 2.0;
        int n = -2;
        double expected = 0.25;

        assertEquals(expected, new MyPow().myPow(x, n));
    }
}