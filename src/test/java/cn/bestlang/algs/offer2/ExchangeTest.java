package cn.bestlang.algs.offer2;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ExchangeTest {

    @Test
    void exchange() {
        int[] nums = {1, 2, 3, 4};
        int[] expected = {1, 3, 2, 4};

        assertArrayEquals(expected,  new Exchange().exchange(nums));
    }

    @Test
    void exchange2() {
        int[] nums = {1, 3, 5};
        int[] expected = {1, 3, 5};

        assertArrayEquals(expected,  new Exchange().exchange(nums));
    }
}