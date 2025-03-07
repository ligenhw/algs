package cn.bestlang.algs.lc;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class TwoSum2Test {

    @Test
    void twoSum() {
        int[] price = {3, 9, 12, 15};
        int target = 18;
        int[] sum = new TwoSum2().twoSum(price, target);
        System.out.println(Arrays.toString(sum));
    }
}