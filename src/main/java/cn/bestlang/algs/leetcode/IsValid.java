package cn.bestlang.algs.leetcode;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Objects;

public class IsValid {
    public boolean isValid(String s) {
        Deque<Character> stack = new LinkedList<>();
        for (char c : s.toCharArray()) {
            if ("([{".contains(String.valueOf(c))) {
                stack.push(c);
            } else if (c == ')') {
                if (Objects.equals('(', stack.peek())) {
                    stack.pop();
                } else {
                    return false;
                }
            }else if (c == ']') {
                if (Objects.equals('[', stack.peek())) {
                    stack.pop();
                } else {
                    return false;
                }
            }else if (c == '}') {
                if (Objects.equals('{', stack.peek())) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
