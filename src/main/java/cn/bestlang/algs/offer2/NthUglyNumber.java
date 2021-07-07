package cn.bestlang.algs.offer2;

import java.util.PriorityQueue;

public class NthUglyNumber {
    public int nthUglyNumber(int n) {

        PriorityQueue<Long> queue = new PriorityQueue<>();
        queue.add(1l);

        int count = 0;
        long number = 0;
        while (count < n) {
            number = queue.poll();
            addToQueue(queue, number);

            count++;
        }

        return (int) number;
    }

    private void addToQueue(PriorityQueue<Long> queue, long poll) {
        long poll2 = poll * 2;
        if (!queue.contains(poll2)) {
            queue.add(poll2);
        }
        long poll3 = poll * 3;
        if (!queue.contains(poll3)) {
            queue.add(poll3);
        }
        long poll5 = poll * 5;
        if (!queue.contains(poll5)) {
            queue.add(poll5);
        }
    }
}
