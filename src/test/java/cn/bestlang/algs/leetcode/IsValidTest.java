package cn.bestlang.algs.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsValidTest {

    @Test
    void isValid() {
        String s = "()";
        boolean expected = true;

        assertEquals(expected, new IsValid().isValid(s));
    }

    @Test
    void isValid2() {
        String s = "()[]{}";
        boolean expected = true;

        assertEquals(expected, new IsValid().isValid(s));
    }

    @Test
    void isValid3() {
        String s = "([)]";
        boolean expected = false;

        assertEquals(expected, new IsValid().isValid(s));
    }

    @Test
    void isValid4() {
        String s = "]";
        boolean expected = false;

        assertEquals(expected, new IsValid().isValid(s));
    }
}