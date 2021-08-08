package cn.bestlang.algs.leetcode;

import java.util.*;

public class LongestConsecutive {
    public int longestConsecutive(int[] nums) {
        Map<Integer, Integer> maps = new HashMap<>();
        for (int num : nums) {
            maps.put(num, num);
        }

        int max = 0;
        for (int key : nums) {
            int size = 0;
            int current = key;
            while (maps.get(current) != null) {
                maps.remove(current);
                size++;
                current++;
            }
            current = key - 1;
            while (maps.get(current) != null) {
                maps.remove(current);
                size++;
                current--;
            }

            max = Math.max(max, size);
        }

        return max;
    }
}
