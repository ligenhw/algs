package cn.bestlang.algs.leetcode;

import java.util.*;

public class PermuteUnique {

    public List<List<Integer>> permuteUnique(int[] nums) {
        Map<Integer, List<Integer>> maps = new HashMap<>();
        Deque<Integer> queue = new LinkedList<>();

        return null;
    }

    private void addToMap(Map<Integer, List<Integer>> maps, int num) {
        List<Integer> list = maps.getOrDefault(num, new ArrayList<>());
        list.add(num);
    }
}
