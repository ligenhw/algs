package cn.bestlang.algs.util;

import org.junit.jupiter.api.Test;

public class ArrayUtil {

    @Test
    public void convertToArray() {
        String s = "[\n" +
                "  [1,3,1],\n" +
                "  [1,5,1],\n" +
                "  [4,2,1]\n" +
                "]";
        s = s.replace("[", "{");
        s = s.replace("]", "}");
        s = s.replace("\n", "");

        System.out.println(s);
    }
}
