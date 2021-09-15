package cn.bestlang.algs.offer2s;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> maps = new HashMap<>();
        for (int num : nums) {
            if (maps.containsKey(num)) {
                maps.put(num, maps.get(num) + 1);
            } else {
                maps.put(num, 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : maps.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return -1;
    }
}
