package cn.bestlang.algs.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SequentialDigitsTest {

    @Test
    void sequentialDigits() {
        int low = 100;
        int high = 300;

        Integer[] expected = {123,234};
        assertArrayEquals(expected, new SequentialDigits().sequentialDigits(low, high).toArray(new Integer[0]));
    }

    @Test
    void sequentialDigits2() {
        int low = 1000;
        int high = 13000;

        Integer[] expected = {1234,2345,3456,4567,5678,6789,12345};
        System.out.println(new SequentialDigits().sequentialDigits(low, high));
        assertArrayEquals(expected, new SequentialDigits().sequentialDigits(low, high).toArray(new Integer[0]));
    }
}