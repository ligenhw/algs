package cn.bestlang.algs.offer2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsMatchTest {

    @Test
    void isMatch() {
        String s = "aa";
        String p = "a";
        boolean expected = false;
        assertEquals(expected, new IsMatch().isMatch(s, p));
    }

    @Test
    void isMatch2() {
        String s = "aa";
        String p = "a*";
        boolean expected = true;
        assertEquals(expected, new IsMatch().isMatch(s, p));
    }

    @Test
    void isMatch3() {
        String s = "ab";
        String p = ".*";
        boolean expected = true;
        assertEquals(expected, new IsMatch().isMatch(s, p));
    }

    @Test
    void isMatch4() {
        String s = "aab";
        String p = "c*a*b";
        boolean expected = true;
        assertEquals(expected, new IsMatch().isMatch(s, p));
    }

    @Test
    void isMatch5() {
        String s = "mississippi";
        String p = "mis*is*p*.";
        boolean expected = false;
        assertEquals(expected, new IsMatch().isMatch(s, p));
    }
}