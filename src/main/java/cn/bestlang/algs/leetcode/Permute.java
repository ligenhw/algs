package cn.bestlang.algs.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Permute {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        list.add(nums[0]);
        result.add(list);

        for (int i = 1; i < nums.length; i++) {
            List<List<Integer>> newResult = new ArrayList<>();
            for (List<Integer> subResult : result) {
                combine(subResult, nums[i], newResult);
            }
            result = newResult;
        }

        return result;
    }

    private void combine(List<Integer> nums, int num, List<List<Integer>> result) {
        List<Integer> base = new ArrayList<>(nums);
        base.add(num);
        result.add(base);
        for (int i = 0; i < base.size() - 1; i++) {
            List<Integer> subNums = new ArrayList<>(base);
            Collections.swap(subNums, i, subNums.size() - 1);
            result.add(subNums);
        }
    }
}
