package cn.bestlang.algs.leetcode;

import java.util.Deque;
import java.util.LinkedList;

public class MinOperations {

    public int minOperations(String[] logs) {
        Deque<String> files = new LinkedList<>();

        for (String log : logs) {
            if (log.equals("../")) {
                if (!files.isEmpty()) {
                    files.pop();
                }
            } else if (!log.equals("./")) {
                files.push(log);
            }
        }

        return files.size();
    }
}
