package cn.bestlang.algs.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CanThreePartsEqualSumTest {

    @Test
    void canThreePartsEqualSum1() {
        int[] arr = {0,2,1,-6,6,-7,9,1,2,0,1};
        boolean expected = true;
        assertEquals(expected, new CanThreePartsEqualSum().canThreePartsEqualSum(arr));
    }

    @Test
    void canThreePartsEqualSum2() {
        int[] arr = {0,2,1,-6,6,7,9,-1,2,0,1};
        boolean expected = false;
        assertEquals(expected, new CanThreePartsEqualSum().canThreePartsEqualSum(arr));
    }

    @Test
    void canThreePartsEqualSum3() {
        int[] arr = {3,3,6,5,-2,2,5,1,-9,4};
        boolean expected = true;
        assertEquals(expected, new CanThreePartsEqualSum().canThreePartsEqualSum(arr));
    }

    @Test
    void canThreePartsEqualSum4() {
        int[] arr = {3,3,3};
        boolean expected = true;
        assertEquals(expected, new CanThreePartsEqualSum().canThreePartsEqualSum(arr));
    }
}