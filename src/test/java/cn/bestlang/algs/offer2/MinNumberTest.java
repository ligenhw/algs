package cn.bestlang.algs.offer2;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MinNumberTest {

    @Test
    void minNumber() {
        int[] nums = {3,30,34,5,9};
        String expected = "3033459";

        assertEquals(expected, new MinNumber().minNumber(nums));
    }

    @Test
    void minNumber2() {
        int[] nums = {10, 2};
        String expected = "102";

        assertEquals(expected, new MinNumber().minNumber(nums));
    }

    @Test
    void minNumber3() {
        int[] nums = {824,938,1399,5607,6973,5703,9609,4398,8247};
                         //"1399439856075703697382482479389609"
        String expected = "1399439856075703697382478249389609";

        assertEquals(expected, new MinNumber().minNumber(nums));
    }

    @Test
    void minNumber4() {
        int[] nums = {12,121};
        String expected = "12112";

        assertEquals(expected, new MinNumber().minNumber(nums));
    }

    @Test
    void minNumber5() {
        int[] nums = {1,1,1};
        String expected = "111";

        assertEquals(expected, new MinNumber().minNumber(nums));
    }

    @Test
    void myComparator() {
        String[] strings = new String[]{"12", "121"};
        Arrays.sort(strings, new MinNumber.MyComparator());
        System.out.println(Arrays.toString(strings));
    }
}