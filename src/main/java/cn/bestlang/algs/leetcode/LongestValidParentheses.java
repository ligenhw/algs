package cn.bestlang.algs.leetcode;

public class LongestValidParentheses {
    public int longestValidParentheses(String s) {
        int longest = 0;
        char pre = ' ';
        int length = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                if (pre == '(') {
                    longest = Math.max(longest, length);
                    length = 0;
                }
                pre = '(';
            } else {
                if (pre == '(') {
                    length += 2;
                } else if (pre == ')') {
                    longest = Math.max(longest, length);
                    length = 0;
                }
                pre = ')';
            }
        }
        longest = Math.max(longest, length);

        return longest;
    }
}
