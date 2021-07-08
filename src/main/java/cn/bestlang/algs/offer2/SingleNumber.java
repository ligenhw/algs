package cn.bestlang.algs.offer2;

import java.util.HashSet;
import java.util.Set;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> set3 = new HashSet<>();
        for (int num : nums) {
            if (set3.contains(num)) {
                continue;
            }
            if (set.contains(num)) {
                set.remove(num);
                set3.add(num);
            } else {
                set.add(num);
            }
        }

        return (int) set.toArray()[0];
    }
}
