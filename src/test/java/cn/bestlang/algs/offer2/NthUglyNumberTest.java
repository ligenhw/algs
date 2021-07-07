package cn.bestlang.algs.offer2;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class NthUglyNumberTest {

    @Test
    void nthUglyNumber() {
        int n = 10;
        int expected = 12;
        assertEquals(expected, new NthUglyNumber().nthUglyNumber(n));
    }

    @Test
    void nthUglyNumber2() {
        int n = 1352;
        int expected = 402653184;
        assertEquals(expected, new NthUglyNumber().nthUglyNumber(n));
    }

    @Test
    void nthUglyNumber3() {
        int n = 1407;
        int expected = 536870912;
        assertEquals(expected, new NthUglyNumber().nthUglyNumber(n));
    }

}