package cn.bestlang.algs.leetcode;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack(result, 0, 0, new StringBuilder(), n);
        return result;
    }

    private void backtrack(List<String> result, int open, int close, StringBuilder current, int max) {
        if (current.length() == max * 2) {
            result.add(current.toString());
            return;
        }

        if (open < max) {
            current.append("(");
            backtrack(result, open + 1, close, current, max);
            current.deleteCharAt(current.length() - 1);
        }

        if (close < open) {
            current.append(")");
            backtrack(result, open, close + 1, current, max);
            current.deleteCharAt(current.length() - 1);
        }
    }
}
