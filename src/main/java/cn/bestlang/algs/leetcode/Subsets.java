package cn.bestlang.algs.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        for (int i = 0; i < nums.length; i++) {
            List<List<Integer>> subResult = new ArrayList<>();
            for (List<Integer> subRes: result) {
                List<Integer> list = new ArrayList<>(subRes);
                list.add(nums[i]);
                subResult.add(list);
            }

            result.addAll(subResult);
        }

        return result;
    }
}
