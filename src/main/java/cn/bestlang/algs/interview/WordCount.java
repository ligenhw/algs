package cn.bestlang.algs.interview;

import java.util.HashMap;
import java.util.Map;

public class WordCount {

    public Map<String, Integer> read(String[] lines) {
        Map<String, Integer> maps = new HashMap<>();
        for (String line : lines) {
            String[] words = line.split("\\s+");
            for (String word : words) {
                if (maps.containsKey(word)) {
                    maps.put(word, maps.get(word) + 1);
                } else {
                    maps.put(word, 1);
                }
            }
        }

        return maps;
    }

    public static void main(String[] args) {
        String[] s = {"123  22", "123     2"};
        Map<String, Integer> read = new WordCount().read(s);
        System.out.println(read);
    }
}
