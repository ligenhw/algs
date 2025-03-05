package cn.bestlang.algs.lc;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SmallestKTest {

    @Test
    void smallestK() {
        int[] arr = {1,3,5,7,2,4,6,8};
        int k = 4;
        int[] smallestK = new SmallestK().smallestK(arr, k);
        System.out.println(Arrays.toString(smallestK));
    }
}