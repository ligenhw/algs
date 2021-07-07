package cn.bestlang.algs.offer2;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstUniqChar {
    public char firstUniqChar(String s) {
        Map<Character, Integer> charMap = new LinkedHashMap<>();
        for (char c : s.toCharArray()) {
            charMap.put(c, charMap.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : charMap.entrySet()) {
            if (entry.getValue().equals(1)) {
                return entry.getKey();
            }
        }

        return ' ';
    }
}
