package cn.bestlang.algs.leetcode;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PathInZigZagTreeTest {

    @Test
    void pathInZigZagTree() {
        List<Integer> path = new PathInZigZagTree().pathInZigZagTree(26);
        Integer[] expected = {1, 2, 6, 10, 26};
        assertArrayEquals(expected, path.toArray(new Integer[0]));
    }

    @Test
    void pathInZigZagTree2() {
        List<Integer> path = new PathInZigZagTree().pathInZigZagTree(14);
        Integer[] expected = {1, 3, 4, 14};
        assertArrayEquals(expected, path.toArray(new Integer[0]));
    }

    @Test
    void pathInZigZagTree3() {
        List<Integer> path = new PathInZigZagTree().pathInZigZagTree(1);
        Integer[] expected = {1};
        assertArrayEquals(expected, path.toArray(new Integer[0]));
    }

    @Test
    void pathInZigZagTree4() {
        List<Integer> path = new PathInZigZagTree().pathInZigZagTree(16);
        Integer[] expected = {1,3,4,15,16};
        assertArrayEquals(expected, path.toArray(new Integer[0]));
    }
}