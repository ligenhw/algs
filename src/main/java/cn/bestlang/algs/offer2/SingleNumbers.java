package cn.bestlang.algs.offer2;

import java.util.HashSet;
import java.util.Set;

public class SingleNumbers {
    public int[] singleNumbers(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                set.remove(num);
            } else {
                set.add(num);
            }
        }

        return toArray(set);
    }

    private int[] toArray(Set<Integer> set) {
        Object[] objects = set.toArray();
        int[] result = new int[2];
        result[0] = (int) objects[0];
        result[1] = (int) objects[1];

        return result;
    }
}
