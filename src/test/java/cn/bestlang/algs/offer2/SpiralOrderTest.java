package cn.bestlang.algs.offer2;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SpiralOrderTest {

    @Test
    void spiralOrder() {
        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        int[] result = new SpiralOrder().spiralOrder(matrix);
        System.out.println(Arrays.toString(result));
    }

    @Test
    void spiralOrder2() {
        int[][] matrix = {};
        int[] result = new SpiralOrder().spiralOrder(matrix);
        System.out.println(Arrays.toString(result));
    }
}