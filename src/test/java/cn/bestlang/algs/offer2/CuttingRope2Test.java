package cn.bestlang.algs.offer2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CuttingRope2Test {

    @Test
    void cuttingRope2() {
        int n = 10;
        int expected = 36;

        assertEquals(expected, new CuttingRope2().cuttingRope(n));
    }

    @Test
    void cuttingRope3() {
        int n = 120;
        int expected = 953271190;

        assertEquals(expected, new CuttingRope2().cuttingRope(n));

        System.out.println(1 << 32);
    }
}