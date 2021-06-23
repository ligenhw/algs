package cn.bestlang.algs.offer2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindRepeatNumberTest {

    @Test
    void findRepeatNumber() {
        int[] nums = new int[] {2, 3, 1, 0, 2, 5, 3};
        int repeatNumber = new FindRepeatNumber().findRepeatNumber(nums);

        assertTrue(repeatNumber == 2 || repeatNumber == 3);
    }
}