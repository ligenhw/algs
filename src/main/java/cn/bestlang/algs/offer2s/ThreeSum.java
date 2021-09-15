package cn.bestlang.algs.offer2s;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums.length < 3) {
            return result;
        }

        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            int[] search = search(nums, i + 1, nums.length - 1, -nums[i]);
            if (search != null) {
                List<Integer> subRes = new ArrayList<>();
                subRes.add(nums[i]);
                subRes.add(search[0]);
                subRes.add(search[1]);
                result.add(subRes);
            }
        }

        return result;
    }

    private int[] search(int[] nums, int lo, int hi, int sum) {
        if (lo >= hi) {
            return null;
        }


        return null;
    }
}
