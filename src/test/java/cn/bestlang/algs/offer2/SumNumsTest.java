package cn.bestlang.algs.offer2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumNumsTest {

    @Test
    void sumNums() {
        int n = 3;
        int expected = 6;

        assertEquals(expected, new SumNums().sumNums(n));
    }
}