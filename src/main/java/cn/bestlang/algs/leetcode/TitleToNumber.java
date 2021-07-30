package cn.bestlang.algs.leetcode;

public class TitleToNumber {
    public int titleToNumber(String columnTitle) {
        char[] chars = columnTitle.toCharArray();
        int num = 0;
        for (char c : chars) {
            num *= 26;
            num += toNum(c);
        }

        return num;
    }

    private int toNum(char c) {
        return c - 'A' + 1;
    }
}
