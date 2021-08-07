package cn.bestlang.algs.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumTreesTest {

    @Test
    void numTrees() {
        int n = 3;
        int expected = 5;

        assertEquals(expected, new NumTrees().numTrees(n));
    }

    @Test
    void numTrees2() {
        int n = 1;
        int expected = 1;

        assertEquals(expected, new NumTrees().numTrees(n));
    }

    @Test
    void numTrees3() {
        int n = 4;
        int expected = 14;

        assertEquals(expected, new NumTrees().numTrees(n));
    }
}