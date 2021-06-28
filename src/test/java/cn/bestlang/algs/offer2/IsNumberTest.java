package cn.bestlang.algs.offer2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsNumberTest {

    @Test
    void isNumber() {
        String s = "0";
        boolean expected = true;
        assertEquals(expected, new IsNumber().isNumber(s));
    }

    @Test
    void isNumber2() {
        String s = "e";
        boolean expected = false;
        assertEquals(expected, new IsNumber().isNumber(s));
    }

    @Test
    void isNumber3() {
        String s = ".";
        boolean expected = false;
        assertEquals(expected, new IsNumber().isNumber(s));
    }

    @Test
    void isNumber4() {
        String s = "-1E-16";
        boolean expected = true;
        assertEquals(expected, new IsNumber().isNumber(s));
    }

    @Test
    void isNumber5() {
        String s = "-.3e6";
        boolean expected = true;
        assertEquals(expected, new IsNumber().isNumber(s));
    }

    @Test
    void isNumber6() {
        String s = "0e";
        boolean expected = false;
        assertEquals(expected, new IsNumber().isNumber(s));
    }
}