package cn.bestlang.algs.offer2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConstructArrTest {

    @Test
    void constructArr() {
        int[] a = {1,2,3,4,5};
        int[] expected = {120,60,40,30,24};

        assertArrayEquals(expected, new ConstructArr().constructArr(a));
    }
}