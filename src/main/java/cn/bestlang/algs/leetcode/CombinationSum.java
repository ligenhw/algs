package cn.bestlang.algs.leetcode;

import java.util.*;

public class CombinationSum {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        LinkedList<Integer> path = new LinkedList<>();
        backtrack(candidates, candidates.length - 1, target, 0, result, path);
        return result;
    }

    private void backtrack(int[] candidates, int last, int target, int sum, List<List<Integer>> result, LinkedList<Integer> path) {
        if (last < 0) {
            return;
        }

        if (candidates[last] + sum == target) {
            List<Integer> validatePath = new ArrayList<>(path);
            validatePath.add(candidates[last]);
            result.add(validatePath);
        } else if (candidates[last] + sum < target) {
            path.add(candidates[last]);
            backtrack(candidates, last, target, candidates[last] + sum , result, path);
            path.removeLast();
        }

        backtrack(candidates, last - 1, target, sum, result, path);
    }
}
