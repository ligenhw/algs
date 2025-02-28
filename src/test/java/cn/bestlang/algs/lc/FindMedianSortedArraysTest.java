package cn.bestlang.algs.lc;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class FindMedianSortedArraysTest {

    @Test
    void mergeArrays() {
        int[] num1 = {1, 2};
        int[] num2 = {3, 4};

        int[] num3 = new FindMedianSortedArrays().mergeArrays(num1, num2);
        System.out.println(Arrays.toString(num3));
    }

    @Test
    void mergeArrays2() {
        int[] num1 = {1, 2};
        int[] num2 = {3, 4};

        double v = new FindMedianSortedArrays().findMedianSortedArrays(num1, num2);
        System.out.println(v);
    }
}