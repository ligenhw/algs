package cn.bestlang.algs.leetcode;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class WordBreak {
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> wordSet = wordDict.stream().collect(Collectors.toSet());
        char[] chars = s.toCharArray();
        return wordMath(chars, 0, chars.length - 1, wordSet);
    }

    private boolean wordMath(char[] chars, int start, int end, Set<String> wordSet) {

        StringBuilder sb = new StringBuilder();
        for (int i = start; i <= end; i++) {
            sb.append(chars[i]);
            if (wordSet.contains(sb.toString())) {
                if (i == end) {
                    return true;
                } else if (wordMath(chars, i + 1, end, wordSet)) {
                    return true;
                }
            }
        }

        return false;
    }
}
