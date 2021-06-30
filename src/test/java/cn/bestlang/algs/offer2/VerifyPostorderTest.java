package cn.bestlang.algs.offer2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VerifyPostorderTest {

    @Test
    void verifyPostorder() {
        int[] postorder = {1,6,3,2,5};
        boolean expected = false;

        assertEquals(expected, new VerifyPostorder().verifyPostorder(postorder));
    }

    @Test
    void verifyPostorder2() {
        int[] postorder = {1,3,2,6,5};
        boolean expected = true;

        assertEquals(expected, new VerifyPostorder().verifyPostorder(postorder));
    }

    @Test
    void verifyPostorder3() {
        int[] postorder = {1,2,5,10,6,9,4,3};
        boolean expected = false;

        assertEquals(expected, new VerifyPostorder().verifyPostorder(postorder));
    }
}