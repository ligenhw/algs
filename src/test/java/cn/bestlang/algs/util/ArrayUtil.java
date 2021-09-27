package cn.bestlang.algs.util;

import org.junit.jupiter.api.Test;

public class ArrayUtil {

    @Test
    public void convertToArray() {
        String s = "[[\"a\",\"a\",\"b\",\"a\",\"a\",\"b\"],[\"a\",\"a\",\"b\",\"b\",\"b\",\"a\"],[\"a\",\"a\",\"a\",\"a\",\"b\",\"a\"],[\"b\",\"a\",\"b\",\"b\",\"a\",\"b\"],[\"a\",\"b\",\"b\",\"a\",\"b\",\"a\"],[\"b\",\"a\",\"a\",\"a\",\"a\",\"b\"]]";
        s = s.replace("[", "{");
        s = s.replace("]", "}");
        s = s.replace("\n", "");

        System.out.println(s);
    }
}
