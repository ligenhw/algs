package cn.bestlang.algs.leetcode;

import java.util.ArrayList;
import java.util.List;

public class SequentialDigits {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> result = new ArrayList<>();
        int lowN = getN(low);
        int highN = getN(high);

        for (int i = lowN; i <= highN; i++) {
            int size = 9 - i;
            for (int j = 1; j <= size + 1; j++) {
                int seq = getSeq(i, j);
                if (i == lowN && seq < low) {
                    continue;
                }
                if (i == highN && seq > high) {
                    break;
                }
                result.add(seq);
            }

        }

        return result;
    }

    private int getN(int num) {
        int i = 0;
        while (num != 0) {
            i++;
            num /= 10;
        }

        return i;
    }

    private int getSeq(int n, int start) {
        int seq = 0;
        for (int i = 0; i < n; i++) {
            seq *= 10;
            seq += start;
            start++;
        }

        return seq;
    }
}
