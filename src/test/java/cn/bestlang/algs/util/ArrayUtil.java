package cn.bestlang.algs.util;

import org.junit.jupiter.api.Test;

public class ArrayUtil {

    @Test
    public void convertToArray() {
        String s = "[[\"A\",\"B\",\"C\",\"E\"],[\"S\",\"F\",\"C\",\"S\"],[\"A\",\"D\",\"E\",\"E\"]]";
        s = s.replace("[", "{");
        s = s.replace("]", "}");
        s = s.replace("\n", "");

        System.out.println(s);
    }
}
