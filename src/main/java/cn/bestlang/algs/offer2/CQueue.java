package cn.bestlang.algs.offer2;

import java.util.Deque;
import java.util.LinkedList;

public class CQueue {

    private Deque<Integer> stack = new LinkedList<>();
    private Deque<Integer> stack2 = new LinkedList<>();

    public CQueue() {

    }

    public void appendTail(int value) {
        stack.push(value);
    }

    public int deleteHead() {
        if (stack2.isEmpty()) {
            while(!stack.isEmpty()) {
                stack2.push(stack.pop());
            }
        }
        if (stack2.isEmpty()) {
            return -1;
        } else {
            return stack2.pop();
        }
    }
}
