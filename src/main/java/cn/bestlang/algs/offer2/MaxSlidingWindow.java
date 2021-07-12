package cn.bestlang.algs.offer2;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class MaxSlidingWindow {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums.length == 0) {
            return new int[]{};
        }

        PriorityQueue<Node> pq = new PriorityQueue<>();
        Queue<Node> queue = new LinkedList<>();

        for (int i = 0; i < k - 1; i++) {
            Node node = new Node(nums[i], i);
            pq.add(node);
            queue.add(node);
        }

        int[] max = new int[nums.length - k + 1];
        for (int i = k - 1; i < nums.length; i++) {
            Node node = new Node(nums[i], i);
            pq.add(node);
            queue.add(node);

            max[i - k + 1] = pq.peek().val;
            Node poll = queue.poll();
            pq.remove(poll);
        }

        return max;
    }

    static class Node implements Comparable<Node>{
        int val;
        int index;

        public Node(int v, int i) {
            val = v;
            index = i;
        }

        @Override
        public int compareTo(Node o) {
            return o.val - val;
        }
    }
}
