package cn.bestlang.algs.offer2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidateStackSequencesTest {

    @Test
    void validateStackSequences() {
        int[] pushed = {1,2,3,4,5};
        int[] popped = {4,5,3,2,1};
        boolean expected = true;

        assertEquals(expected, new ValidateStackSequences().validateStackSequences(pushed, popped));
    }

    @Test
    void validateStackSequences2() {
        int[] pushed = {1,2,3,4,5};
        int[] popped = {4,3,5,1,2};
        boolean expected = false;

        assertEquals(expected, new ValidateStackSequences().validateStackSequences(pushed, popped));
    }
}