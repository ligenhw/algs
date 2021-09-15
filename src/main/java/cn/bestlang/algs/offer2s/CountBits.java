package cn.bestlang.algs.offer2s;

public class CountBits {
    public int[] countBits(int n) {
        int[] result = new int[n + 1];

        result[0] = 0;
        if (n == 0) {
            return result;
        }
        result[1] = 1;

        int current = 0;
        int size = 2;
        int i = 2;
        while (i <= n) {
            int leftSize = size;
            current = 0;
            while (leftSize-- > 0 && i <= n) {
                result[i++] = result[current++] + 1;
            }
            size *= 2;
        }

        return result;
    }
}
