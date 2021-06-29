package cn.bestlang.algs.offer2;

import java.util.Deque;
import java.util.LinkedList;

public class MinStack {

    private Deque<Integer> stack = new LinkedList<>();
    private Deque<Integer> minStack = new LinkedList<>();

    /** initialize your data structure here. */
    public MinStack() {

    }

    public void push(int x) {
        stack.push(x);
        int min = Math.min(minStack.size() == 0 ? x : min(), x);
        minStack.push(min);
    }

    public void pop() {
        stack.pop();
        minStack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int min() {
        return minStack.peek();
    }
}
