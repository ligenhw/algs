package cn.bestlang.algs.offer2;

import java.util.LinkedList;
import java.util.Queue;

public class MaxQueue {

    Queue<Integer> queue = new LinkedList<>();
    Queue<Integer> max = new LinkedList<>();

    public MaxQueue() {

    }

    public int max_value() {
        if (max.isEmpty()) {
            return -1;
        }

        return max.peek();
    }

    public void push_back(int value) {
        queue.offer(value);
        if (!max.isEmpty()) {
            Integer peek = max_value();
            if (value > peek) {
                updateQueue(value);
            }
        }
        max.offer(value);
    }

    private void updateQueue(int value) {
        int size = queue.size();
        for (int i = 0; i < size; i++) {
            max.poll();
            max.offer(value);
        }
    }

    public int pop_front() {
        if (queue.isEmpty()) {
            return -1;
        }
        max.poll();
        return queue.poll();
    }
}
