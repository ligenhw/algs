package cn.bestlang.algs.offer2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CuttingRopeTest {

    @Test
    void cuttingRope() {
        int n = 2;
        int expected = 1;

        assertEquals(expected, new CuttingRope().cuttingRope(n));
    }

    @Test
    void cuttingRope2() {
        int n = 10;
        int expected = 36;

        assertEquals(expected, new CuttingRope().cuttingRope(n));
    }

}