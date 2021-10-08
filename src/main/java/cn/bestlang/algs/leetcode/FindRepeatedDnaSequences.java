package cn.bestlang.algs.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindRepeatedDnaSequences {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> results = new ArrayList<>();
        Set<String> sets = new HashSet<>();
        Set<String> resultSet = new HashSet<>();
        int len = s.length();

        for (int i = 0; i <= len - 10; i++) {
            String subStr = s.substring(i, i + 10);
            if (sets.contains(subStr)) {
                resultSet.add(subStr);
            } else {
                sets.add(subStr);
            }
        }

        return resultSet.stream().collect(Collectors.toList());
    }
}
