package cn.bestlang.algs.offer2s;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxProductTest {

    @Test
    void maxProduct() {
        boolean b = new MaxProduct().hasSameChar("a", "ab");
        System.out.println(b);
    }

    @Test
    void maxProduct2() {
        int b = new MaxProduct().toBinary("c");
        System.out.println(b);
    }
}