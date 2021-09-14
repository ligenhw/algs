package cn.bestlang.algs.leetcode;

public class LongestValidParentheses {
    public int longestValidParentheses(String s) {
        int longest = 0;
        int length = 0;
        int leftCount = 0;
        int subLen = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                leftCount++;
            } else if (c == ')') {
                if (leftCount == 0) {
                    longest = Math.max(longest, length);
                    length = 0;
                    subLen = 0;
                } else {
                    subLen += 2;
                    if (leftCount == 1) {
                        length += subLen;
                        subLen = 0;
                    }
                    leftCount--;
                }
            }
        }
        longest = Math.max(longest, length);
        longest = Math.max(longest, subLen);

        return longest;
    }
}
