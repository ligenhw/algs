package cn.bestlang.algs.offer2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxProfitTest {

    @Test
    void maxProfit() {
        int[] price = {7,1,5,3,6,4};
        int expected = 5;

        assertEquals(expected, new MaxProfit().maxProfit(price));
    }

    @Test
    void maxProfit2() {
        int[] price = {7,6,4,3,1};
        int expected = 0;

        assertEquals(expected, new MaxProfit().maxProfit(price));
    }
}