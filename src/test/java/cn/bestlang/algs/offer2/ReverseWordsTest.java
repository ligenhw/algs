package cn.bestlang.algs.offer2;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ReverseWordsTest {

    @Test
    void reverseWords() {
        String s = "a good   example";
        System.out.println(new ReverseWords().reverseWords(s));
    }
}