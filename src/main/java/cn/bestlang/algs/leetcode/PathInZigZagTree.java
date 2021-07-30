package cn.bestlang.algs.leetcode;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class PathInZigZagTree {

    public List<Integer> pathInZigZagTree(int label) {
        Deque<Integer> deque = new LinkedList<>();
        int level = getLevel(label);

        int current = label;
        int start = (int) Math.pow(2, level - 1);
        while (current > 0) {
            deque.addFirst(current);
            current = findNum(start, current);

            current /= 2;
            start /= 2;
        }
        return deque.stream().collect(Collectors.toList());
    }

    public int findNum(int start, int num) {
        return 3 * start - num - 1;
    }

    public int getLevel(int num) {
        int i = 1;
        int level = 1;
        while (num >= i) {
            i *= 2;
            level++;
        }
        return --level;
    }
}
