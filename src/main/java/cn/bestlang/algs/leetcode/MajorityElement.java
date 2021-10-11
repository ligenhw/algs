package cn.bestlang.algs.leetcode;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> numMaps = new HashMap<>();
        for (int num : nums) {
            if (numMaps.containsKey(num)) {
                numMaps.put(num, numMaps.get(num) + 1);
            } else {
                numMaps.put(num, 1);
            }
        }

        int maxKey = nums[0];
        int maxCount = 1;
        for (Map.Entry<Integer, Integer> entry : numMaps.entrySet()) {
            Integer value = entry.getValue();
            if (value > maxCount) {
                maxCount = value;
                maxKey = entry.getKey();
            }
        }

        return maxKey;
    }
}
