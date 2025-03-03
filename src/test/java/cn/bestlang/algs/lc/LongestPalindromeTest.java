package cn.bestlang.algs.lc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestPalindromeTest {

    @Test
    void longestPalindrome() {
        String s = "babad";
        String s1 = new LongestPalindrome().longestPalindrome(s);
        System.out.println(s1);
    }

    @Test
    void longestPalindrome2() {
        String s = "cbbd";
        String s1 = new LongestPalindrome().longestPalindrome(s);
        System.out.println(s1);
    }

    @Test
    void longestPalindrome3() {
        String s = "a";
        String s1 = new LongestPalindrome().longestPalindrome(s);
        System.out.println(s1);
    }
}