package cn.bestlang.algs.offer2;

import java.util.HashSet;
import java.util.Set;

public class FindRepeatNumber {

    public int findRepeatNumber(int[] nums) {
        Set<Integer> sets = new HashSet<>();
        for (int n : nums) {
            if (sets.contains(n)) {
                return n;
            } else {
                sets.add(n);
            }
        }
        return -1;
    }
}
