package cn.bestlang.algs.offer2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MedianFinderTest {

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
        finder.addNum(2);
        finder.addNum(1);
        finder.addNum(5);
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