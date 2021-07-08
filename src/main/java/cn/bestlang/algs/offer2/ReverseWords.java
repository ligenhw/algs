package cn.bestlang.algs.offer2;

import java.util.Deque;
import java.util.LinkedList;

public class ReverseWords {
    public String reverseWords(String s) {
        char[] chars = s.toCharArray();
        StringBuilder word = new StringBuilder();
        Deque<String> wordStack = new LinkedList<>();
        for (int i = 0; i < chars.length; i++) {
            if (!isBlank(chars[i])) {
                word.append(chars[i]);
            } else {
                if (word.length() > 0) {
                    wordStack.push(word.toString());
                    word = new StringBuilder();
                }
            }
        }

        if (word.length() > 0) {
            wordStack.push(word.toString());
        }

        if (wordStack.isEmpty()) {
            return "";
        }

        StringBuilder result = new StringBuilder();
        while (!wordStack.isEmpty()) {
            result.append(wordStack.pop()).append(" ");
        }

        String substring = result.substring(0, result.length() - 1);

        return substring;
    }

    private boolean isBlank(char c) {
        return c == ' ';
    }
}
