package cn.bestlang.algs.offer2;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class GetLeastNumbersTest {

    @Test
    void getLeastNumbers() {
        int[] arr = {4,5,1,6,2,7,3,8};
        int k = 4;
        int[] leastNumbers = new GetLeastNumbers().getLeastNumbers(arr, k);
        System.out.println(Arrays.toString(leastNumbers));
    }

    @Test
    void getLeastNumbers2() {
        int[] arr = {3, 2, 1};
        int k = 2;
        int[] leastNumbers = new GetLeastNumbers().getLeastNumbers(arr, k);
        System.out.println(Arrays.toString(leastNumbers));
    }

    @Test
    void getLeastNumbers3() {
        int[] arr = {};
        int k = 0;
        int[] leastNumbers = new GetLeastNumbers().getLeastNumbers(arr, k);
        System.out.println(Arrays.toString(leastNumbers));
    }

    @Test
    void getLeastNumbers4() {
        int[] arr = {0,0,0,2,0,5};
        int k = 0;
        int[] leastNumbers = new GetLeastNumbers().getLeastNumbers(arr, k);
        System.out.println(Arrays.toString(leastNumbers));
    }

    @Test
    void getLeastNumbers5() {
        int[] arr = {0,0,1,2,4,2,2,3,1,4};
        int k = 8;
        int[] leastNumbers = new GetLeastNumbers().getLeastNumbers(arr, k);
        System.out.println(Arrays.toString(leastNumbers));
    }

    @Test
    void partition() {
        int[] arr = {4,5,1,6,2,7,3,8};
        int partition = new GetLeastNumbers().partition(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
        System.out.println("partition : " + partition);
    }
}