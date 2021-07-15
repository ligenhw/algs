package cn.bestlang.algs.offer2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddTest {

    @Test
    void add() {
        int a = -1;
        int b = 31;
        int expected = 30;

        assertEquals(expected, new Add().add(a, b));
    }

    @Test
    void add2() {
        int a = 1;
        int b = -2;
        int expected = -1;

        assertEquals(expected, new Add().add(a, b));
    }
}