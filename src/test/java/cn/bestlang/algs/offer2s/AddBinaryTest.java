package cn.bestlang.algs.offer2s;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddBinaryTest {

    @Test
    void addBinary() {
        String s = new AddBinary().addBinary("11", "10");

        System.out.println(s);
    }
}