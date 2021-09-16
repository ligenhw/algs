package cn.bestlang.algs.offer2s;

import java.util.*;
import java.util.stream.Collectors;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> result = new HashSet<>();
        if (nums.length < 3) {
            return result.stream().collect(Collectors.toList());
        }

        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {

            List<int[]> search = search(nums, i + 1, nums.length - 1, -nums[i]);
            if (search != null && search.size() > 0) {
                for (int[] s : search) {
                    List<Integer> subRes = new ArrayList<>();
                    subRes.add(nums[i]);
                    subRes.add(nums[s[0]]);
                    subRes.add(nums[s[1]]);
                    result.add(subRes);
                }
            }
        }

        return result.stream().collect(Collectors.toList());
    }

    private List<int[]> search(int[] nums, int lo, int hi, int target) {
        if (lo >= hi) {
            return null;
        }

        List<int[]> searchRes = new ArrayList<>();
        while (lo < hi) {
            int sum = nums[lo] + nums[hi];
            if (sum == target) {
                searchRes.add(new int[] { lo, hi});
                hi--;
                lo++;
            } else if (sum > target) {
                hi--;
            } else {
                lo++;
            }
        }

        return searchRes;
    }
}
