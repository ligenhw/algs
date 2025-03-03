package cn.bestlang.algs.lc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConvertTest {

    @Test
    void convert() {
        char[] chars = new char[1];
        System.out.println(chars[0] == 0);
    }

    @Test
    void columeSize() {
        int size = new Convert().columeSize(11, 4);
        System.out.println(size);
    }

    @Test
    void columeSize2() {
        String s = "PAYPALISHIRING";
        int numRows = 4;

        int size = new Convert().columeSize(s.length(), numRows);
        System.out.println(size);
    }

    @Test
    void columeSize3() {
        String s = "PAYPALISHIRING";
        int numRows = 3;

        int size = new Convert().columeSize(s.length(), numRows);
        System.out.println(size);
    }

    @Test
    void testConvert() {
        String s = "A";
        int numRows = 1;

        String result = new Convert().convert(s, numRows);
        System.out.println(result);
    }

    @Test
    void testConvert2() {
        String s = "PAYPALISHIRING";
        int numRows = 4;

        String result = new Convert().convert(s, numRows);
        System.out.println(result);
        //PINALSIGYAHRPI
        //PINALSIGYAHRPI
    }
}