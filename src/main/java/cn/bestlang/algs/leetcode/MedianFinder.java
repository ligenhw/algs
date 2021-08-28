package cn.bestlang.algs.leetcode;

import java.util.PriorityQueue;

public class MedianFinder {

    private PriorityQueue<Integer> max = new PriorityQueue<>((a, b) -> b - a);
    private PriorityQueue<Integer> min = new PriorityQueue<>();
    private int index;

    /** initialize your data structure here. */
    public MedianFinder() {

    }

    public void addNum(int num) {
        if (index % 2 == 0) {
            min.add(num);
            Integer poll = min.poll();
            max.add(poll);
        } else {
            max.add(num);
            Integer poll = max.poll();
            min.add(poll);
        }
        index++;
    }

    public double findMedian() {
        if (max.isEmpty()) {
            return -1;
        }

        Integer maxVal = max.peek();
        if (index % 2 == 0) {
            if (min.isEmpty()) {
                return -1;
            }

            Integer minVal = min.peek();
            return (minVal + maxVal) / 2.0;
        } else {
            return maxVal;
        }
    }
}
