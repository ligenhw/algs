package cn.bestlang.algs.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinations {

    private Map<Character, String[]> maps = new HashMap<>();

    {
        maps.put('2', new String[]{"a", "b", "c"});
        maps.put('3', new String[]{"d", "e", "f"});
        maps.put('4', new String[]{"g", "h", "i"});
        maps.put('5', new String[]{"j", "k", "l"});
        maps.put('6', new String[]{"m", "n", "o"});
        maps.put('7', new String[]{"p", "q", "r", "s"});
        maps.put('8', new String[]{"t", "u", "v"});
        maps.put('9', new String[]{"w", "x", "y", "z"});
    }

    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();

        for (char c : digits.toCharArray()) {
            String[] strings = maps.get(c);
            if (result.isEmpty()) {
                for (String s : strings) {
                    result.add(s);
                }
            } else {
                List<String> tmp = new ArrayList<>();
                for (String r : result) {
                    for (String s : strings) {
                        tmp.add(r + s);
                    }
                }
                result = tmp;
            }
        }

        return result;
    }
}
