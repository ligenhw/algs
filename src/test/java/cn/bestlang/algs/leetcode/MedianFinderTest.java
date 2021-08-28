package cn.bestlang.algs.leetcode;

import org.junit.jupiter.api.Test;

public class MedianFinderTest {

    @Test
    void addNum() {
        MedianFinder finder = new MedianFinder();
        finder.addNum(2);
        double median = finder.findMedian();
        System.out.println(median);
    }

    @Test
    void addNum2() {
        MedianFinder finder = new MedianFinder();
        finder.addNum(1);
        finder.addNum(2);
        finder.addNum(3);
        double median = finder.findMedian();
        System.out.println(median);
    }

    @Test
    void findMedian() {
        MedianFinder finder = new MedianFinder();
        finder.addNum(1);
        finder.addNum(2);
        double median = finder.findMedian();
        System.out.println(median);
    }
}
