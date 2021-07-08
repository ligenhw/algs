package cn.bestlang.algs.offer2;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class FindContinuousSequenceTest {

    @Test
    void findContinuousSequence() {
        int target = 9;
        int[][] expected = {{2,3,4}, {4,5}};
        int[][] continuousSequence = new FindContinuousSequence().findContinuousSequence(target);
        assertArrayEquals(expected, continuousSequence);
    }

    @Test
    void findContinuousSequence2() {
        int target = 15;
        int[][] expected = {{1,2,3,4,5}, {4,5,6}, {7, 8}};
        int[][] continuousSequence = new FindContinuousSequence().findContinuousSequence(target);
        assertArrayEquals(expected, continuousSequence);
    }
}