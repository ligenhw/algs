package cn.bestlang.algs.leetcode;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class PickIndexTest {

    @Test
    void pickIndex() {
        int[] w = {1};
        PickIndex pi = new PickIndex(w);
        System.out.println(pi.pickIndex());
    }

    @Test
    void pickIndex2() {
        int[] w = {1, 3};
        PickIndex pi = new PickIndex(w);
        System.out.println(pi.pickIndex());
        System.out.println(pi.pickIndex());
        System.out.println(pi.pickIndex());
        System.out.println(pi.pickIndex());
        System.out.println(pi.pickIndex());
    }

    @Test
    void pickIndex3() {
        int[] w = {1, 3, 1};
        PickIndex pi = new PickIndex(w);
        System.out.println(pi.pickIndex());
        System.out.println(pi.pickIndex());
        System.out.println(pi.pickIndex());
        System.out.println(pi.pickIndex());
        System.out.println(pi.pickIndex());
    }
}