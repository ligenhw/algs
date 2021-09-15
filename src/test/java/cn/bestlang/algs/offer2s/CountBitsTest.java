package cn.bestlang.algs.offer2s;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountBitsTest {

    @Test
    void countBits() {
        int n = 5;
        int[] expected = {0, 1, 1, 2, 1, 2};

        assertArrayEquals(expected, new CountBits().countBits(n));
    }
}