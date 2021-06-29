package cn.bestlang.algs.util;

import org.junit.jupiter.api.Test;

public class ArrayUtil {

    @Test
    public void convertToArray() {
        String s = "[[1,2,3,4],[5,6,7,8],[9,10,11,12]]";
        s = s.replace("[", "{");
        s = s.replace("]", "}");
        s = s.replace("\n", "");

        System.out.println(s);
    }
}
