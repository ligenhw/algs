package cn.bestlang.algs.leetcode;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PermuteTest {

    @Test
    void permute() {
        int[] nums = {1,2,3};
        List<List<Integer>> permute = new Permute().permute(nums);
        System.out.println(permute);
    }

    @Test
    void permute2() {
        int[] nums = {1};
        List<List<Integer>> permute = new Permute().permute(nums);
        System.out.println(permute);
    }
}