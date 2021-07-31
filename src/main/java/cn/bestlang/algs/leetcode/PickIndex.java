package cn.bestlang.algs.leetcode;

import java.util.Random;

public class PickIndex {
    private int sum;
    private int[] index;
    private Random random = new Random();

    public PickIndex(int[] w) {
        index = new int[w.length];
        int i = 0;
        for (int n : w) {
            index[i++] = sum;
            sum += n;
        }
    }

    public int pickIndex() {
        int idx = random.nextInt(sum);
        int rank = rank(0, index.length - 1, idx);
        return rank;
    }

    private int rank(int left, int right, int key) {
        if (left > right) {
            return right;
        }
        int mid = (left + right) / 2;
        if (index[mid] > key) {
            return rank(left, mid - 1, key);
        } else if (index[mid] < key) {
            return rank(mid + 1, right, key);
        } else {
            return mid;
        }
    }
}
