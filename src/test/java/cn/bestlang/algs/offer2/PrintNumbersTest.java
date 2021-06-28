package cn.bestlang.algs.offer2;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class PrintNumbersTest {

    @Test
    void printNumbers() {
        int n = 1;
        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertTrue(Arrays.equals(expected, new PrintNumbers().printNumbers(n)));
    }

    @Test
    void printNumbers2() {
        int n = 1;
        new PrintNumbers().printNumbers2(n);
    }

}