package cn.bestlang.algs.leetcode;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CombinationSumTest {

    @Test
    void combinationSum() {
        int[] candidates = {2,3,6,7};
        int target = 7;

        List<List<Integer>> results = new CombinationSum().combinationSum(candidates, target);
        System.out.println(results);
    }
}