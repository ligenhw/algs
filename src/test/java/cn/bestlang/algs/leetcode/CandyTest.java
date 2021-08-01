package cn.bestlang.algs.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CandyTest {

    @Test
    void candy() {
        int[] ratings = {1,0,2};
        int expected = 5;

        assertEquals(expected, new Candy().candy(ratings));
    }

    @Test
    void candy2() {
        int[] ratings = {1,2,2};
        int expected = 4;

        assertEquals(expected, new Candy().candy(ratings));
    }

    @Test
    void candy3() {
        int[] ratings = {1,2,87,87,87,2,1};
        int expected = 13;

        assertEquals(expected, new Candy().candy(ratings));
    }
}