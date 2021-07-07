package cn.bestlang.algs.offer2;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class LengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> charSet = new HashSet<>();
        Queue<Character> queue = new LinkedList<>();
        char[] chars = s.toCharArray();
        int len = 0;
        int maxLen = 0;

        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (!queue.contains(c)) {
                queue.add(c);
                len++;
                maxLen = Math.max(len, maxLen);
            } else {
                charSet.clear();
                while (queue.contains(c)) {
                    queue.poll();
                }
                queue.add(c);
                len = queue.size();
            }
        }

        return maxLen;
    }
}
