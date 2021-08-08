package cn.bestlang.algs.leetcode;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

class MergeTest {

    @Test
    void merge() {
        int[][] intervals = {{3, 3}, {2, 6}};
        Arrays.sort(intervals, Comparator.comparingInt(o -> o[0]));

        System.out.println(Arrays.deepToString(intervals));
    }
}