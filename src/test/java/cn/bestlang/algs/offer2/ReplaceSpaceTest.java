package cn.bestlang.algs.offer2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReplaceSpaceTest {

    @Test
    void replaceSpace() {
        String s = "We are happy.";
        String expect = "We%20are%20happy.";
        assertEquals(expect, new ReplaceSpace().replaceSpace(s));
    }
}