package cn.bestlang.algs.offer2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovingCountTest {

    @Test
    void movingCount() {
        int m = 2;
        int n = 3;
        int k = 1;

        int expected = 3;
        assertEquals(expected, new MovingCount().movingCount(m, n, k));
    }

    @Test
    void movingCount2() {
        int m = 3;
        int n = 1;
        int k = 0;

        int expected = 1;
        assertEquals(expected, new MovingCount().movingCount(m, n, k));
    }

    @Test
    void numSum() {
        assertEquals(6, new MovingCount().numSum(231));
        assertEquals(3, new MovingCount().numSum(21));
    }

    @Test
    void beyondK() {
        assertEquals(false, new MovingCount().beyondK(0, 1, 1));
    }
}