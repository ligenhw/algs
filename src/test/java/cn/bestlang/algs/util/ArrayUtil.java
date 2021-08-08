package cn.bestlang.algs.util;

import org.junit.jupiter.api.Test;

public class ArrayUtil {

    @Test
    public void convertToArray() {
        String s = "[[15,13,2,5],[14,3,4,1],[12,6,8,9],[16,7,10,11]]";
        s = s.replace("[", "{");
        s = s.replace("]", "}");
        s = s.replace("\n", "");

        System.out.println(s);
    }
}
