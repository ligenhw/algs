package cn.bestlang.algs.offer2review;

import java.util.Deque;
import java.util.LinkedList;

public class CQueue {

    private Deque<Integer> stack1 = new LinkedList<>();
    private Deque<Integer> stack2 = new LinkedList<>();

    public CQueue() {
    }

    public void appendTail(int value) {
        stack1.push(value);
    }

    public int deleteHead() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        return stack2.isEmpty() ? -1 : stack2.pop();
    }
}
