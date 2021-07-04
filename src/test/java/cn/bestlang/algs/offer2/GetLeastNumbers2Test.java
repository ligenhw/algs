package cn.bestlang.algs.offer2;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class GetLeastNumbers2Test {

    @Test
    void getLeastNumbers() {
        int[] arr = {3,2,1};
        int k = 2;

        int[] leastNumbers = new GetLeastNumbers2().getLeastNumbers(arr, k);
        System.out.println(Arrays.toString(leastNumbers));
    }

    @Test
    void getLeastNumbers2() {
        int[] arr = {0,1,2,1};
        int k = 1;

        int[] leastNumbers = new GetLeastNumbers2().getLeastNumbers(arr, k);
        System.out.println(Arrays.toString(leastNumbers));
    }

    @Test
    void getLeastNumbers3() {
        int[] arr = {0,1,2,1};
        int k = 0;

        int[] leastNumbers = new GetLeastNumbers2().getLeastNumbers(arr, k);
        System.out.println(Arrays.toString(leastNumbers));
    }

    @Test
    void getLeastNumbers4() {
        int[] arr = {0,1,1,2,4,4,1,3,3,2};
        int k = 6;

        int[] leastNumbers = new GetLeastNumbers2().getLeastNumbers(arr, k);
        System.out.println(Arrays.toString(leastNumbers));
    }
}