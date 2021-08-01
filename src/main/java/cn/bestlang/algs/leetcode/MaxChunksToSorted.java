package cn.bestlang.algs.leetcode;

public class MaxChunksToSorted {
    public int maxChunksToSorted(int[] arr) {
        int len = arr.length;
        int count = 0;
        int max = 0;
        for (int i = 0; i < len; i++) {
            max = Math.max(max, arr[i]);
            if (i == max) {
                count++;
            }
        }

        return count;
    }
}
