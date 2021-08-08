package cn.bestlang.algs.leetcode;

import java.util.*;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> maps = new HashMap<>();

        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sortStr = new String(chars);
            List<String> strList = maps.getOrDefault(sortStr, new ArrayList<>());
            strList.add(str);
            maps.put(sortStr, strList);
        }

        List<List<String>> result = new ArrayList<>();
        Collection<List<String>> values = maps.values();
        for (List<String> val : values) {
            result.add(val);
        }

        return result;
    }
}
