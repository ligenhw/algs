package cn.bestlang.algs.leetcode;

public class MyCircularQueue {

    private int[] queue;
    private int head;
    private int tail;
    private int size;

    public MyCircularQueue(int k) {
        size = k + 1;
        queue = new int[size];
    }

    public boolean enQueue(int value) {
        if (isFull()) {
            return false;
        }

        queue[tail] = value;
        tail = (tail + 1) % size;
        return true;
    }

    public boolean deQueue() {
        if (isEmpty()) {
            return false;
        }

        head = (head + 1) % size;
        return true;
    }

    public int Front() {
        if (isEmpty()) {
            return -1;
        }

        return queue[head];
    }

    public int Rear() {
        if (isEmpty()) {
            return -1;
        }

        int index = (tail + size - 1) % size;
        return queue[index];
    }

    public boolean isEmpty() {
        return head == tail;
    }

    public boolean isFull() {
        return (tail + 1) % size == head;
    }
}
