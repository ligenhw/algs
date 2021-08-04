package cn.bestlang.algs.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LetterCombinationsTest {

    @Test
    void letterCombinations() {
        String digits = "23";
        System.out.println(new LetterCombinations().letterCombinations(digits));
    }

    @Test
    void letterCombinations2() {
        String digits = "";

        System.out.println(new LetterCombinations().letterCombinations(digits));
    }
}