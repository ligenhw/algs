package cn.bestlang.algs.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LargestTriangleAreaTest {

    @Test
    void largestTriangleArea() {
        int[][] points = {{-35,19},{40,19},{27,-20},{35,-3},{44,20},{22,-21},{35,33},{-19,42},{11,47},{11,37}};
        double area = new LargestTriangleArea().largestTriangleArea(points);
        System.out.println(area);
    }
}