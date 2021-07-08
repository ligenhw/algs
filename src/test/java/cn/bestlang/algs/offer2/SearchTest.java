package cn.bestlang.algs.offer2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchTest {

    @Test
    void search() {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        int expectd = 2;
        assertEquals(expectd, new Search().search(nums, target));
    }

    @Test
    void search2() {
        int[] nums = {};
        int target = 0;
        int expectd = 0;
        assertEquals(expectd, new Search().search(nums, target));
    }
}