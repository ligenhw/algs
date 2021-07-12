package cn.bestlang.algs.offer2;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.PriorityQueue;

import static org.junit.jupiter.api.Assertions.*;

class MaxSlidingWindowTest {

    @Test
    void maxSlidingWindow() {
        int[] nums = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        int[] expected = {3,3,5,5,6,7};
        assertArrayEquals(expected, new MaxSlidingWindow().maxSlidingWindow(nums, k));
    }

    @Test
    void maxSlidingWindow2() {
        int[] nums = {};
        int k = 0;
        int[] expected = {};
        assertArrayEquals(expected, new MaxSlidingWindow().maxSlidingWindow(nums, k));
    }

    @Test
    void node() {
        MaxSlidingWindow.Node n1 = new MaxSlidingWindow.Node(2, 2);
        MaxSlidingWindow.Node n2 = new MaxSlidingWindow.Node(1, 2);
        System.out.println(n1.compareTo(n2));
        PriorityQueue<MaxSlidingWindow.Node> pq = new PriorityQueue<>();
        pq.add(n1);
        pq.add(n2);
        System.out.println(pq.poll().val);

    }
}