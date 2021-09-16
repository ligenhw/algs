package cn.bestlang.algs.offer2s;

import org.junit.jupiter.api.Test;

import java.util.List;

public class ThreeSumTest {

    @Test
    void threeSum1() {
        int[] nums = {-1,0,1,2,-1,-4};

        int[][] expected = new int[][]{{-1,-1,2},{-1,0,1}};

        List<List<Integer>> lists = new ThreeSum().threeSum(nums);

        System.out.println(lists);
    }

    @Test
    void threeSum2() {
        int[] nums = {-2,0,1,1,2};

        int[][] expected = new int[][]{{-2,0,2},{-2,1,1}};

        List<List<Integer>> lists = new ThreeSum().threeSum(nums);

        System.out.println(lists);
    }
}
